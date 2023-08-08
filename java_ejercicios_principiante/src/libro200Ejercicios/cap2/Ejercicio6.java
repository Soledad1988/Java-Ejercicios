package libro200Ejercicios.cap2;

//Escribe un programa que calcule el total de una factura a partir de las bases imponibles
//(precio sin iva). La base imponoble estara almacenada en una variable
public class Ejercicio6 {

	public static void main(String[] args) {
		
		final double IVA = 0.21;
		
		double base = 1000;
		double iva = base * IVA;
		double total = base + iva;
		
		System.out.println("Base imponible:$ "+base);
		System.out.println("IVA:$ "+iva);
		System.out.println("Total:$ "+total);
	}
	
}
