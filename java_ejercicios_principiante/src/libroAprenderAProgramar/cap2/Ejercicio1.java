package libroAprenderAProgramar.cap2;

import java.util.Scanner;

//Diseñe una aplicacion que solicite al usuario un número e indique si es par o impar
public class Ejercicio1 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Por favor ingrese un número: ");
		num = p.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("El número ingresado es par "+num);
		}else {
			System.out.println("El número ingresado es impar "+num);
		}
	}
}
