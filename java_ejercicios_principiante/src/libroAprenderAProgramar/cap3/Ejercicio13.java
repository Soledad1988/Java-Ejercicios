package libroAprenderAProgramar.cap3;

import java.util.Scanner;

//Dada 6 notas escribir la cantidad de alumnos aprobados, condicionados(=4) y suspenso.
public class Ejercicio13 {

	public static void main(String[] args) {
		
		int aprobados =0;
		int condicionados = 0;
		int suspenso = 0;
		
		Scanner p = new Scanner(System.in);
		
		for (int i = 0; i<6;i++) {
			System.out.println("Ingrse notas: ");
			int nota = p.nextInt();
			
			if (nota > 4) {
				aprobados++;
			}if(nota == 4) {
				condicionados++;
			}if(nota < 4) {
				suspenso++;
			}
		}
		
		System.out.println("Cantidad de Aprobados: "+aprobados);
		System.out.println("Cantidad de condicionados: "+condicionados);
		System.out.println("Cantidad en suspenso: "+suspenso);
		
	}
}
