package Aula;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int menor;
		int maior;

		System.out.println("Digite o primeiro numero");
		int num1 = scan.nextInt();
		System.out.println("Digite o primeiro segundo numero");
		int num2= scan.nextInt();
		System.out.println("Digite o primeiro terceiro numero");
		int num3 = scan.nextInt();

		if (num3 > num2 && num3 > num1) {
			maior = num3;
		

		} else if (num2 > num1 && num2 > num3) {
			maior = num2;
			
		}else {
			maior = num1;

		}
		if (num3 < num2 && num3< num1) {
			menor = num3;
			

		} else if (num2<num1 && num2< num3) {
			menor = num2;
			
		}else {
			menor = num1;
		}
			System.out.println("numero maior " + maior + " numero menor " +menor);
			
			
	
}
	}
