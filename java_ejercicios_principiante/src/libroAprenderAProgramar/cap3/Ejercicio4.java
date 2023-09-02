package libroAprenderAProgramar.cap3;

import java.util.Scanner;

//Escriba una aplicacion para aprender a contar, que pedira un número n y mostrara todos los número
//del 1 al n;
public class Ejercicio4 {

	public static void main(String[] args) {
		
		int n;
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		n = p.nextInt();
		
		for(int i =0 ;i <= n; i++) {
			System.out.println(i);
		}
	}
}
