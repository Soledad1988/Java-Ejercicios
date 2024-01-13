package libro200Ejercicios.cap6;

//Escribe un programa que muestre la tirada de tres dados. Se debe
//mostrar tambien la suma total (lo puntos que suman los tres dados)
public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("3 Números aleatorios: ");
		
		for(int i = 1; i <= 3; i++) {
			System.out.println((int)(Math.random()*11));
			
		}
	
		
	
	}
}
