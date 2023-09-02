package libroAprenderAProgramar.cap4;

import java.util.Scanner;

//Crear una fucnion que, mediante un booleno, indique si el caracte
//que se pasa por parametro de entrada corresponde con una vocal
public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Es una vocal: "+ esVocal('m'));
	
	}
	
	
	//Funcion
	public static boolean esVocal(char c) {
		boolean resultado;
		
		if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
			resultado = true;
		}else {
			resultado = false;
		}
		
		return resultado;
	}
	
}
