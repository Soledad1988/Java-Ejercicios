package libroAprenderAProgramar.cap2;

import java.util.Scanner;

//Pedir 2 número enteros y decir si son iguales o no
public class Ejercicio2 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		num1  = p.nextInt();
		
		System.out.println("Ingrese ootro número: ");
		num2 = p.nextInt();
		
		if(num1 == num2) {
			System.out.println("Los números son iguales: "+num1 +" = "+num2);
		}else {
			System.out.println("Los números son distintos: "+num1 +" <> "+num2);
		}
	}
}
