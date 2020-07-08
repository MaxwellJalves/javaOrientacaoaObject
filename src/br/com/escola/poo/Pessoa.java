package br.com.escola.poo;

public class Pessoa {


	private String nome;
	private int ano_nascimento;
	private String email;
	
	public Pessoa() {}
	public Pessoa (String nome, int ano, String email) {
		
		this.nome = nome;
		this.ano_nascimento = ano;
		this.email = email;
	}
	
	public  String getNome() {
		return this.nome;
	}
	
	public String setNome(String nome) {
		return this.nome = nome;
	}
		
	public int getAnoNascimento() {
		
		return this.ano_nascimento;
	}
	
	public int setAnoNacimento(int ano) {
		if (ano > 2020 || ano <= 1920) {
			System.out.println("OPS ! VALIDE A IDADE DIGITADA");
			return this.ano_nascimento = 0 ;
		} else {
			
			return this.ano_nascimento = ano;
			
		}
		
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String setEmail(String email) {
		return this.email = email;
	}
	public String exibir_pessoa() {
		return    this.getNome().toUpperCase() + " \nE-mail : " + this.getEmail().toUpperCase() +"" + this.getAnoNascimento() ;
	}
}
