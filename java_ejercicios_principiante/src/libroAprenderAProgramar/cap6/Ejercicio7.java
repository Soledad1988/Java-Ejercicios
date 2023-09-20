package libroAprenderAProgramar.cap6;

import java.util.Scanner;

//Diseñar un programa que solicite al usuario una frase y una palabra.
//A continuacion buscara cuatas veces aparece la palabra en la frase
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		String frase;
		String palabra;
		int veces = 0;
		int posicion;
		
		System.out.println("Ingrse una frase: ");
		frase = p.nextLine();
		
		System.out.println("Ingrese una palabra: ");
		palabra = p.nextLine();
		
		posicion = frase.indexOf(palabra);
		
		while(posicion != -1) {
			veces++;
			posicion = frase.indexOf(palabra, posicion +1 );
		}
		
		if(veces == 0) {
			System.out.println("\""+palabra+"\" no se encuentra en la frase");
		}else {
			System.out.println("\""+palabra+"\" está "+veces+" veces");
		}
	}
}
