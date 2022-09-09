	//Oppgave B5 fra lab 2
package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO2 {

	public static void main(String[] args) {
		
		for (int i = 1; i <=10; i++) {
		int poeng = parseInt(showInputDialog("Sett inn poeng: "));
		String karakter = "";
		
		
		
		if (poeng<0 || poeng>100) {
		poeng =	parseInt(showInputDialog(null, "Ugyldig, Skriv inn på nytt: ")); 
		}
		
		if (poeng >= 0 && poeng <= 39) {
            karakter = "F";
        } else if (poeng >=40 && poeng <= 49) {
            karakter = "E";
        } else if (poeng >=50 && poeng <= 59) {
            karakter = "D";
        } else if (poeng >=60 && poeng<= 79) {
            karakter = "C";
        } else if (poeng >=80 && poeng<= 89) {
            karakter = "B";
        } else if (poeng >=90 && poeng<= 100) {
            karakter = "A";
        }     
        
        
        showMessageDialog(null, "Karakter : " + karakter);
        
}
}
}