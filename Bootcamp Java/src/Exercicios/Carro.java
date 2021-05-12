package Aula;

public class Carro {

	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	

	public void Ligar() {
		System.out.println("o Carro esta ligado");

	}

	public void Acelera(double quantidade) {
		double velocidadeAtualizada = velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeAtualizada;

	}

	int pegaMarcha() {
		if(this.velocidadeAtual < 0) {
			return -1;
		}
	    if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
			return 1;
	}

		else if(this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			
		return 2;
		} else
		{
		return 3;
	}
		
		}
}

