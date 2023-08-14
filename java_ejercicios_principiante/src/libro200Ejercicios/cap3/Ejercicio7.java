package libro200Ejercicios.cap3;

import java.util.Scanner;

//Escribe un programa que calcule el total de una factura a partir de la base imponible
public class Ejercicio7 {

	public static void main(String[] args) {
		
		double baseImponible;
		double total;
		double iva = 0.21;
		
		Scanner p = new Scanner(System.in);
		System.out.println("Ingrese base imponible: ");
		baseImponible = p.nextDouble();
		
		total = baseImponible + (baseImponible*iva);
		
		System.out.println("El total de la factura es: "+total);
		System.out.println("----------------------------------");
		System.out.println("Detalle: ");
		System.out.println("Base Imponible: "+baseImponible);
		System.out.println("IVA: "+iva);
	}
}
