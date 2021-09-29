package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveB2speedrun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prisTxt = showInputDialog("Skriv in pris");
		int pris = Integer.parseInt(prisTxt);

		String beløpTxt = showInputDialog("Skriv in beløp");
		int beløp = Integer.parseInt(beløpTxt);


		int tier = 0;
		int einer = 0;

		if (beløp < pris) {
			System.out.println(" Feil ikke beløp er ikke høgt nok");

		}
		int sum = beløp - pris;

		while (sum > 0) {
			if (sum % 10 == 0) {
				sum = sum - 10;
				tier++;
			} else {
				sum = sum - 1;
				einer++;
			}
		}

		System.out.println(tier);
		System.out.println(einer);

	}

}
