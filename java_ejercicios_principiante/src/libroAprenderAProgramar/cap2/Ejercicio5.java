package libroAprenderAProgramar.cap2;

import java.util.Scanner;

//Implementar un programa que pida por teclado un númeo decimal e indique si ese número es casi-cero
//que son aquellos positivos o negativos que se acercan a 0 por emnos de una unidad, aunque curiosamente el cero
//no se considere un número casi-cero son 0.3, el -0.99 o el 0.123. Y numeros que no se consideran casi-cero
//son 12.3 el 0 o el -1
public class Ejercicio5 {

	public static void main(String[] args) {
		
		double num;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese un número decimal: ");
		num = p.nextDouble();
		
		if(-1 < num && num < 1 && num != 0) {
			System.out.println("Es un número casi cero");
		}else {
			System.out.println("No es un número casi cero");
		}
	}
}
