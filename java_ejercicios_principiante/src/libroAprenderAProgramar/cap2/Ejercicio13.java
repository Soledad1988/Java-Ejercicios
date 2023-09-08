package libroAprenderAProgramar.cap2;

import java.util.Scanner;

//Escriba un programa que pida una hora de forma: hora, minutos y segundos.
//El programa debe mostrar la hora un segundo mas tarde
//hora actual [10:41:59] ---> hora actual + 1 segundo ---> [10:42:00]
public class Ejercicio13 {

	public static void main(String[] args) {
		
		int hora, minuto, segundo;
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese la hora: ");
		hora = p.nextInt();
		
		System.out.println("Ingrse los minutos: ");
		minuto = p.nextInt();
		
		System.out.println("Ingrese los segundos: ");
		segundo = p.nextInt();
		
		segundo++; //incremento de sedundos;
		
		if(segundo > 59) {
			segundo = 0;
			minuto++;
			
			if(minuto > 59) {
				minuto = 0;
				hora++;
				
				if(hora > 23) {
					hora = 0;
				}
			}
		}
		
		System.out.println("Hora mas 1 segundo: "+hora+":"+minuto+":"+segundo);
	}
}
