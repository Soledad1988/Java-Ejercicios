package libroAprenderAProgramar.cap6;

import java.util.Scanner;
//Realizar un programa que lea una frase por teclado y nos indique si es palíndroma, es decir,
//que la frase sea igual leyendo  de izquierda a derecha, que derecha a izquierda,
//sin tener en cuenta los espacios. Ejemplo Dabale arroz a la zorra del abad
//las vocales con tilde hace que un algoritmo tome una frasen políndroma como si no lo fuese
//Por esto, supondremos que el usuario introdice la frase sin tilde
public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		String frase;
		String sinEspacios;
		String invertida;
		
		System.out.println("Introduzca una frase:");
		frase = p.nextLine();
		
		sinEspacios = eliminaEspacios(frase);
		invertida = alReves(sinEspacios);
	}
	
	//funcion para eliminar espacioss
	static public String eliminaEspacios(String cadena) {
		String sin = "";
		
		for(int i = 0; i < cadena.length();i++) {
			char c = cadena.charAt(i);
			
			if(!Character.isWhitespace(c)) {
				sin = sin + c;
			}
		}
		return sin;
	}
	
	static String alReves(String original) {
		String nueva = "";
		char t[] = original.toCharArray();
		
		for(int i =0; i< t.length;i++) {
			nueva = t[i] + nueva;
		}
		return nueva;
	}
}
