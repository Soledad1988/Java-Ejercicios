package libro200Ejercicios.cap4;

import java.util.Scanner;

//Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5
public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		int num;
		
		System.out.println("Ingrese un número: ");
		num = p.nextInt();
		
		if((num%2==0)  && (num%5==0)) {
			System.out.println("El número es par  y divisible por 5: ");
		}else if(num%5==0) {
			System.out.println("El número es divisible por 5: ");
		}else if((num%2==0)) {
			System.out.println("El número es par: ");
		}else {
			System.out.println("El número no es par ni divisible por 5: "+"el nùmero es " + num);
	}}
}
