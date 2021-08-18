package com.java.poo.javapoo.application.controller;

import com.java.poo.javapoo.domain.enums.Departamento;
import com.java.poo.javapoo.domain.enums.TempoDeCasa;
import com.java.poo.javapoo.domain.funcionario.Funcionario;
import com.java.poo.javapoo.domain.funcionario.model.Administrador;
import com.java.poo.javapoo.domain.funcionario.model.Gerente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/funcionarios")
public class FuncionarioController {

    private static List<Funcionario> dbFuncionarios = new ArrayList<>();
    static{
        dbFuncionarios.add(new Administrador("JOAO ALMEIDA", BigDecimal.valueOf(3000.00), Departamento.ADMINISTRATIVO, TempoDeCasa.DOIS_ANOS_OU_MAIS));
        dbFuncionarios.add(new Gerente("JOAO ALMEIDA", BigDecimal.valueOf(3000.00), Departamento.GERENCIA, TempoDeCasa.DOIS_ANOS_OU_MAIS));
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
}
