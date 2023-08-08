package libro200Ejercicios.cap2;

//Realizar un conversor de euros a pesos. La cantidad de euros que se quiere
//convertir debera estar almacenada en una variable
public class Ejercicio4 {

	public static void main(String[] args) {
		
		double pesos = 311.27;
		int cantidadEuros = 200;
		
		double total = (int)pesos * cantidadEuros;
		
		System.out.println("Cotización de Euro en pesos: "+pesos);
		System.out.println("Cantidad de Euros a convertir "+cantidadEuros);
		System.out.println("Total "+total);
	}
}
