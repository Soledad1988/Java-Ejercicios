package libroAprenderAProgramar;

import java.util.Scanner;

//Modifica el ejercicio anterior para que muestre la parte entera de la media de
//tres notas decimales
public class Ejercicio6 {

	public static void main(String[] args) {
		
		int nota1, nota2, nota3;
		int media;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese nota1 ");
		
		nota1 = p.nextInt();
		
		System.out.println("Ingrese nota2 ");
		
		nota2 = p.nextInt();
		
		System.out.println("Ingrese nota3 ");
		
		nota3 = p.nextInt();
		
		media = (int) ((nota1 + nota2 + nota3)/3.0);
		
		System.out.println("Nota1: "+nota1);
		System.out.println("Nota2: "+nota2);
		System.out.println("Nota3: "+nota3);
		System.out.println("La media es: "+media);
	}
}
