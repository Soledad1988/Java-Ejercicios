package libroAprenderAProgramar.cap6;

import java.util.Scanner;

//Diseñar una aplicacion que pida al usuario que ontroduzca una frase
//por teclado e indique cuantos espacios en blanco tiene
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		String frase;
		int espaciosBlanco = 0;
		char c;
		
		System.out.print("Escriba una frase: ");
		frase = p.nextLine();
		
		for(int i = 0; i<frase.length(); i++) {
			c = frase.charAt(i);
			if(Character.isSpaceChar(c)) {
				espaciosBlanco++;
			}
		}
		
		System.out.println("Tiene: "+espaciosBlanco + " espacios en blanco.");
	}
}
