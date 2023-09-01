package libroAprenderAProgramar.cap1;

import java.util.Scanner;

//Pedir al usuario su edad y mostrar la que tendrá el proximo año
public class Ejercicio2 {

	public static void main(String[] args) {
		
		System.out.println("Ingrese su edad: ");
		
		int edad;
		
		Scanner p = new Scanner(System.in);
		
		edad = p.nextInt();
		edad = edad + 1;
		
		System.out.println("Su edad para el proximo año será: "+ edad);
	}
}
