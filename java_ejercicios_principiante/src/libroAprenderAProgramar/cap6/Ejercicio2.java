package libroAprenderAProgramar.cap6;

import java.util.Scanner;

//Diseñar el juego "acierta la contraseña". La mecanica del juego es la siguente.
//El primer jugador introduce la contraseña, a continuacion el segundo jugador debe teclear palabras
//hasta que la acierte. Realizar dos versiones, en la primera las unicas pistas que se proporcionan
//son el numeros de caracteres y cuales son el primero y el ultimo caracter de la contraseña
//en la segunda version se facilita el juego indicando si la palabra  introducida es mayor o menor
//alfabeticamente que la contraseña
public class Ejercicio2 {

	public static void main(String[] args) {
		
		String jugador1;
		String jugador2;
		
		Scanner p = new Scanner(System.in);
	
		System.out.print("Jugador 1. Ingrese la contraseña: ");
		jugador1 = p.nextLine();
		int lon = jugador1.length(); //calculamos longitud
		
		char primero = jugador1.charAt(0);
		char ultimo = jugador1.charAt(lon - 1);
		
		//pistas
		System.out.println("------Pistas--------");
		System.out.println("Longitud: "+lon);
		System.out.println("Primer caracter "+primero);
		System.out.println("Ultimo caracter "+ultimo);
		
		do {
		System.out.print("Jugador 2......¿Cual es la contraseña?...Ingrese su respuesta: ");
		jugador2 = p.nextLine();
		}while(!jugador1.equals(jugador2));
		
		System.out.println("!Acertaste!!!");
	}
}
