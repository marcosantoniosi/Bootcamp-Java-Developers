package Aula;

import java.util.Date;

public class Funcionario extends Pessoa {
	public String salario;
	public String cargo;
	
	
	public Funcionario(String nome, String cpf, String dataDeNascimento, String salario, String cargo) {
		super(nome, cpf, dataDeNascimento);
		this.salario = salario;
		this.cargo = cargo;
	}
	
	
	

}
