package Aula;


import java.util.Scanner;

public class Telefone {
public static void main(String[] args) {
		
	Scanner scan= new Scanner (System.in);
	int contador = 0;
	System.out.println("digite seu numero");
	String numero= scan.nextLine();
	while (contador < 5) {
	System.out.println(numero);
	contador++;
	
	
	}
	
	 contador = 0;
    System.out.println("digite seu texto");
	String texto = scan.next();
	
	while (contador < 5) {
	System.out.println(texto);
	contador++;
	
	
	}

	}


}
