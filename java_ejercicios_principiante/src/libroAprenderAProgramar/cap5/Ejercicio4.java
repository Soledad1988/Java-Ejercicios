package libroAprenderAProgramar.cap5;

import java.util.Arrays;
import java.util.Scanner;

//Implmentar un programa que inicialice una tabla con nuestros numeros favoritos.
//S continuacion pedir al usuario el indice de un elemento que sera eliminado de la tabla
//Continuaremos eliminndo elementos hasta que el indice introducido sea negativo
//o hasta que no existan mas elementos que borrar. Es imprecindible controlar
//que el indice leido corresponde a un dato  valido
public class Ejercicio4 {

	//Genera un bucle infinito
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		int tabla[] = {10, 8, -2, 96};
		
		int numElemento = tabla.length;
		
		//mostramos loe elemntos de la tabla:
		System.out.println(Arrays.toString(tabla));
		
		System.out.println("Indice del elemnto a borrar: ");
		int indiceBorrar = p.nextInt();
		
		while(indiceBorrar >=0 && numElemento != 0) {
			if(indiceBorrar < numElemento) {
				tabla[indiceBorrar] = tabla[numElemento - 1];
				numElemento--;
				mostrarTabla(tabla, numElemento);
			}else {
				System.out.println("No existen elemntos para borrar");
			}
			System.out.println("Indice del elemento a borrar: ");
			indiceBorrar = p.hashCode();
		}
	}
	
	static void mostrarTabla(int a[], int n) {
		System.out.print("[");
		for(int i = 0; i < n; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
	}
}
