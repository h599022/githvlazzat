package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveB2speedrun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prisTxt = showInputDialog("Skriv in pris");
		int pris = Integer.parseInt(prisTxt);

		String bel�pTxt = showInputDialog("Skriv in bel�p");
		int bel�p = Integer.parseInt(bel�pTxt);


		int tier = 0;
		int einer = 0;

		if (bel�p < pris) {
			System.out.println(" Feil ikke bel�p er ikke h�gt nok");

		}
		int sum = bel�p - pris;

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
