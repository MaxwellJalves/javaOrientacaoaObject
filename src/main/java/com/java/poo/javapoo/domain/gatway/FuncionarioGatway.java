package com.java.poo.javapoo.domain.gatway;

import com.java.poo.javapoo.application.repository.FuncionarioRepository;
import com.java.poo.javapoo.domain.funcionario.Funcionario;
import com.java.poo.javapoo.domain.funcionario.usecase.obter_aumento_salarial.BaseRequest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public interface FuncionarioGatway {

    Funcionario obter(BaseRequest request);
}
