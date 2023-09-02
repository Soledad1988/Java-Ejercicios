package libroAprenderAProgramar.cap3;

import java.util.Scanner;

//Pedir un numero y calcular su factoria. Por ejemplo el factorial de 5 se denota !5 y es igual a 5*4*3*2*1 = 120
public class Ejercicio8 {

	public static void main(String[] args) {
		
		int numero;
		double factorial = 1;
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		numero = p.nextInt();
		
		for(int i = numero; i > 0; i--) {
			factorial = factorial * i;
		}
		System.out.println("Su factoria de "+numero+" es: "+factorial);
	}
}
