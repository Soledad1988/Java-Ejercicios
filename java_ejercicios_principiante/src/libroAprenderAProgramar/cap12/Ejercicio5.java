package libroAprenderAProgramar.cap12;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

//Introducir por teclado hasta que se introduzca "fin" , una serie de nombre
//que se insertara en una coleccion, de forma que se conserve el orden de insercion
// y que no pedan repetirse. Mostrar la lista por pantalla
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		Set<String> nombre = new LinkedHashSet<>();
		
		System.out.println("Introdicri la palabra FIN para trminar: ");
		String temp = p.nextLine();
		while(!temp.equals("fin")) {
			nombre.add(temp);
			System.out.println("Introducir nombre: ");
			temp = p.nextLine();
		}
		System.out.println("Lista de nombre sin repetidos: " + nombre);
	}
}
