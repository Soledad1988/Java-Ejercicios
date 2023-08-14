package libro200Ejercicios.cap3;

import java.util.Scanner;

//Escribe un programa que calcule el area de un rectangulo (base*altura)
public class Ejercicio5 {

	public static void main(String[] args) {
		
		int area;
		int altura;
		int base;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Calcular el área de un rectangulo: ");
		System.out.println("Ingrese base: ");
		base = p.nextInt();
		System.out.println("Ingrese altura: ");
		altura = p.nextInt();
		
		area = base * altura;
		
		System.out.println("El área del rectuango es: "+area);
	}
}
