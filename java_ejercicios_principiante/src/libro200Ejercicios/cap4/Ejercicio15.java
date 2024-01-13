package libro200Ejercicios.cap4;

import java.util.Scanner;

//Escribe una piramide rellena con un caracter introducido por teclado que podra ser una letra
//un número o un simbolo omo *, + ,-, $. &, etc. El programa debe permitir
// al usuario mediante un menú elegir si el vertice de la piramide esta apuntando
//hacia arriba, abajo, izquierda o derecha
public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
	    String r;
	    int opcion;
	    
		System.out.print("Introduzca un carácter de relleno: ");
		r = p.nextLine();
		    
		System.out.println("Elija un tipo de pirámide");
		System.out.println("1. Con el vértice hacia arriba");
		System.out.println("2. Con el vértice hacia abajo");
		System.out.println("3. Con el vértice hacia la izquierda");
		System.out.println("4. Con el vértice hacia la derecha");
	    opcion = p.nextInt();

		    switch(opcion) {
		      case 1:
		        System.out.println("  " + r);
		        System.out.println(" " + r + r + r);
		        System.out.println(r + r + r + r + r);
		        break;
		      case 2:
		        System.out.println(r + r + r + r + r);
		        System.out.println(" " + r + r + r);
		        System.out.println("  " + r);
		        break;
		      case 3:
		        System.out.println("    " + r);
		        System.out.println("  " + r + " " + r);
		        System.out.println(r + " " + r + " " + r);
		        System.out.println("  " + r + " " + r);
		        System.out.println("    " + r);
		        break;
		      case 4:
		        System.out.println(r);
		        System.out.println(r + " " + r);
		        System.out.println(r + " " + r + " " + r);
		        System.out.println(r + " " + r);
		        System.out.println(r);
		        break;
		      default:
		    }
		  
	}
}
