package libroAprenderAProgramar.cap2;

import java.util.Scanner;

//Solicitar 2 números distintos y mostrar cual es el mayor
public class Ejercicio3 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		num1 = p.nextInt();
		
		System.out.println("Ingrese otro número: ");
		num2 = p.nextInt();
		
		if(num1 > num2) {
			System.out.println("El número "+num1+" es mayor que el número "+num2);
		}if(num2 > num1) {
			System.out.println("El número "+num2+" es mayor que el número "+num1);
		}
	}
}
