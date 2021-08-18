package com.java.poo.javapoo.application.gatway;

import com.java.poo.javapoo.application.repository.FuncionarioRepository;
import com.java.poo.javapoo.domain.funcionario.Funcionario;
import com.java.poo.javapoo.domain.funcionario.usecase.obter_aumento_salarial.BaseRequest;
import com.java.poo.javapoo.domain.gatway.FuncionarioGatway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class FuncionarioGatwayImplements implements FuncionarioGatway {
    @Autowired
    FuncionarioRepository repository;

    @Override
    public Funcionario obter(BaseRequest request) {
        Optional<Funcionario> funcionario = repository.findById(request.getId());
        return funcionario.orElseThrow(IllegalArgumentException::new);
    }
}
