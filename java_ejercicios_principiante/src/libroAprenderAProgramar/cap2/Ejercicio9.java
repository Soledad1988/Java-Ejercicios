package libroAprenderAProgramar.cap2;

import java.util.Scanner;

//Escribe una aplicacion que indique cuntas cifras tiene un número entero introducido
//por teclado, que estara comprendido entre 0 y 99.999
//los numeros comprendidos entre 0 y 9 tiene 1 cifra
//los numero comprendidos entre 10 y 99 dos cifras
//y los 100 al 999 tres cifras
public class Ejercicio9 {

	public static void main(String[] args) {
		
		int num;
		Scanner p = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		
		num = p.nextInt();
		
		if(num < 10) {
			System.out.println("El número ingresado tiene UNA CIFRA");
		}else if(num < 100) {
			System.out.println("El número ingresado tiene DOS CIFRA");
		}else if(num < 1000) {
			System.out.println("El número ingresado tiene TRES CIFRA");
		}else if(num < 10000) {
			System.out.println("El número ingresado tiene CUATRO CIFRA");
		}else if (num < 100000){
			System.out.println("El número ingresado tiene CINCO CIFRA");
		}

	}
}
