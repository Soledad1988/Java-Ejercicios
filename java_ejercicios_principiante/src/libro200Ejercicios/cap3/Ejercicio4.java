package libro200Ejercicios.cap3;

import java.util.Scanner;

//Escribe un programa que sume, reste, multiplique y divida 2 números introducidos por teclado
public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int suma, resta;
		int multiplicacion, division;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		num1 = p.nextInt();
		
		System.out.println("Ingrese otro número: ");
		num2 = p.nextInt();
		
		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1 * num2;
		division = num1/num2;
		
		System.out.println("La suma de "+num1+" y "+num2+" es: "+suma);
		System.out.println("La resta de "+num1+" y "+num2+" es: "+resta);
		System.out.println("La multiplicacion de "+num1+" y "+num2+" es: "+multiplicacion);
		System.out.println("La división de "+num1+" y "+num2+" es: "+division);
	}
}
