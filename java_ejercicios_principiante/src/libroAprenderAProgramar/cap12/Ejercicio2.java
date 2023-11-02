package libroAprenderAProgramar.cap12;

import java.util.*;
;

//Repetir el ejercico anterior, pero ordenar la lista en sentido decerciente
public class Ejercicio2 {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		
		Integer temp;
		for(int i= 0; i < 20; i++ ){
			temp = (int)(Math.random()* 1000);
			lista.add(temp);
		}
		
		System.out.println("Lista con el orden de Insercion: ");
		System.out.println(lista);
		
		//ordenamos la lista en forma Decreciente
		EnterosDecrecientes comp = new EnterosDecrecientes();
		Collections.sort(lista, comp);
		System.out.println("Lista en orden decreciente: ");
		System.out.println(lista);		
		
	}
	
}

class EnterosDecrecientes implements Comparator <Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
}
