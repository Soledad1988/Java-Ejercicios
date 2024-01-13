package libro200Ejercicios.cap4;

import java.util.Scanner;

//Realiza un programa que resuelva una ecuacion de primer grado (del tipo ax + b =0)
public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		double a;
		double b;
		
		 System.out.print("Por favor, introduzca el valor de a: ");
		 a = p.nextDouble();
		 
		 System.out.print("Ahora introduzca el valor de b: ");
		 b = p.nextDouble();

		    if (a == 0) {
		      System.out.println("Esa ecuación no tiene solución real.");
		    } else {
		      System.out.println("x = " + (-b/a));
		    }
	}
}
