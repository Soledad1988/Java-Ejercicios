package libro200Ejercicios.cap4;

import java.util.Scanner;

//Escribe un programa que diga cual es la ultima cifra de un número entero introducido por teclado
public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca un número entero: ");
	    int n = p.nextInt();
	    System.out.println("La última cifra del número introducido es el " + (n % 10));
	}
}
