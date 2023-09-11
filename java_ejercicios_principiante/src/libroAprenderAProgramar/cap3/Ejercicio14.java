package libroAprenderAProgramar.cap3;

import java.util.Scanner;

//Pedir por consola un numero n y dibujar un triangulo rectangulo de n elemntos de lado
//utilizando para ello asteriscos * ejemplo  para n = 4
//****
//***
//**
//*
public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		System.out.print("Ingrese un número: ");
		int n = p.nextInt();
		
		for(int fila = 1; fila <=n; fila++) {
			for(int col = fila; col <=n; col++)
			System.out.print("* ");
		}
		System.out.println("");
	}
}
