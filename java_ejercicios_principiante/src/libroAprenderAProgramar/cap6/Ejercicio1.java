package libroAprenderAProgramar.cap6;

import java.util.Scanner;

//Introducir por teclado dos palabras e indicar cual de ellas es la mas corta,
//es decir la que contiene  menos caracteres
public class Ejercicio1 {

	public static void main(String[] args) {
		
		String palabra1;
		String palabra2;
		int long1;
		int long2;
		
		Scanner p = new Scanner(System.in);
		
		System.out.print("Ingrese una palabra: ");
		palabra1 = p.nextLine();
		
		System.out.print("Ingrese otra palabra: ");
		palabra2 = p.nextLine();
		
		//calculamos la longitud
		long1 = palabra1.length();
		long2 = palabra2.length();
		
		//comparamos
		if(long1 == long2) {
			System.out.println("Las longitudes son iguales");
		}else if(long1 > long2) {
			System.out.println(palabra1 + " es mas larga que "+palabra2);
		}else {
			System.out.println(palabra2+" es las larga que "+palabra1);
		}
	}
}
