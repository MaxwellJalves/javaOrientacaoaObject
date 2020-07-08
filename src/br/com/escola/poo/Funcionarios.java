package br.com.escola.poo;

public class Funcionarios extends Pessoa {
	
	String funcao;
	
	
	public Funcionarios(String funcao, String nome,int ano, String email) {
		super(nome,ano,email);
		this.funcao = funcao;
	}
	
	public String getFuncao() {
		return this.funcao;
	}
	
	public String setFuncao(String funcao) {
		return this.funcao = funcao;
	}


	
	public String exibir_pessoa() {
		return "Funcionario : " + super.exibir_pessoa() + "Função :"+ this.getFuncao();
	}
}
