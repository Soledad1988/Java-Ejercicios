package libro200Ejercicios.cap3;

import java.util.Scanner;

//Escribe un programa que calcule el precio final de un producto segun su base imponible (precio antes de impuesto)
//el tipo de iva aplicado (General, reducido o superreducido) y el codigo promocional. Los tipode de iva son 21%, 10% y 4%
//los codigos promocionale spueden ser NOPRO, MITAD, MENOS5 o 5PORC. que significa respectivamente que no se aplica
//la pomocion, el precio se reduce a la mitad, se descuenta $5 o 5%.El ejercicio se da por bueno  sis e muestran los valores
//correctos, aunque los número no esten tabulados.
public class Ejercicio9 {

	public static void main(String[] args) {
		
		double baseImponible;
		
		double general = 0.21;
		double reducido = 0.10;
		double superreducido = 0.04;
		
		double descuento;
		double subTotal1;
		double total1;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Introduzca la base imponible: ");
		baseImponible = p.nextDouble();
		
		System.out.println("Introduzca el tipo de Iva (general, reducido, superreducido): ");
		general = p.nextDouble();
		reducido = p.nextDouble();
		superreducido = p.nextDouble();
		
		System.out.println("Introduzca el codigo promocional (nopro, mitad, menos5, 5porc): ");
		descuento = p.nextDouble();
		
		subTotal1 = baseImponible + (baseImponible * general);
		total1 = subTotal1 - descuento;
		
		System.out.println("Base Imponible: "+baseImponible);
		System.out.println("Iva: ");
		System.out.println("Precio con Iva: ");
		System.out.println("Codigo promocional: "+descuento);
		System.out.println("TOTAL: ");
	}
}
