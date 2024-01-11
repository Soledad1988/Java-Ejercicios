package libro200Ejercicios.cap3;

import java.util.Scanner;

//Realice un conversor de Mb a Kb
public class Ejercicio10 {

	 public static void main(String[] args) {
		 	Scanner p = new Scanner(System.in);
			double mb; 
			
		    System.out.print("Por favor, introduzca el número de Mb: ");
		    mb = p.nextDouble();
		    System.out.println(mb + "Mb son " +  (mb * 1024) + "Kb");
		  }
}
