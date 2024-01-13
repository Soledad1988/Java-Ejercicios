package libro200Ejercicios.cap5;

import java.util.Scanner;

//Escribe un programa que calcule la media de un conjunto de números positivos
//introducidos por teclado. A priori, el programa no sabe cuantos números se
//introduciran. El usuario indicara que ha terminado de introducir los datos
//cuando tipee un número negativo
public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		int numero=0;
		int media=0;
		int contador=0;
		int suma=0;

		System.out.println("Ingrese un número: ");	
		while(numero>0){
		contador = numero++;
		suma =+numero;
		media = suma / contador;
		System.out.println("Numeros ingresados: "+media);
		}
		

	}
}
