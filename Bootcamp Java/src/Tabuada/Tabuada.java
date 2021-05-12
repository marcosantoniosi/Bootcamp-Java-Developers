package Tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Informe um número");
		int num = sc.nextInt();
		int tabuada = 0;
		       
		if (num >=0)
		for (int i = 0; i < 11; i++) {
            tabuada = num * i;
            System.out.println("A tabuada do: " + num +" * " + i + " = " + tabuada);
        }
		else {
	    	System.out.println("Tabuada Invalida");
	    }
		sc.close();
		        }
	
 
	}