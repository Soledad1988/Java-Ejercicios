package libroAprenderAProgramar.cap6;

import java.util.Scanner;

//Diseñar una funcion  a la que se le pase una cadena de caracteres y la devuelva invertida
//ejemplo "Hola mundo" --> quedaria "odnum aloh"
public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		String antes;
		String despues;
		
		System.out.println("Escriba una frase: ");
		antes = p.nextLine();
		
		despues = alReves(antes);
		System.out.println(despues);
	}
	
	static String alReves(String original) {
		String nueva ="";
		char t[] = original.toCharArray();
		
		for(int i = 0; i<t.length; i++) {
			nueva = t[i] + nueva;
		}
		return nueva;
	}
}
