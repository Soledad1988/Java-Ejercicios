package libro200Ejercicios.cap5;

import java.util.Scanner;

//Realiza el control de acceso a una caja fuerte. La combinacion sera un número
//de 4 cifras. El programa nos pedira la combinacion para abrirla
//Si no acertamos, se nos mostrara el mensaje "lo siento, esa no es la combinacion"
//y si acertamos se nos dira "la caja fuerta se ha abierto satifactoriamente"
//tendremos cuatro oportunidades para abrir la caja fuerte
public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		final int COMBINACION = 1234;
		
		boolean resultado = false;
		
		for(int i = 0; i < 4;i++) {
			System.out.println("Ingrese la combinacion de 4 digitos");
			int numeroIngreado = p.nextInt();
			if(numeroIngreado == COMBINACION) {
				resultado = true;
				break;
			}else {
				System.out.println("lo siento, esa no es la combinacion");
			}
		}
		
		 if (resultado) {
		      System.out.println("la caja fuerta se ha abierto satifactoriamente.");
		    } else {
		      System.out.println("Ha agotado las 4 oportunidades.");
		    }
	
	}
}
