package libro200Ejercicios.cap5;

//Muestra los números de 5 de 0 a 100 utilizando un bucle do-while
public class Ejercicio3 {

	public static void main(String[] args) {
		int numero = 0;
		
		do{
			if(numero % 5 == 0 ) {
				System.out.println(numero);
			}
			numero++;
			
		}while(numero <= 100);
		
			
	}
}
