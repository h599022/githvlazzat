package no.hvl.dat100;
import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;
public class OppgaveB1speedrun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String radiusTxt = showInputDialog("Skriv inn radius p� spheren");
	double radius = Integer.parseInt(radiusTxt);
	
	double volume = 4*Math.PI*radius*radius*radius/3; // formellen p� volummet
	  System.out.println ("Volumet er " + volume );
	

	}

}
