package libro200Ejercicios.cap3;

import java.util.Scanner;

//Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajads, a razon de
//12 dolares la horas
public class Ejercicio8 {

	public static void main(String[] args) {
		
		double precioHora = 12;
		int hora = 12;
		double salario;
		
		Scanner p = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de horas trabajadas: ");
		
		hora = p.nextInt();
		salario = hora * precioHora;
		
		System.out.println("Salario semanal: "+ salario);
	}
}
