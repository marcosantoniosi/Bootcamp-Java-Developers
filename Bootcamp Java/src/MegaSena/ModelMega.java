package MegaSena;

import java.util.Scanner;

public class ModelMega {

	Scanner sc = new Scanner(System.in);
	String iniciais;
	int posi = 0;

	public void conveter(String nn) {
		iniciais = nn.substring(0, 1) + ". ";
		posi = nn.lastIndexOf(' ');

		for (int i = 0; i < posi; i++) {
			if (nn.charAt(i) == ' ') {
				iniciais += nn.substring(i + 1, i + 2) + ". ";

			}
		}

		System.out.println(nn.substring(posi + 1, nn.length()).toUpperCase() + ", " + iniciais.toUpperCase());
	}

}