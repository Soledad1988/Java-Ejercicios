package libroAprenderAProgramar.cap3;

//Diseñe un programa que muestre el producto de los 10 primero numeros impares
public class Ejercicio7 {

	public static void main(String[] args) {
		
		double producto = 1;
		
		for(int i=1;i<20;i+=2) {
			producto = producto *  i;
		}
		System.out.println("El producto de los 10 primeros números es "+producto);
	}
}
