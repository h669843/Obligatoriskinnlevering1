package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppgave2 {

public static void main (String[] args)	{
	for (int studantall = 1; studantall <=10; studantall++) {
	String tallTxt = showInputDialog("Oppgi poengsum: ");
	int tall = parseInt(tallTxt);		
	String karakter = "Ugyldig poengsum";  

	if (tall >= 0 && tall <= 39) {
		karakter = "F";
		showMessageDialog(null,"Du har fått karakter : " +karakter);
		
	} else if (tall >= 40 && tall <= 49) {
			karakter = "E";
		showMessageDialog(null,"Du har fått karakter : " +karakter);
		
	} else if (tall >= 50 && tall <= 59) {
		karakter = "D";
		showMessageDialog(null,"Du har fått karakter : " +karakter);	
	
	} else if (tall >= 60 && tall <= 79) {
		karakter = "C";
		showMessageDialog(null,"Du har fått karakter : " +karakter);
	
	} else if (tall >= 80 && tall <= 89) {
		karakter = "B";
		showMessageDialog(null,"Du har fått karakter : " +karakter);	
		
	} else if (tall >= 90 && tall <= 100) {
		karakter = "A";
		showMessageDialog(null,"Du har fått karakter : " +karakter);	

	} else {
		showMessageDialog(null, karakter); 
		studantall = studantall-1; 
	}
	}
	}
}
