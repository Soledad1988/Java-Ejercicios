package ejercicios41_50;

import java.util.Scanner;

//Realiza el control de acceso a una caja fuerte. La combinación será un
//número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
//acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
//y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
//Tendremos cuatro oportunidades para abrir la caja fuerte.
public class Ejercicio_44 {

	
	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		int convinacion = 1234;
		int intento = 1;
		
		while(intento <=4) {
			System.out.println("Ingrese la clave de 4 digitos: ");
			int clave = p.nextInt();
			if(clave == convinacion) {
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
				break;
			}else {
				System.out.println("Lo siento esa no es la combinación");
			}
			
			intento++;
		}

	}
}
