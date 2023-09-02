package libroAprenderAProgramar.cap4;

import java.util.Scanner;

//Repetir el ejercicio anterior con una version que calcule el maximo de 3 números;
public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		num1 = p.nextInt();
		
		System.out.println("Ingrese otro número: ");
		num2 = p.nextInt();
		
		System.out.println("Ingrese otro número: ");
		num3 = p.nextInt();
		
		//llamar a la funcio:
		System.out.println("El mayor es: "+mayor(num1, num2, num3));
	}
	
	public static int mayor(int a, int b, int c) {
		int mayor;
		
		if(a > b && a > c) {
			mayor = a;
		}else if(b > a && b > c) {
			mayor = b;
		}else {
			mayor = c;
		}
		return mayor;
	}
}
