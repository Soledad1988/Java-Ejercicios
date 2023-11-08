package libroAprenderAProgramar.cap12;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//Crear una coleccion de 20 numeros enteros aleatorios distintos menores que 100
//guardarlos por orden decreciente a medida que se vayan generando y mostrar la coleccion por pantalla
public class Ejercicio3 {

	public static void main(String[] args) {
		
		Set<Integer> conj = new TreeSet<>(new EnterosDecreciente());
		
		while(conj.size() < 20) {
			Integer temp = (int)(Math.random()*100);
			conj.add(temp);
		}
		System.out.println("Numeros aleatorios insertados aleatoriamente en orden decrecienre: ");
		System.out.println(conj);
	}
}

class EnterosDecreciente implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		return (Integer) o2 - (Integer) o1;
	}
}
