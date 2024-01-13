package libro200Ejercicios.cap4;

import java.util.Scanner;

//Escribe un programa que pida por teclado un dia de la semana y que diga que asignatura
// toca a primera hora ese dia
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		
		final String LUNES = "Lunes";
		final String MARTES = "Martes";
		final String MIERCOLES = "Miercoles";
		final String JUEVES = "Jueves";
		final String VIERNES = "Viernes";
		
		String dia;
		
		System.out.println("Ingrese Dia: ");
		dia = p.nextLine();
		
		
		switch(dia) {
		
		case LUNES:
			System.out.println("07:30"+" | "+"Matematicas");
			break;
			
		case MARTES:
			System.out.println("07:30"+" | "+"Programación");
			break;
			
		case MIERCOLES:
			System.out.println("07:30"+" | "+"Lengua");
			break;
			
		case JUEVES:
			System.out.println("07:30"+" | "+"Logica");
			break;
			
		case VIERNES:
			System.out.println("07:30"+" | "+"Programación");
			break;
			
		default:
			System.out.println("El dia ingresado no es incorrecto o es fin de semana");
			break;
		}
		
		
		
	}
	
}
