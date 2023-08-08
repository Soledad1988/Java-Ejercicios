package libroAprenderAProgramar;

import java.util.Locale;
import java.util.Scanner;

//Seria interesante disponer de un programa que  pida como entrada un número decimal y lo
//muestre redondeado al entero mas proximo
public class Ejercicio7 {

	public static void main(String[] args) {
		
		System.out.println("Ingrese un número decimal (Utilizar come no punto): ");
		
		double numero;
		int redondeo;
		
		Scanner p = new Scanner(System.in);
		
		numero = p.nextDouble();
		
		redondeo = (int) (numero + 0.5);
		
		System.out.println("El número ingresado es: "+numero + "Su redondeo es: "+redondeo);
	}
}
