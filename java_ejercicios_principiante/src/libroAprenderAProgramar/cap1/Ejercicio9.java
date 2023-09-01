package libroAprenderAProgramar.cap1;

import java.util.Scanner;

//Los precios de las futas no suelen ser constantes, varian segun el mercado. Se pide modificar
//el ejercicio anterior para que los precios no esten fijados y sea la aplicacion quien le pida al usuario
public class Ejercicio9 {

	public static void main(String[] args) {
		
		
		int manzanas1t, manzanas2t, manzanas3t, manzanas4t; //venta de manzanas en kilos
		int peras1t, peras2t, peras3t, peras4t;
		double precioManzana, precioPera;
		
		double total;
		Scanner p = new Scanner(System.in);
		
		System.out.println("Precio de las Manzanas $: ");
		precioManzana = p.nextDouble();
		
		System.out.println("Precio de las Peras $: ");
		precioPera = p.nextDouble();
		
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
		
		total = (manzanas1t + manzanas2t + manzanas3t + manzanas4t) * precioManzana;
		total += (peras1t + peras2t + peras3t + peras4t) * precioPera;
		
		System.out.println("El total vendido: "+total);
		
	}
}
