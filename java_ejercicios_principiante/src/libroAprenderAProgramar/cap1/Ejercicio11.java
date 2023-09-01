package libroAprenderAProgramar.cap1;

import java.util.Scanner;

//Un economista nos ha encargado un programa para realizar calculos con el IVA. La aplicacion
//debe solicitar la base imponible y el IVA a aplicar. Debemos mostrar en pantalla el importe correspondiente
//al IVA y al total
public class Ejercicio11 {

	public static void main(String[] args) {
		
		double base, iva;
		double total;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese Base Imponible: ");
		base = p.nextDouble();
		
		System.out.println("Ingrese IVA a aplicar: ");
		iva = p.nextDouble();
		
		total = base + (base * iva);
		
		System.out.println("Total: "+total);
		System.out.println("IVA: "+iva);
	}
}
