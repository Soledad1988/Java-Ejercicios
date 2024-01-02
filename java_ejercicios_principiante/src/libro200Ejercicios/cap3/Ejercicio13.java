package libro200Ejercicios.cap3;

import java.util.Scanner;

//Realice un programa que calcule la nota que hace falta sacar en el segundo 
//examen de la asignatura Programación para obtener la media deseada. Hay
//que tener en cuenta que la nota del primer examen cuenta en 40% y la del 
//segundo un 60%
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double notaDeseada;
		double media;
		
		System.out.println("Introduzca la nota del primer cutrimestre: ");
		nota1 = p.nextDouble();
		
		System.out.println("Que nota quiere sacar en el trimestre?: ");
		notaDeseada = p.nextDouble();
	}
}
