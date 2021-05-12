package Aula;

import java.util.Scanner;

public class Leitor {
	
	public static void main (String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("digite seu nome");
		String nome = scan.next();
		System.out.println("Qual sua idade?");
		int idade = scan.nextInt();
		System.out.println("Seu nome é " + nome + " sua idade é " + idade);
		
		scan.close();
	}
}
 