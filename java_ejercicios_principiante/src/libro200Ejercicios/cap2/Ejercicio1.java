package libro200Ejercicios.cap2;

//Escribe un programa en el que se declaren las variables enteras x e y. Asignales los valores
//144 y 999 respectivamente. A continuacion, muestra por pantalla  el valor de cada variable 
//la suma, la resta, la division y la multiplicacion
public class Ejercicio1 {

	public static void main(String[] args) {
		
		int x = 144;
		int y = 999;
		
		int suma = x + y;
		int resta = x - y;
		int division = y/x;
		int mult = x * y;
		
		System.out.println("suma: "+suma);
		System.out.println("resta: "+resta);
		System.out.println("division: "+division);
		System.out.println("multiplicacion: "+mult);
	}
}
