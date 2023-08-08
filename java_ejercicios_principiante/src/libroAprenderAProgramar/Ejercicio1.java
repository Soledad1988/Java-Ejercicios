package libroAprenderAProgramar;

import java.util.Scanner;

//Diseñe un programa que pida un número al ususario  - por teclado - y a continuación lo muestre.
public class Ejercicio1 {

	public static void main(String[] args) {
		
		int numero;
		System.out.println("Por favor ingrese un Número: ");
		Scanner n = new Scanner(System.in);
		
		numero = n.nextInt();
		
		System.out.println("El número ingresado es: "+numero);
		
	}
}
