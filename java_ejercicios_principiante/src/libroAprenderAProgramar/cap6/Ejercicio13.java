package libroAprenderAProgramar.cap6;

import java.util.Scanner;

//Diseñar una ñgoritmo que lea del teclado una frase e indique,  para las letras
//que aparecen en la frase, cuantas veces se repite cada una. Se consideran iguales
//las letras mayusculas y las minusculas para realizar la cuenta
public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		String frase;
		int[] nroVeces;
		
		System.out.println("Introduzca una frase: ");
		frase = p.nextLine();
		
		frase = frase.toLowerCase();
		
		nroVeces = new int['z' - 'a' + 1];
		
		for(int i = 0; i<frase.length(); i++) {
			if(Character.isLetter(frase.charAt(i))) {
				nroVeces[frase.charAt(i) - 'a']++;
			}
		}
		for(int i = 0;i<'z' - 'a';i++ ) {
			if(nroVeces[i]!=0) {
				System.out.println("La letra "+(char)(i+'a')+" se repite "+nroVeces[i]+" veces.");
			}
		}
	}
}
