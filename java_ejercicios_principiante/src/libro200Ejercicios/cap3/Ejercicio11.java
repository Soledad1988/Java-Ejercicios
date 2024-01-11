package libro200Ejercicios.cap3;

import java.util.Scanner;

//Realice un conversor de Kb a Mb
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		double kb; 
		
	    System.out.print("Por favor, introduzca el número de Kb: ");
	    kb = p.nextDouble();
	    System.out.println(kb + "Kb son " +  (kb / 1024) + "Mb");
	  }
}
