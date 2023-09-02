package libroAprenderAProgramar.cap3;

import java.util.Scanner;

//Realizar el juego "El numero secreto" que consiste en acertar un número desconocido
//(gerenados aleatoriamnete entre 1 y 100). Pra ellos se leen por teclado uan seri de números
//para los que indica: "mayor" o "menor", segun sea mayor o menor con respecto al numero secreto.
//El proceso termina cuando el usuario acierta o cunado se rinde (Introduciendo un -1)
public class Ejercicio3 {

	public static void main(String[] args) {
		
		int numeroSecreto = (int)(Math.random() * 100 + 1);
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Introduzca un número del 1 al 100 ");
		int num = p.nextInt();
		
		while(num != numeroSecreto && num!=-1 ) {
			if(numeroSecreto<num) {
				System.out.println("Menor");
			}else {
				System.out.println("Mayor");
			}
			
			System.out.println("Introduzca otro número: ");
			num = p.nextInt();
		}
		
		if(numeroSecreto == num) {
			System.out.println("Felicidades....");
		}else {
			System.out.println("Otra vez será :)");
		}
	}
}
