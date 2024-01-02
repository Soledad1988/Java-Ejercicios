package libro200Ejercicios.cap3;

import java.util.Scanner;

//Escribe un programa que calcule el volumen de un cono según la formula V = 1/3 pircuadradoh
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		
		final double PI = 3.1416;
		double radioCono;
		double altura;
		
		System.out.println("Ingrese radio del cono: ");
		radioCono = p.nextDouble();
		
		System.out.println("Ingrese altura en cm: ");
		altura = p.nextDouble();
		
		double resultado = radioCono * radioCono;
		
		double volumen = ( PI * resultado * altura)/3;
		
		System.out.println("El volumen es: "+volumen);
		
	}
}
