package libroAprenderAProgramar.cap6;

import java.util.Scanner;

//Implementar un programa , que consiste en que un jugador escriba una palabra o frase, y la aplicacion
//muestra un anagrama (transposicion de caracteres) del texto introducido  generado al azar.
//A continuacion otro jugador tiene que acertar cual es el texto orginal. L aplicacion no debe permotir
//que el texto introducido por el jugador 1 sea la cadena vacia.
public class Ejercicio14 {
	
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		
		String original;
		String intento;
		char anagrama [];
		
		do {
			System.out.println("Jugador 1. Introduzca una frase: ");
			original = p.nextLine();
		}while(original.isEmpty());
		
		anagrama = original.toCharArray();
		int tam  = original.length();
		
		//intercambio al azar
		for(int numCambios=0;numCambios<tam;numCambios++) {
			int i = (int)(Math.random()*tam);
			int j = (int)(Math.random()*tam);
			
			char aux = anagrama[i];
			anagrama[i] = anagrama[j];
			anagrama[j] = aux;
		}
		
		String anagramaFinal = String.copyValueOf(anagrama);
		System.out.println("Teclee un anagrama de: "+anagramaFinal);
		
		do{
			System.out.println("Jugador 2 ¿Cual es el original?");
			intento = p.nextLine();
		}while(!original.equals(intento));
		System.out.println("Muy bien!!");
	}

}
