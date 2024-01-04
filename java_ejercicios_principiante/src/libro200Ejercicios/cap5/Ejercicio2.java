package libro200Ejercicios.cap5;

//Muestra los números multiplos de 5 de 0 a 100 utilizando un bucle while
public class Ejercicio2 {

	public static void main(String[] args) {
		int numero = 0;
		
		while(numero <= 100) {
			
			if(numero % 5 == 0 ) {
				System.out.println(numero);
			}
			numero++;
		}
	}
}
