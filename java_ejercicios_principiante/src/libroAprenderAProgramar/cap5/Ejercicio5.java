package libroAprenderAProgramar.cap5;

import java.util.Arrays;
import java.util.Scanner;

//Desarrolla el juego la camara secerta, que consiste abrir una camara mediante su combinacion secreta
//que esta formada por una combinacion de digitos del 1 al 5.
//El jugador espedificara cual es la longitud de la combinacion, a mayor longitud mayor dificultad en el juego
//La aplicacion genera de forma aleatoria una combimacion secreta que el usuario tendra que acertar.
//En cada  intento se muestra como pista, para cada digito  de la combinacion introdicida  por el jugador
//si es mayor, menor o igual que el correspondiente en la combinacion secreta
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		
		System.out.print("Ingresar la longitud: ");
		int longitud = p.nextInt();
		
		int combinacionSecreta[] = new int [longitud];
		int combinacionJugador [] = new int[longitud];
		
		generarCombinacion(combinacionSecreta);
		System.out.println(Arrays.toString(combinacionSecreta));//muestra la combinacion generada aleatoriamente
		System.out.println("Escriba una combinacion: ");
		leerTabla(combinacionJugador);
		
		while(!Arrays.equals(combinacionSecreta, combinacionJugador)) {
			System.out.println("Escriba una combinacion: ");
			leerTabla(combinacionJugador);
		}
		
		System.out.println("La camara esta abierta!!!");
	}
	
	
	
	//función generar combinacion
	static void generarCombinacion(int t[]) {
		final int MAXIMO = 5;
			for(int i = 0; i < t.length; i++) {
				t[i] = (int)(Math.random()*MAXIMO+1);
			}
	}
	
	//función recorrer tabla
	static void leerTabla(int t[]) {
		Scanner p = new Scanner(System.in);
		for(int i = 0; i<t.length;i++) {
			t[i] = p.nextInt();
		}
	}
	
	//funcion mostrar pistas:
	static void mostrarPistas(int secerto[], int jugador[]) {
		for(int i = 0; i<jugador.length;i++) {
			System.out.print(jugador[i]);
			
			if(secerto[i] > jugador[i]) {
				System.out.println("Mayor");
			}else if(secerto[i] < jugador[i]) {
				System.out.println("Menor");
			}else {
				System.out.println("Iguales");
			}
		}
	}
}
