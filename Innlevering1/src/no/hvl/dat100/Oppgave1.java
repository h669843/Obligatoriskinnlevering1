package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppgave1 {

public static void main (String[] args)	{

	String tallTxt = showInputDialog("Oppgi lønn: ");
	int tall = parseInt(tallTxt);		
	int nr = 0; 
	double skatt = 0; 
	
	if (tall >= 0 && tall <= 190439) {
		nr = 0;
		skatt = 0;
		
	} else if (tall >= 190439 && tall <= 267899) {
			nr = 1;
			skatt = 0.017;	
		
	} else if (tall >= 267899 && tall <= 643799) {
		nr = 2;
		skatt = 0.04;		
	
	} else if (tall >= 643799 && tall <= 969199) {
		nr = 3;
		skatt = 0.134;
	
	} else if (tall >= 969199 && tall <= 1999999) {
		nr = 4;
		skatt = 0.164;	
		
	} else if (tall >= 1999999 && tall <= 2000000) {
		nr = 5;
		skatt = 0.174;	

	} else {
		
		showMessageDialog(null,"Ugyldig om det er negative tall");
		System.out.println("Ugyldig");
	}
    String svar1= "lønnen din klasseres som trinn " + nr;
    String trinnskatt = "Det du må betale "+ tall*skatt + " i trinnskatt";
	showMessageDialog(null, svar1);
	showMessageDialog(null, trinnskatt);
}
}
