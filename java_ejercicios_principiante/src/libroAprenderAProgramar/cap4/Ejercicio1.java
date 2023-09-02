package libroAprenderAProgramar.cap4;

import java.util.Scanner;

//Diseñar la funcion eco() a la que se le pasa como parametro un numero n y muestra por pantalla n veces el mje
public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int n = p.nextInt();
		//llamada a la funcion
		eco(n);
		
	}
	
	//Funcion
	static void eco(int numero) {
		for(int i=0;i<numero;i++) {
			System.out.println("mensaje....");
		}
	}
}
