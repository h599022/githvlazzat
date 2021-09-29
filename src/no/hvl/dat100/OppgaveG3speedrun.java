package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
public class OppgaveG3speedrun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tallTxt = showInputDialog(" Skriv inn tall a");
		int a = Integer.parseInt(tallTxt);
		String tall2Txt = showInputDialog(" Skriv inn tall b");
		int b = Integer.parseInt(tall2Txt);
		int c;
	
		if (b > 0) {
			c = a/b;
			System.out.println("svaret er " + c);
		}
		else {
			System.out.println("Feil pga negativ tall ");
		}

	}
	
	

}
