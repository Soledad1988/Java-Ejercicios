package libroAprenderAProgramar.cap5;

import java.util.Arrays;
import java.util.Scanner;

//Introducir por teclado un número n; a continuacion solicitar al usuario que teclee n números.
//Realizar la media de los números positivos, la media de los negativos y contar el número de ceros introducidos
public class Ejercicio3 {

	public static void main(String[] args) {
		
		int n;
		int sumaPositivos = 0;
		int contarPositivos = 0;
		int sumaNegativos = 0;
		int contarNegativos = 0;
		int contarCeros = 0;
		
		
		Scanner p = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de numeros que desea analizar: ");
		n = p.nextInt();
		
		int datos[] = new int[n];
		
		for(int i = 0; i< datos.length; i++) {
			System.out.println("Ingrese los números: ");
			datos[i] = p.nextInt();
		}
		
		//System.out.println("Los numeros ingresados son: "+Arrays.toString(datos));
		
		for(int x:datos) {
			if(x == 0) {
				contarCeros++;
			}else if( x > 0) {
				sumaPositivos+=x;
				contarPositivos++;
			}else if(x < 0) {
				sumaNegativos+=x;
				contarNegativos++;
			}
		}
		
	}
}
