package libro200Ejercicios.cap3;

import java.util.Scanner;

//Realiza un programa que pida dos numeros y que cuando muestre el resultado de sul multiplicacion
public class Ejercicio1 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int multiplicacion;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		num1 = p.nextInt();
		
		System.out.println("Ingrese otro número: ");
		num2 = p.nextInt();
		
		multiplicacion = num1 * num2;
		
		System.out.println("El resultado de la multiplicacion entre el número: "+num1+" y el número "+num2+" es: "+multiplicacion);
	}
}
