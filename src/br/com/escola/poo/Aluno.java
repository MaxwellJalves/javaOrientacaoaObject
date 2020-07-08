package br.com.escola.poo;

public class Aluno extends Pessoa {

	private String matricula;
	private String curso;
	

	public Aluno (String nome, String email ,int ano, String matricula, String curso) {
		    super(nome,ano,email);
		   
		   this.matricula = matricula;
		   this.curso = curso;
		    
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public String setMatricula(String matricula) {
		return this.matricula = matricula;	
	}
	
	public String getCurso() {
		return this.curso;
	}
	
	public String setCurso(String curso) {
		return this.curso = curso;
	}
	
	public String exibir_pessoa() {
		return  "Aluno:" + super.exibir_pessoa() +"\n" +"Matricula : "+this.getMatricula().toUpperCase()+ "\nCurso: " + this.getCurso().toUpperCase();
	}
}
