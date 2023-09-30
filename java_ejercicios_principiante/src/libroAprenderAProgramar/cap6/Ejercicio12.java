package libroAprenderAProgramar.cap6;

import java.util.Arrays;
import java.util.Scanner;

//Un anagrama es una palabra, o frase que resulta  de la transposicion de otra palabra o frase.
//ejemplo: amor, rama, mora. Construir un programa que solicite al usuario dos palabras e indique si 
//son anagrama una de otras
public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		String palabra1;
		String palabra2;
		
		System.out.println("Escriba una palabra: ");
		palabra1 = p.nextLine();
		
		System.out.println("Escriba otra palabra: ");
		palabra2 = p.nextLine();
		
		if(palabra1.length() != palabra2.length()) {
			System.out.println("No son anagramas");
		}else {
			char p1[] = palabra1.toCharArray();
			char p2[] = palabra2.toCharArray();
			
			Arrays.sort(p1);
			Arrays.sort(p2);
			
			palabra1 = String.copyValueOf(p1);
			palabra2 = String.copyValueOf(p2);
			
			if(palabra1.equalsIgnoreCase(palabra2)) {
				System.out.println("Son anagramas!!");
			}else {
				System.out.println("No son anagramas");
			}
		}
	}
}
