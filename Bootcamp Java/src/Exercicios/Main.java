package Aula;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("Ana" , "999.866.987-76", "03/07/1992","93388");
		System.out.println("o nome é do aluno é: " + aluno.nome);
		System.out.println("o cpf é " + aluno.cpf);
		System.out.println("data de nascimento é " + aluno.dataDeNascimento.toString());
		System.out.println(" a matricula é " + aluno.matricula);
		
		System.out.println("---------------------------");
		
		Funcionario func = new Funcionario("Carla" , "234.836.667-76", "09/09/1987","238,00", "professor");
		System.out.println("o nome do funcionario é: " + func.nome);
		System.out.println("o cpf é: " + func.cpf); 
		System.out.println("data de nascimento é: " + func.dataDeNascimento.toString());
		System.out.println("o salario é: " + func.salario);
		System.out.println("o cargo é: " + func.cargo);
		System.out.println("---------------------------");
		
		Professor prof = new Professor("Luiz" , "234.836.667-73", "06/09/1993", "matematica");
		System.out.println("o nome do professor é:  " + prof.nome);
		System.out.println("o cpf é : " + prof.cpf); 
		System.out.println("data de nascimento é: " + prof.dataDeNascimento.toString());
		System.out.println("o salario é : " + prof.disciplina);
		
		
	}
	
}

