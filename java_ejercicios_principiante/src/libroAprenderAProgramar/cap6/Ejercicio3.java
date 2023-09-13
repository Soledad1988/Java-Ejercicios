package libroAprenderAProgramar.cap6;

import java.util.Scanner;

//Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las palabras
//introducidas con espacios en blanco. Terminar de leer la frase cuando alguna de las palabras introducida
//sea la cadena "fin" escrita en cualquier combinacion minuscula/mayuscula. La cadena fin no aparecera en la frase final
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		
		String frase ="";
		String palabra;
		
		System.out.println("Escriba una palabra: ");
		palabra = p.nextLine();
		
		while(!palabra.toLowerCase().equals("fin")) {
			frase = frase + " " + palabra;
			System.out.println("Escriba una palabra: ");
			palabra = p.nextLine();
		}
		
		System.out.println(frase);
	}
}
