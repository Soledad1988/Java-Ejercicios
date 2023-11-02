package libroAprenderAProgramar.cap12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// crear una colleccion de 20 numeros enteros aleatorios menores que 100
// y guardarlos en el orden en el que se vayan generando; mostrat por pantalla
// dicha lista una vez creada.
//Ordenar en sentido creciente y volver a mostrar por pantalla
public class Ejercicio1 {
	public static void main(String[] args) {
	
		List<Integer> lista = new ArrayList<>();
		
		Integer temp;
		for(int i= 0; i < 20; i++ ){
			temp = (int)(Math.random()* 1000);
			lista.add(temp);
		}
		
		System.out.println("Lista con el orden de Insercion: ");
		System.out.println(lista);
		//ordenamos la lista
		Collections.sort(lista);
		System.out.println("Lista en orden creciente: ");
		System.out.println(lista);
			
		
	}
}
