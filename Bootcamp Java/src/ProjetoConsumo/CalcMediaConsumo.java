package ProjetoConsumo;
import java.util.Scanner;

public class CalcMediaConsumo {

	Scanner sc = new Scanner(System.in);

	double distancia, litros, media;

	void km() {

		System.out.println("Quantos Km voc� dirigiu?");
		distancia = sc.nextDouble();

	}

	void distancia() {
		System.out.println("Quantos Litros voc� abasteu?");
		litros = sc.nextDouble();

	}

	void calculo() {
		media = distancia / litros;

	}

	void responta() {
		System.out.printf("Voc� fez a media de: " +  "%.2f" + " Km/L", media);
	
	}

}