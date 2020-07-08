package br.com.escola.poo;
import java.util.Scanner;
public class ProgramaEscolar {

public static void main(String[] args) {
		
		String opcao;
		Mensagens msg = new Mensagens();
		Pessoa p1 = new Pessoa();
		
		Scanner in = new Scanner(System.in);
		msg.mensagem_inicial();
		
		msg.selecionar_cadastro();
		opcao= in.nextLine();
		
		String f,n,email,matricula,curso;
		int ano;
		
		
		
		
		
		switch(opcao) {
		
			case "1" :
				
				msg.informar_nome();
				n = in.nextLine();
				
				do {
					msg.informar_ano_nascimento();		
					ano =Integer.parseInt(in.nextLine());
					p1.setAnoNacimento(ano);
				}while (p1.getAnoNascimento() <= 0);

				
				msg.informar_email();
				email = in.nextLine();
				
				msg.informar_matricula();
				matricula = in.nextLine();
				
				msg.informar_curso();
				curso = in.nextLine();
				
				Aluno p = new Aluno(n,email,ano,matricula,curso);
				System.out.println(p.exibir_pessoa());
				
				break;
				
				
			case "2":
				msg.informar_funcao();
				f = in.nextLine();
				
				msg.informar_nome();
				n = in.nextLine();
				
				do {
					msg.informar_ano_nascimento();		
					ano =Integer.parseInt(in.nextLine());
					p1.setAnoNacimento(ano);
				}while (p1.getAnoNascimento() <= 0);
				
				msg.informar_email();
				email = in.nextLine();
				Funcionarios funcionarios = new Funcionarios(f,n,ano,email);
				System.out.println(funcionarios.exibir_pessoa());;
				
				break;
		}
	 in.close();
	}


}
