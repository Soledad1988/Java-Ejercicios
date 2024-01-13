package libro200Ejercicios.cap4;

import java.util.Scanner;

//Escribe un programa que ordene tres número enteros introducidos por teclado
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Ingrese los nùmeros: ");
		num1 = p.nextInt();
		num2 = p.nextInt();
		num3 = p.nextInt();
		
		if((num1 > num2) && (num2 > num3)){
			System.out.println("Nùmeros ordenado: "+num1+" , "+num2+" , "+num3 );
		}else if((num2 > num1) && (num2 > num3)&& (num3 > num1)) {
			System.out.println("Nùmeros ordenado: "+num2+" , "+num3+" , "+num1 );
		}else {
			System.out.println("Nùmeros ordenado: "+num3+" , "+num2+" , "+num1 );
		}
	}
}
