package libroAprenderAProgramar.cap1;

import java.util.Scanner;

//Escriba uma aplicacion que pida el año actual y el de nacimiento. Debe calcular su edad
//suponiendo que el año en curso el usuario ya ha cumplido años.
public class Ejercicio3 {


	public static void main(String[] args) {
		
		System.out.println("Ingrese el año actual: ");
		
		
		int añoActual, añoNacimiento;
		
		Scanner p = new Scanner(System.in);
		
		añoActual = p.nextInt();
		System.out.println("Ingrese el año de su nacimiento: ");
		
		añoNacimiento = p.nextInt();
		
		int edadActual = añoActual - añoNacimiento;
		System.out.println("Su edad actual es: "+edadActual);
		
	}
}
