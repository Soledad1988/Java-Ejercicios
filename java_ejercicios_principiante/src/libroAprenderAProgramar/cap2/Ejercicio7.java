package libroAprenderAProgramar.cap2;

import java.util.Scanner;

//Pedir tres numeros y mostrarlos ordenados de mayor a menor
public class Ejercicio7 {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		num1 = p.nextInt();
		
		System.out.println("Ingrese otro número: ");
		num2 = p.nextInt();
		
		System.out.println("Ingrese otro número: ");
		num3 = p.nextInt();
		
		if(num1 > num2 && num1 > num3 && num2 > num3) {
			System.out.println(num1+" "+num2+" "+num3);
		}else {
			if(num2 > num1 && num2 > num1 && num1 > num3) {
				System.out.println(num2 + " "+num1+" "+num3);
			}else {
				System.out.println(num3 + " "+num2+" "+num1);
			}
		}
	}
}
