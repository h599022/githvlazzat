package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveB4Iamspeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String brutoTxt = showInputDialog("Skriv in brutopenger");
		int bruto = Integer.parseInt(brutoTxt);
	    int skatt;

		 if (bruto <= 164100) {
			 skatt = 0;
		 }
		 else if (bruto >= 164100 && bruto <= 230950);
		
		     (bruto >= 164100 && bruto <= 230950);
		    skatt = bruto * 0.0093;
		    break;
		case 3: 
			(bruto >= 230950 && bruto <= 580650);
			skatt = bruto * 0.0241;
			break;
		case 4: 
			(bruto >= 580651 && bruto <= 934050);
			skatt = bruto * 0.1152;
			break;
		default:
			(bruto > 934 050);
			skatt = bruto *0.1452;
			
		
			
		}
		System.out.println(" Ditt bruto er " + bruto);
		System.out.println(" Du skatter "+ skatt);
		      
		
	}

}
package no.hvl.dat100;

public class skattfailoppgaveb4 {

}
