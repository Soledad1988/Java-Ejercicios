package libro200Ejercicios.cap5;

//Muestra los números multiplos de 5 de 0 a 100 utilizando un bucle for
public class Ejercicio1 {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 100; i++) {
			if(i % 5 == 0 ) {
				System.out.println(i);
			}
				
		}
	}
}
