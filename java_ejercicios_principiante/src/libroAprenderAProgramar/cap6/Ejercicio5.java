package libroAprenderAProgramar.cap6;

import java.util.Scanner;

//Pedir el nombre completo (nombre y apellido) al usuario. El programa debe eliminar
//cualquier vocal del nombre ej: "Alvaro Perez" --> "Ivr Prz". solo se eliminan las vocales(minusculas, mayusculas y acentuadas).
//El resto de caracteres no se modifica.
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		
		String nombre;
		String sinVocal ="";
		char c;
		
		System.out.println("Escriba su nombre: ");
		nombre = p.nextLine();
		
		for(int i = 0; i < nombre.length(); i++) {
			c = nombre.charAt(i);
			
			if(!esVocal(c)) {
				sinVocal = sinVocal + c;
			}
		}
		System.out.println(sinVocal);
	}
	
	static boolean esVocal(char c) {
		boolean result;
		String vocales = "aeiouáéíóú";
		c = Character.toLowerCase(c);
		if(vocales.indexOf(c) == -1) {
			result = false;
		}else {
			result = true;
		}
		return result;
	}
}
