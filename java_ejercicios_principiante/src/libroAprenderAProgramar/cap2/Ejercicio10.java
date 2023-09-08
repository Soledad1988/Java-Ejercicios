package libroAprenderAProgramar.cap2;

import java.util.Scanner;

//Pedir un número de 0 y 99.999 y decir si es capicua
public class Ejercicio10 {

	public static void main(String[] args) {
		
		int dm, um, c, d, u;
		boolean capicua = false;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese un número entre 0 y 99.999: ");
		int num = p.nextInt();
		
		u = num%10; //unidades
		num = num/10;
		
		d = num%10; //decenas
		num = num/10;
		
		c = num%10; //centenas
		num = num/10;
		
		um = num%10; //unidades de Mil
		num = num/10;
		
		dm = num; //decenas de mil
		
		//si el número tiene 5 cifras
		if(dm != 0 || dm ==u && um==d) {
			capicua = true;
		}
		//si el número tiene 4 cigras
		if(dm==0 && um!=0 && um==u && c==d) {
			capicua = true;
		}
		
		//si el número tiene 3 cifras
		if(dm ==0 && um==0 && c!=0 &&c==u) {
			capicua = true;
		}
		
		//si el número tiene 2 cifras.
		if(dm ==0 && um == 0 && c==0 && d!= 0 &&  d== u) {
			capicua = true;
		}
		
		if(capicua) {
			System.out.println("El número es capicua.");
		}else {
			System.out.println("El número NO es capicua.");
		}
	}
}
