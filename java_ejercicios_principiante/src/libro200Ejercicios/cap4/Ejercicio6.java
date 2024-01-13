package libro200Ejercicios.cap4;

import java.util.Scanner;

//Realiza un programa que calcule el tiempo que tardara en caer un objeto desde una altura h.
//Aplicar la formula t=
public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner p = new Scanner(System.in);
		
		double h;
		
		System.out.print("Por favor, introduzca la altura, en metros, desde la que cae el objeto: ");
		h = p.nextDouble();

		final double g = 9.81; // las constantes se declaran con final
		
		double s = Math.sqrt(2*h/g);

		System.out.printf("El objeto tarda %.2f segundos en caer.\n", s);
		  
	}
}
