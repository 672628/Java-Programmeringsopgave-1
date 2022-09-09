package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO3 {

    
    public static void main(String[] args) {
    	int heltall = parseInt(showInputDialog("Skriv inn et tall: "));
        for (int i = 0; i < heltall; i++) {
            System.out.println(i + "! = " + fakultet(i));
        }

	}

    public static int fakultet(int n) {
    	if (n == 0) {
    		return 1;
    	}
    	return n * fakultet(n - 1);
    }
}
