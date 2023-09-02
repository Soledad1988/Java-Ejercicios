package libroAprenderAProgramar.cap4;

import java.util.Scanner;

//Realice una funcion que reciba como parametros dos numeros enteros y que devuelva el maximo (El mayor de los 2)
public class Ejercicio3 {

	public static void main(String[] args) {
		
		int num1,num2;
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		num1 = p.nextInt();
		
		System.out.println("Ingrese otro número: ");
		num2 = p.nextInt();
		
		//llamo a la funcion
		System.out.println("Funcion 1: ");
		mayor(num1, num2);
		
		System.out.println("Funcion 2: "+maximo(num1,num2));
		;
	}
	
	//Funcion 1:
	public static void mayor(int a, int b) {
		if(a > b) {
			System.out.println("El mayor es: "+a);
		}else {
			System.out.println("El mayor es: "+b);
		}
	}
	
	//funcion 2:
	public static int maximo(int a, int b) {
		int max;
		
		if(a > b) {
			max = a;
		}else {
			max = b;
		}
		return max;
	}
}
