package libro200Ejercicios.cap4;

import java.util.Scanner;

//Escribe un programa que dada una hora determinada (hora y minutos),
//calcule los segundos que faltan para llegar a la medianoche
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		
		int hora;
		int minutos;
		
		System.out.println("Ingrese la hora: ");
		hora = p.nextInt();
		
		System.out.println("Ingrese los minutos: ");
		minutos = p.nextInt();
		
		int segundosTranscurridos = (hora * 3600) + (minutos * 60);
	    int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
	            
	    System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos.", hora, minutos, segundosHastaMedianoche);
	  
		
	}
}
