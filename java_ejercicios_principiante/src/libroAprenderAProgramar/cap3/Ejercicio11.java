package libroAprenderAProgramar.cap3;

//diseñar una aplicacion que muestre las tablas de multiplicar del 1 al 10
public class Ejercicio11 {

	public static void main(String[] args) {
		
		for(int tabla = 1; tabla<=10; tabla++) {
			System.out.println("\n\nTabla del 0"+tabla);
			
			for (int i = 1; i <= 10; i++) {
				System.out.println(tabla + " * "+i+" =  "+tabla * i);
			}
		}
	}
}
