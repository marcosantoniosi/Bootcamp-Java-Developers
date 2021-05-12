package Aula;

import java.util.Scanner;

public class exercicioFor {
	
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	int num[] = new int[3];// declarando um vetor de 3 posicoes
	int i;
	int maior = 0;
	int menor = 10000;
	
	
	
	
	for(i=0; i<3; i++){

		System.out.println("Digite um numero");
		num[i] = scan.nextInt();
		// Grava o Maior Valor de num[i] em maior
		if (num[i] > maior) {
			maior = num[i];

		}

		// Grava o Menor Valor de num[i] em menor
		if (num[i] < menor) {
			menor = num[i];
		}
	}

			System.out.println("o maior é " + maior);
			System.out.print("o menor e:  " + menor);

		}
	}



