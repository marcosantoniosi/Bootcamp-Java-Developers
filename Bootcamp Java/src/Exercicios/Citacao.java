package Aula;
import java.util.Scanner;

public class Citacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 Citacao cit = new  Citacao ();
		 String nome = "", resp = "S";
		 
		 while (resp.equals("S")) {
			 System.out.println("Digite seu nome: ");
			 nome = sc.nextLine();
			 
			 cit.conveter(nome);
			 
			 System.out.println("Gostaria de digitar outro nome? S-Sim  ou  N-Não");
			 resp = sc.nextLine().toUpperCase();
			 
			
		 }

		 System.out.println("Programa Encerrado!");
		 sc.close();
	}

	private void conveter(String nome) {
		// TODO Auto-generated method stub
		
	}
}

	
