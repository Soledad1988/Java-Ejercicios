package libro200Ejercicios.cap7;

import java.util.Scanner;

//Escribe un programa que lea 10 números por teclado y que luego los muestre
//en orden inverso, es decir, el primero que se introduce es el ultimo en mostrarse
//y viceversa
public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		int []num = new int[10];
		int i;
		System.out.println("Ingrese 10 números: ");
		
		for(i = 0; i<num.length; i++) {	
			num[i] = p.nextInt();
		}
		
		//Mostramos lo numeros de manera inversa
		for (i = 9; i >= 0; i--) {
		      System.out.println(num[i]);
		}	
		
	}
}
