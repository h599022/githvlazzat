package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OPPGAVEB5 {

	public static void main(String[] args) {

		for (int antall = 0; antall < 10; antall++) {

				String tallTxt = showInputDialog("Skriv inn poengsumm");
				int tall1 = Integer.parseInt(tallTxt);
				if (tall1 > 100 || tall1 < 0) {
	            	   antall= antall -2 ; 
	                System.out.println("Ugyldig tall");

                 
				} else if (tall1 < 89 && tall1 > 80) {
					System.out.println(" Karakter er B ");
				} else if (tall1 < 79 && tall1 > 60) {
					System.out.println(" Karakter er C ");
				} else if (tall1 < 59 && tall1 > 50) {
					System.out.println(" Karakter er D ");
				} else if (tall1 < 49 && tall1 > 40) {
					System.out.println(" Karakter er E ");
				} else
					System.out.println(" Karakter er F ");
			}
		}

	}

