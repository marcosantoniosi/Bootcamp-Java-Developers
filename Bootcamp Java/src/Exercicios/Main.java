package Aula;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("Ana" , "999.866.987-76", "03/07/1992","93388");
		System.out.println("o nome � do aluno �: " + aluno.nome);
		System.out.println("o cpf � " + aluno.cpf);
		System.out.println("data de nascimento � " + aluno.dataDeNascimento.toString());
		System.out.println(" a matricula � " + aluno.matricula);
		
		System.out.println("---------------------------");
		
		Funcionario func = new Funcionario("Carla" , "234.836.667-76", "09/09/1987","238,00", "professor");
		System.out.println("o nome do funcionario �: " + func.nome);
		System.out.println("o cpf �: " + func.cpf); 
		System.out.println("data de nascimento �: " + func.dataDeNascimento.toString());
		System.out.println("o salario �: " + func.salario);
		System.out.println("o cargo �: " + func.cargo);
		System.out.println("---------------------------");
		
		Professor prof = new Professor("Luiz" , "234.836.667-73", "06/09/1993", "matematica");
		System.out.println("o nome do professor �:  " + prof.nome);
		System.out.println("o cpf � : " + prof.cpf); 
		System.out.println("data de nascimento �: " + prof.dataDeNascimento.toString());
		System.out.println("o salario � : " + prof.disciplina);
		
		
	}
	
}

