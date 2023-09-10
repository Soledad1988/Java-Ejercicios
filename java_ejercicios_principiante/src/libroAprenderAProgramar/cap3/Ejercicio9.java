package libroAprenderAProgramar.cap3;

import java.util.Scanner;

//Un centro de investigacion de la flora urbana necesita una aplicacion  que muestre cual árbol mas alto
//Para ello se introducira por teclado la altura (en centimetros) de cada arbol (terminando cuando se
//utilice -1 como altura). Los arboles se identifican mediante estiquetas con numeros únicos correlativos
//comenzando con 0. Se pide diseñar una aplicacion que resuelva  el problema planteado.
public class Ejercicio9 {

	public static void main(String[] args) {
		
		int altura;
		int etiquetaArbolMasAlto;
		int alturaArbolMasAlto;
		int etiqueta = 0;
		
		Scanner p = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese la altura en centimetros: ");
			altura = p.nextInt();
		}while(!(altura == -1));
	}
}
