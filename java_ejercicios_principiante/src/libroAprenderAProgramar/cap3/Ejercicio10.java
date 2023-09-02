package libroAprenderAProgramar.cap3;

import java.util.Scanner;

//Se desea implementar una aplicacion que pida al usuario que introduzca un numero comprendido entre 1 y 10
//debemos mostrar la tabla de multiplicar de dicho numero. El codigo tendra que asegurarse de que el numero introducido
//se encuentre entre  el 1 y el 10
public class Ejercicio10 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner p = new Scanner(System.in);
		
		do{
			System.out.println("Ingrese un número ");
			numero = p.nextInt();
			
		}while(!(numero >= 1 && numero <= 10));
		
		System.out.println("Tabla del "+numero);
		for(int i = 1; i <=10; i++) {
			System.out.println(numero + " * "+i+" = "+ numero*i);
		}
	}
}
