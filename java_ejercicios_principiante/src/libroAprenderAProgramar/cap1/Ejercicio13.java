package libroAprenderAProgramar.cap1;

import java.util.Scanner;

//Modificar el ejercicio anterior par que, indicando 2 números n y m, nos diga que cantidad
//hay que sumarle a n para que sea múltiplo de m.
public class Ejercicio13 {

public static void main(String[] args) {
		
		int n;
		int m;
		int resto;
		int suma;
		int multiplo;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		n = p.nextInt();
		
		System.out.println("Ingrese otro número: ");
		m = p.nextInt();
		
		resto = n % m;
		
		suma = m - resto ;
		
		multiplo = n % m == 0 ? 0 : suma;
		
		System.out.println("Debe sumar: "+ multiplo);
		
	}
}
