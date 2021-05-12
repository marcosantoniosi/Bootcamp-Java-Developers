package Aula;



import java.util.Scanner;

public class TestaCarro {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
		Carro carro;
		carro = new Carro();
		carro.velocidadeAtual = 0;
		carro.velocidadeMaxima = 80;
		carro.cor= "azul";
		carro.modelo = "Fusca";
				
		
		
		
		System.out.println("digite sua velocidade");
		double quantidade = scan.nextDouble();
		
		
		
		carro.Ligar();
		
		
		carro.Acelera(quantidade);
		System.out.println(carro.velocidadeAtual + " Km/H ");
		
		
		carro.pegaMarcha();
		System.out.println("esta na marcha" + carro.pegaMarcha());
		
		System.out.println("Seu carro da cor " + carro.cor + " modelo " + carro.modelo + " esta na marcha " + carro.pegaMarcha());;
	
	    System.out.println("A velocidade maxima é " +  carro.velocidadeMaxima);
	}

}
