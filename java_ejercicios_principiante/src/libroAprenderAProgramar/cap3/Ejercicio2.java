package libroAprenderAProgramar.cap3;

import java.util.Scanner;

//Un centro educativo nos ha pedido que diseñemos una aplicacion para calcular algunos datos
//estadisticos de las edades de los alumnos. Se introduciran datos hasta que uno de ellos sea negativo
//La aplicacion mostrara la suma de todas las edades, la media de cuantos alumnos hemos introducido las edades
//y cuantos alumnos son mayores de edad. Implementar la aplicacion requerida
public class Ejercicio2 {

	public static void main(String[] args) {
		
		int edad;
		int sumaEdades = 0;
		int contadorAlumnos = 0;
		int contadorMayorEdad = 0;
		double media;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese la edad: ");
		edad = p.nextInt();
		
		while(edad>=0) {
			
			sumaEdades += edad;
			contadorAlumnos ++;
			
			if (edad >= 18) {
				contadorMayorEdad ++;
			}
			
			System.out.println("Ingrese la edad: ");
			edad = p.nextInt();
		}
		
		media = (double) sumaEdades / contadorAlumnos;
	
		System.out.println("Suma de todas las edades: "+sumaEdades);
		System.out.println("Media "+media);
		System.out.println("Numero total de alumnos: "+contadorAlumnos);
		System.out.println("Alumnos mayores de Edad "+contadorMayorEdad);
	}
}
