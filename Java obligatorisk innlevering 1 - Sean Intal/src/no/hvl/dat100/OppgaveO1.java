	//Oppgave B4 fra lab 2
package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO1 {

	public static void main(String[] args) {
		 {
	            double skatt =0;
	            int inntekt = parseInt(showInputDialog("Bruttoinntekt: "));
	            
	            if (inntekt<=190349) {
	                skatt=0;
	            }
	            else if (inntekt>=190350 && inntekt<=267899) {
	                skatt=inntekt*(1- 0.017);
	            }
	            else if (inntekt>=267900 && inntekt<=643799) {
	                skatt=inntekt*(1- 0.04);
	            }
	            else if (inntekt>=643800 && inntekt<=969199) {
	                skatt=inntekt*(1- 0.134);
	            }
	            else if (inntekt>=969200 && inntekt<=1999999) {
	                skatt=inntekt*(1- 0.164);
	            }
	        showMessageDialog(null,": " + skatt);
	        }
	        

	}
	
}