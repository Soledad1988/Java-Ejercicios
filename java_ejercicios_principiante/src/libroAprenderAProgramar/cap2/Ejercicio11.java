package libroAprenderAProgramar.cap2;

import java.util.Scanner;

//pedir una nota de 0 a 10 y mostrarla de la forma: 
//*Insuficiente ( de 0 a 4)
//*Suficiente (5)
//*Bien (6)
//*Notable (7 y 8)
//sobresaliente (9 y 10)
public class Ejercicio11 {

	public static void main(String[] args) {
		
		int nota;
	
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese la nota: ");
		
		nota = p.nextInt();
		
		if(nota < 5) {
			System.out.println("Insuficiente: "+nota);
		}else if(nota > 4 && nota < 6) {
			System.out.println("Suficiente: "+nota);
		}else if(nota > 5 && nota < 7) {
			System.out.println("Bien: "+nota);
		}else if(nota > 6 && nota < 9) {
			System.out.println("Notable: "+nota);
		}else {
			System.out.println("Sobresaliente: "+nota);
		}
		
		
		
		
	}
}
