package libroAprenderAProgramar.cap2;

import java.util.Locale;
import java.util.Scanner;

//Pedir los coeficientes de una ecuacion de 2° grado y mostrar sus soluciones reales. Si no existe debe indicarlo
//Recordemos que la solucion de una ecuacion de 2° grado ax2 + bx + c = 0
public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		p.useLocale(Locale.US);
		
		double a, b, c;
		double x1, x2, d;
		
		System.out.println("Introduzca el coeficiente de a: ");
		a = p.nextDouble();
		
		System.out.println("Introduzca el coeficiente de b: ");
		b = p.nextDouble();
		
		System.out.println("Introduzca el coeficiente de c: ");
		c = p.nextDouble();
		
		d = (b * b - 4 * a * c); //calculamos el discriminante.
		
		if(d < 0) {
			System.out.println("No existen soluciones reales");
		}else {
			if (a == 0) {
				System.out.println("No es una ecuacion de 2° grado.");
			}else {
				x1 = (-b + Math.sqrt(d));
				x2 = (-b - Math.sqrt(d));
				
				System.out.println("Solución 1: "+x1);
				System.out.println("Solución 2: "+x2);
			}
		}
	}
}
