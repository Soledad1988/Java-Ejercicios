package libroAprenderAProgramar.cap1;

import java.util.Scanner;

//Un frutero necesita calcular los beneficios anaules que obtiee de la venta de manzanas y peras
//Por este motivo, es necesario diseñar una aplicacion que solicite las ventas (en Kilos) de cada trimestre
//para cada fruta. La aplicacion mostrara el importe total sabiendo que el precio del kilo de manzanas esta fijado en 
//$2.35 y el kilo de peras en $1.95
public class Ejercicio8 {

	public static void main(String[] args) {
		
		final double PRECIO_MANZANAS = 2.35;
		final double PRECIO_PERAS = 1.95;
		
		int manzanas1t, manzanas2t, manzanas3t, manzanas4t; //venta de manzanas en kilos
		int peras1t, peras2t, peras3t, peras4t;
		
		double total;
		Scanner p = new Scanner(System.in);
		
		System.out.println("Manzanas: ");
		System.out.println("Cantidad vendidas en el trimestre 1: ");
		manzanas1t=p.nextInt();
		System.out.println("Cantidad vendidas en el trimestre 2: ");
		manzanas2t=p.nextInt();
		System.out.println("Cantidad vendidas en el trimestre 3: ");
		manzanas3t=p.nextInt();
		System.out.println("Cantidad vendidas en el trimestre 4: ");
		manzanas4t=p.nextInt();
		
		System.out.println("Peras: ");
		System.out.println("Cantidad vendidas en el trimestre 1: ");
		peras1t=p.nextInt();
		System.out.println("Cantidad vendidas en el trimestre 2: ");
		peras2t=p.nextInt();
		System.out.println("Cantidad vendidas en el trimestre 3: ");
		peras3t=p.nextInt();
		System.out.println("Cantidad vendidas en el trimestre 4: ");
		peras4t=p.nextInt();
		
		total = (manzanas1t + manzanas2t + manzanas3t + manzanas4t) * PRECIO_MANZANAS;
		total += (peras1t + peras2t + peras3t + peras4t) * PRECIO_PERAS;
		
		System.out.println("El total vendido: "+total);
	}
}
