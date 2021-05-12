package Excecoes;

public class Programa {

	public static void main(String[] args) {


		Tipo1 tipo = new Tipo1();
		
		try
		{
			try
			{
			  System.out.println(tipo.frase);
			}
			catch(NullPointerException  e) {
				System.out.println(e.getLocalizedMessage());
				
			}
			
		}
		finally {
			System.out.println(tipo.frase.toUpperCase());
			  // bloco de c�digo que sempre ser� executado ap�s
			  // o bloco try, independentemente de sua conclus�o
			  // ter ocorrido normalmente ou ter sido interrompida
			}
		}
		}