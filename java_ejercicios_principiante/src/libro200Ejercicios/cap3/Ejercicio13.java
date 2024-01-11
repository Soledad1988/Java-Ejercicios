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
		
		System.out.println("Introduzca la nota del primer cutrimestre: ");
		nota1 = p.nextDouble();
		
		System.out.println("Que nota quiere sacar en el trimestre?: ");
		notaDeseada = p.nextDouble();
 
		 // La nota final se calcula de esta forma:
		 // notaFinal = ((nota1 * 40) + (nota2 * 60)) / 100
		 // Por tanto, despejando nota2 tenemos:
		 // nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60
		 nota2 = ((notaDeseada * 100) - (nota1 * 40)) / 60;
		    
		    System.out.println("Para tener un " + notaDeseada + " en el trimestre");
		    System.out.println("necesita sacar un " + nota2 + " en el segundo examen.");
	}
}
