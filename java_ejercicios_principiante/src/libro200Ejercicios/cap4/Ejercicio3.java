package libro200Ejercicios.cap4;

import java.util.Scanner;

//Escriba un programa en que dado un número del 1 al 7 escriba el correspondiente
// nombre de dia de la semana
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		int dia;
		
		System.out.println("Ingrese el número de dia: ");
		dia = p.nextInt();
		
		switch(dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
			
		default:
			System.out.println("El número ingresado no es correcto");
		

		}
	}
}
