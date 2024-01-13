package libro200Ejercicios.cap5;

import java.util.Scanner;

//Muestra la tabla de multiplicar de un número introducido por teclado
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		
		int numero;
		System.out.println("Ingrese un número: ");
		numero = p.nextInt();
		
		for(int i = 0; i <= 10; i++) {
			 System.out.printf("%d x %2d = %3d\n", numero, i, numero * i);
		}
	}
}
