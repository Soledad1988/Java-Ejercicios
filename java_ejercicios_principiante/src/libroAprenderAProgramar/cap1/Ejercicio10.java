package libroAprenderAProgramar.cap1;

import java.util.Scanner;

//diseñar una aplicacion que calcule la longitud y el area de una circunsferencia.
//Para ello, el usuario debe introducir el radio (que puede contener decimales). Recordemos:
//longitud=2pi*radio
//area=pi*radio al cuadrado
public class Ejercicio10 {

	public static void main(String[] args) {
		
		final double PI = 3.14;
		
		double longitud, area, radio;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese radio: ");
		radio = p.nextDouble();
		
		longitud = 2 * PI * radio;
		area = PI * (radio*radio);
		
		System.out.println("La longitud del circulo con un radio de: "+radio+" es "+longitud);
		System.out.println("El radio de una circunferencia con un radio de: "+radio+" es "+area);
		
	}
}
