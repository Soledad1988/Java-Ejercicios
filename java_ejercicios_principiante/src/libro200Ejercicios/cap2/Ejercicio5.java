package libro200Ejercicios.cap2;

//Realizar un conversor de pesos a euros. La cantidad de pesos que se quiere convertir 
//debera estar almacenado en una variable
public class Ejercicio5 {

public static void main(String[] args) {
		
		double euros = 0.0032;
		int cantidadPesos = 15000;
		
		double total = euros * cantidadPesos;
		
		System.out.println("Cotización de Peso en Euros: "+euros);
		System.out.println("Cantidad de Euros a convertir "+cantidadPesos);
		System.out.println("Total "+total);
	}
}
