package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
public class Oppgave3 {
public static void main(String[] args) {
	//TODO Auto-generated method stub
	
	
	int i,fact=1;
	String tall = "";
	int number = 0;
	
	tall = showInputDialog("tall:");
	       number = parseInt(tall);
	   for(i=1;i<=number;i++) {
		   fact=fact*i;
	   }
	   System.out.println("Fakultet til "+number+" er: " +fact);
	   
}
}
