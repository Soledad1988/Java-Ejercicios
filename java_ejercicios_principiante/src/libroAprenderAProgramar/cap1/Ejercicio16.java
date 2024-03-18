package libroAprenderAProgramar.cap1;

import java.util.Scanner;

//Diseñar una aplicación que solicite al usuario que introduzca  una cantidad de segundos
//La aplicacion debe mostrar cuantas horas, minuto y segundos hay en el número de segundos 
//introducidos por el usuario.
public class Ejercicio16 {

	public static void main(String[] args) {
		
		//1 hora = 60 minutos
		//1 minuto = 60 segundos	
		int minutos;
		int hora;
		int segundos;
		
		Scanner p = new Scanner(System.in);
		
		
		System.out.println("Ingrese los segundos a convertir: ");
		segundos = p.nextInt();
		
		minutos = segundos / 60;
		segundos = segundos % 60;
		hora = minutos / 60;
		minutos = minutos % 60;
		
		System.out.println("hora: "+hora);
		System.out.println("minutos: "+minutos);
		System.out.println("segundos: "+segundos);
		
		System.out.println(hora+":"+minutos+":"+segundos);
		
		
	}
}
