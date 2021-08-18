package com.java.poo.javapoo.application.controller;

import com.java.poo.javapoo.application.gatway.FuncionarioGatwayImplements;
import com.java.poo.javapoo.application.repository.FuncionarioRepository;
import com.java.poo.javapoo.domain.enums.Departamento;
import com.java.poo.javapoo.domain.enums.TempoDeCasa;
import com.java.poo.javapoo.domain.funcionario.Funcionario;
import com.java.poo.javapoo.domain.funcionario.model.Administrador;
import com.java.poo.javapoo.domain.funcionario.model.Gerente;
import com.java.poo.javapoo.domain.funcionario.usecase.obter_aumento_salarial.BaseRequest;
import com.java.poo.javapoo.domain.gatway.FuncionarioGatway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioGatwayImplements gatway;

    private static List<Funcionario> dbFuncionarios = new ArrayList<>();
    static{
        dbFuncionarios.add(new Administrador(1l,"JOAO ALMEIDA", BigDecimal.valueOf(3000.00), Departamento.ADMINISTRATIVO, TempoDeCasa.DOIS_ANOS_OU_MAIS));
        dbFuncionarios.add(new Gerente(2l,"JOAO ALMEIDA", BigDecimal.valueOf(3000.00), Departamento.GERENCIA, TempoDeCasa.DOIS_ANOS_OU_MAIS));
    }

    @GetMapping
    public List<Funcionario> listarFuncionario() {
        return dbFuncionarios;
    }

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody Funcionario funcionario) {
        dbFuncionarios.add( (Administrador)funcionario);
        return ResponseEntity.ok().body(dbFuncionarios.get(0));
    }

    @GetMapping(path = {"id"})
    public ResponseEntity<Funcionario> obter(@PathVariable Long id){
        var base = BaseRequest.builder().id(id).build();
        return ResponseEntity.ok().body(gatway.obter(base));
    }
}
