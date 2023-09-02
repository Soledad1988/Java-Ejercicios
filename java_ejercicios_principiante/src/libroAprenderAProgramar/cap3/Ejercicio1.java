package libroAprenderAProgramar.cap3;

import java.util.Scanner;

//Diseñe un programa que muestre, para cada número introducido por teclado,
//si es par, si es positivo y su cuadrado. El procesose repetira hasta que el número introducido
//por teclado sea cero.
public class Ejercicio1 {

	public static void main(String[] args) {
		
		int num;
		boolean esPar, esPositivo;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		num = p.nextInt();
		
		while(num != 0) {
			esPar = num %2 ==0? true:false;
			esPositivo = num >=0 ? true: false;
			
			System.out.println("Es par?: "+esPar+" es Positivo?: "+esPositivo);
			System.out.println("Cuadrado: "+num*num);
			System.out.println("Ingrese otro número: ");
			
			num = p.nextInt();
		}
	}
}
