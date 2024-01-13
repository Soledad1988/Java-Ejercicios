package libro200Ejercicios.cap4;

import java.util.Scanner;

//Realizar un programa que calcule la media de tres notas
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		double nota1;
		double nota2;
		double nota3;
		double media;
		
		System.out.println("Ingrese notas: ");
		System.out.println("nota 1: ");
		nota1 = p.nextDouble();
		System.out.println("nota 2: ");
		nota2 = p.nextDouble();
		System.out.println("nota 3: ");
		nota3 = p.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("La media de las 3 notas ingresadas es: "+media);
	}
}
