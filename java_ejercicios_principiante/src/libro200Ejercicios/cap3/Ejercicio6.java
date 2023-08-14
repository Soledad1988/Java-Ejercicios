package libro200Ejercicios.cap3;

import java.util.Scanner;

//escribe un programa que calcule el area de un triangulo ((base * altura)/2)
public class Ejercicio6 {

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
		
		area = (base * altura)/2;
		
		System.out.println("El área del rectuango es: "+area);
	}
}
