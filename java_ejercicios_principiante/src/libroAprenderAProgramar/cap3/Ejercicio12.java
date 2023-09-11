package libroAprenderAProgramar.cap3;

import java.util.Scanner;

//Pedir 5 calificaciones de alumnos y decir al final si hay alguno suspenso. utilizar bandera
public class Ejercicio12 {

	
	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		boolean suspendido = false;
		
		for (int i = 0; i <5;i++) {
			
			System.out.println("Ingresar una nota de 0 a 10: ");
			int nota = p.nextInt();
			
			if(nota < 5) {
				suspendido = true;
			}
		}
		
		if(suspendido) {
			System.out.println("Hay alumnos suspendidos");
		}else {
			System.out.println("No hay alumnos suspendidos");
		}
	}
}
