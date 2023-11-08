package libroAprenderAProgramar.cap12;

import java.util.*;


//Repetir el ejercicio anterior, pero esta vez permitir numeros repetidos
//y utilizar numeros aleatorios menores que 10
public class Ejercicio4 {

	public static void main(String[] args) {
		
		List<Integer> lista = new LinkedList<>();
		lista.add((int)(Math.random() * 10));
		
		for(int i=1; i < 20; i++) {
			Integer temp = (int)(Math.random() * 10);
			int IndiceInsercion = 0;
			
			while(IndiceInsercion < i && temp < lista.get(IndiceInsercion)) {
				IndiceInsercion++;
			}
			lista.add(IndiceInsercion,temp);
			
		}
		System.out.println("Numeros aleatorios en orden decrecientes: ");
		System.out.println(lista);
	}
}
