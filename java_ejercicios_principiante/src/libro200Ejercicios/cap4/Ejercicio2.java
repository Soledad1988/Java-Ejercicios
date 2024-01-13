package libro200Ejercicios.cap4;

import java.util.Scanner;

//Realizar un programa que ingrese una hora por teclado y que muestre luego buenos dias,
//buenas tardes o buenas noches segun la hora. Se utilizaran los tramos 6 a 12, de 13 a 20
// y de 21 a 5 respectivamente. Solo se tiene en cuenta las horas, los minutos no se deben introducir por teclado
public class Ejercicio2 {

	public static void main(String[] args) {
		
		//<>
		Scanner p = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Ingrese la hora: ");
		hora = p.nextInt();
		
		if(hora >= 6 || hora <= 12 ) {
			System.out.println("Buendos Dias!!");
		}else if (hora >= 13 || hora <= 20  ) {
			System.out.println("Buenas tardes");
		}else if (hora >= 21 || hora <= 6  ) {
			System.out.println("Buenas noches");
		}
		
	}
}
