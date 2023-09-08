package libroAprenderAProgramar.cap1;

import java.util.Scanner;
import java.util.Locale;

//Crea un programa que pida la base y la altura de un triangulo  y muestre su area
//area/(base * altura)/2
public class Ejercicio14 {
	
	public static void main(String[] args) {
		
		double base;
		double altura;
		double area;
		
		Scanner p = new Scanner(System.in);
		p.useLocale(Locale.US); //Ingresar decimales con puntos
		
		System.out.println("Ingrese base: ");
		base = p.nextDouble();
		
		System.out.println("Ingrese altura: ");
		altura = p.nextDouble();
		
		area = (base * altura)/2;
		
		System.out.println("El área del triangulo es: "+ area);
	}

}
