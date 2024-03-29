package libroAprenderAProgramar.cap6;

import java.util.Scanner;

//Se solicita un programa codificador
public class Ejercicio10 {
	
	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		final char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r','s','t', 'u', 'v'};
		final char conjunto2[] = {'p','v','i','u','m','t','e','r','k','q','s'};
		
		char codificador[];
		String texto;
		
		System.out.println("Ingrese un texto a codificar: ");
		texto = p.nextLine();
		texto = texto.toLowerCase();
		
		codificador = new char[texto.length()];
		
		for(int i = 0; i<texto.length();i++) {
			codificador[i] = codifica(conjunto1, conjunto2, texto.charAt(i));
		}
		
		texto = String.valueOf(codificador);
		System.out.println(texto);
	}
	
	static char codifica(char conjunto1[], char conjunto2[], char c) {
		final String conj1 = String.copyValueOf(conjunto1);
		char codificado;
	
		int pos = conj1.indexOf(c);
		
		if(pos == -1) {
			codificado = c;
		}else {
			codificado = conjunto2[pos];
		}
		
		return codificado;
	}

}
