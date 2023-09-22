package libroAprenderAProgramar.cap6;

import java.util.Scanner;

//Se pide diseñar un traductor que , en primer lugar, nos diga si la frase introducida esta escrita en el idioma
//Javalinda (En cualqioera de sus dialectos), y en caso afirmativo nos muestre  solo el mje sin muletillas
public class Ejercicio9 {

	public static void main(String[] args) {
		final String prefijo = "Javalín, Javalón";
		final String sufijo = "Javalén, len ,len";
		boolean  idiomaJavalinda = false;		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Escriban una frase: ");
		String entrada = p.nextLine();
		
		if(entrada.startsWith(prefijo)) {
			idiomaJavalinda = true;
			entrada = entrada.substring(prefijo.length());
			
		}else if (entrada.endsWith(sufijo)) {
			idiomaJavalinda = true;
			entrada = entrada.substring(0, entrada.length() - sufijo.length());
		}
		
		if(idiomaJavalinda) {
			entrada = entrada.trim();
			System.out.println(entrada);
		}else {
			System.out.println("No esta escrito en el lenguaje javalindia");
		}
	}
}
