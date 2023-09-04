package libroAprenderAProgramar.cap5;

import java.util.Scanner;

//Escriba una aplicacion que solicite al usuario cuantos números desea introducir.
//A continuacion, se introducira por teclado esa cantidad de números enteros, y por ultimo
//los mostrara en el orden inverso al introducido
public class Ejercicio2 {

	public static void main(String[] args) {
		
		int cantidad;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Cuantos numeros desea ingresar? ");
		cantidad = p.nextInt();
		
		int numeros[]= new int[cantidad];
		
		for(int i = 0; i< numeros.length;i++) {
			System.out.println("Ingrese los números: ");
			numeros[i] = p.nextInt();
		}
		
		//Recorremos en orden inverso
		System.out.println("Los números ingresados son: ");
		for(int i = numeros.length - 1; i>=0 ;i--) {
			System.out.println(numeros[i]);
		}
	}
}
