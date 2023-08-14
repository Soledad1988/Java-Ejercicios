package libro200Ejercicios.cap3;

import java.util.Scanner;

//Realizar un converor de euros a pesos. L cantidad de euros que se quiere convertir debe ser introducida por teclado
public class Ejercicio2 {

	public static void main(String[] args) {
		
		double cotizacion = 310.12;
		int euro;
		double conversor;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de Euros: ");
		euro = p.nextInt();
		
		conversor = cotizacion * euro;
		
		System.out.println("Cantidad de pesos: "+conversor);
		
	}
}
