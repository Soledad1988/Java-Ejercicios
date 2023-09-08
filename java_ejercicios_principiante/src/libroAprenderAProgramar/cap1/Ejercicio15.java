package libroAprenderAProgramar.cap1;

import java.util.Scanner;

//Dado un polinomio de segundo grado y= ax al cuadrado + bx+c
//Crear un programa que pida los coeficientes a, b y c, asi como el valor de x y calcule el valor correspondiente de y
public class Ejercicio15 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double discriminante;
		
		System.out.println("Ecuaciones de segundo grado.");
	    System.out.println("ax^2 + bx + c = 0");
		
		Scanner p = new Scanner(System.in);
		System.out.println("Ingrese el coeficiente de a: ");
		a = p.nextDouble();
		
		System.out.println("Ingrese el coeficiente de b: ");
		b = p.nextDouble();
		
		System.out.println("Ingrese el coeficiente de c: ");
		c = p.nextDouble();
		
		
		discriminante = b * b - (4 * a * c);
		
		double x1 = (-b + Math.sqrt(discriminante))/(2 * a);
		double x2 = (-b - Math.sqrt(discriminante))/(2 * a);
		
		double discrimiananteSolucion = discriminante > 0? x1 : x2;
		double discriminanteCero = discriminante < 0? 0 : discrimiananteSolucion;
		
	}
}
