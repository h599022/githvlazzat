package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveB4revised {

	public static void main(String[] args) {
		

		String brutoTxt = showInputDialog("Skriv in brutopenger");
		int bruto = Integer.parseInt(brutoTxt);
		int skatt = 0;

		if (bruto <= 164100) {
			skatt = 0;
		} else if (bruto >= 164100 && bruto <= 230950) {

			skatt = (int) (bruto * 0.0093);
		} else if (bruto >= 230950 && bruto <= 580650) {
			skatt = (int) (bruto * 0.0241);
		} else if (bruto >= 580651 && bruto <= 934050) {
			skatt = (int) (bruto * 0.1152);
		} else if (bruto > 934050) {
			skatt = (int) (bruto * 0.1452);

		}
		System.out.println(" Ditt bruto er " + bruto);
		System.out.println(" Du skatter " + skatt);

	}

}
