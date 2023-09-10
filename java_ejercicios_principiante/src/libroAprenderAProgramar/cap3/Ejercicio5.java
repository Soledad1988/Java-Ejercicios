package libroAprenderAProgramar.cap3;

import java.util.Scanner;

//Desarrolla un programa que solicite los valores minimos y maximos de un rango.
//A continuacion solicitara por teclado un numero que debe estar dentro del rango
//si el valor introducido no pertenece al rango, la aplicacion volvera a pedir otro valor
//y asi repetidas veces, hasta qu el valor se encuentre dentro del rango
public class Ejercicio5 {

	public static void main(String[] args) {
		
		int minimo;
		int maximo;
		int num;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese el valor minimo del rango: ");
		minimo = p.nextInt();
		
		System.out.println("Ingrese el valor maximo del rango: ");
		maximo = p.nextInt();
		
		do {
			System.out.println("Ingresar un número: ");
			num = p.nextInt();
		}while(!(minimo<=num && num<=maximo));
		
		System.out.println(num + " Pertenece al rango");
		
	}
}
