package libroAprenderAProgramar.cap5;

import java.util.Arrays;
import java.util.Scanner;

//Diseñar un programa que solicite al usuario que introduzca por teclado
//5 números decimales a continuacion, debe mostrar los números en el mismo orden
//que se han introducido
public class Ejercicio1 {

	public static void main(String[] args) {
		
		double numeros[] = new double [5];
		
		Scanner p = new Scanner(System.in);
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese un número: ");
			numeros[i] = p.nextDouble();
		}
		
		System.out.println("Los numeros son: "+ Arrays.toString(numeros));
	}
}
