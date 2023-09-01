package libroAprenderAProgramar.cap2;

import java.util.Scanner;

//Pedir dos número y mostrarlos ordenados de forma decrecientes
public class Ejercicio6 {

	public static void main(String[] args) {
		
		int num1, num2;
		int mayor, menor;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		num1 = p.nextInt();
		
		System.out.println("Ingrese otro número: ");
		num2 = p.nextInt();
		
		mayor = num1 > num2 ? num1 : num2;
		menor = num1 < num2 ? num1 : num2;
		
		System.out.println("Ordenados: ");
		System.out.println(mayor+" "+menor);
	}
}
