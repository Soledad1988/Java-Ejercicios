package libroAprenderAProgramar.cap1;

import java.util.Scanner;

//Necesitamos una aplicacion que calcule la media arirmetica de dos notas enteras. Hay que tener
//en cuenta que la media puede contener decimales
public class Ejercicio5 {

	public static void main(String[] args) {
		
		int nota1, nota2;
		double media;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese nota 1: ");
		nota1 = p.nextInt();
		
		System.out.println("Ingrese nota 2: ");
		nota2 = p.nextInt();
		
		media = (nota1 + nota2)/2;
		
		System.out.println("Nota 1: "+nota1);
		System.out.println("Nota 2: "+nota2);
		System.out.println("La media es: "+media);
		}
}
