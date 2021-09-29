
package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveB3speedrun {

	public static void main(String[] args) {
		
		String brukernavn = showInputDialog("Brukernavn :");

		String passord = showInputDialog("Passord :");
		
		String Rbrukernavn = "Azzat";
		String Rpassord= "224559";
		
		if ( brukernavn.equals(Rbrukernavn) && passord.equals(Rpassord )) {
			System.out.println(brukernavn);
			System.out.println(passord);
			System.out.println("riktig!" + " Velkommen " + brukernavn);
			
		}
		else {
			System.out.println( "feil brukernavn eller passord");
		}

	}

}