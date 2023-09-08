package libroAprenderAProgramar.cap2;

import java.util.Scanner;

//Idear un programa que solicite al usuario un número comprendido entre 1 y 7
//correspondiente a un dia de la semana. se debe mostrar el nombre del dia de la semana
//al que corresponde. Ejemplo 1 corresponde la Lunes, 6 al dia Sabado
public class Ejercicio15 {

	public static void main(String[] args) {
		
		int dia;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese un número del 1 al 7: ");
		dia = p.nextInt();
		
		switch(dia) {
		
		case 1:
			System.out.println("Lunes");
			break;
			
		case 2:
			System.out.println("Martes");
			break;
			
		case 3:
			System.out.println("Miercoles");
			break;
			
		case 4:
			System.out.println("Jueves");
			break;
			
		case 5:
			System.out.println("Viernes");
			break;
			
		case 6:
			System.out.println("Sabado");
			break;
			
		case 7:
			System.out.println("Domingo");
			break;
			
		default:
			System.out.println("El número es incorrecto");
			break;
		}
	}
}
