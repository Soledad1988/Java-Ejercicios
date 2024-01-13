package libro200Ejercicios.cap4;

import java.util.Scanner;

//Amplia el programa anterior para que diga la nota del boletin
//insuficiente, suficiente, bien, notable o sobresaliente.
public class Ejercicio8 {

	public static void main(String[] args) {
		

	Scanner p = new Scanner(System.in);
	double nota1;
	double nota2;
	double nota3;
	double media;
	
	System.out.println("Ingrese notas: ");
	System.out.println("nota 1: ");
	nota1 = p.nextDouble();
	System.out.println("nota 2: ");
	nota2 = p.nextDouble();
	System.out.println("nota 3: ");
	nota3 = p.nextDouble();
	
	media = (nota1 + nota2 + nota3)/3;
	
	if(media == 6 ) {
		System.out.println("Suficente");
	}else if(media > 6 && media < 8) {
		System.out.println("Aprobado");
	}else if(media > 8 && media < 10) {
		System.out.println("Notable");
	}else if(media == 10) {
		System.out.println("Sobresaliente");
	}else {
		System.out.println("Insuficiente");
	}
	
	}
}
