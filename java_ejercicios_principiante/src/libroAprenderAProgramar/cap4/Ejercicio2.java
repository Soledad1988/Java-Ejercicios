package libroAprenderAProgramar.cap4;

import java.util.Scanner;

//Escribir una funcion a la que se le pasen 2 enteros y muestre todos los
//numeros comprendidos entre ellos
public class Ejercicio2 {

public static void main(String[] args) {
		
		int num1, num2;
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		num1 = p.nextInt();
		
		System.out.println("Ingrese otro numero: ");
		num2 = p.nextInt();
		
		//llamo a la funcion
		mostrar(num1,num2);
	}
	
//Funcion
	public static void mostrar(int a, int b) {
		int mayor = a > b?a:b;
		int menor = b > a?a:b;
		
		for(int i = menor; i<=mayor;i++) {
			System.out.println(i);
		}
	}
}
