package ejercicios41_50;

//numeros aleatorios Math.random()
public class Ejercicio_49 {

	public static void main(String[] args) {
		
		System.out.println("20 números aleatorios entre 1 y 10 (sin decimales):");
		
		for(int i = 1; i <= 20; i++) {
			System.out.print((int)(Math.random()*10+1) + " ");
		}
		
		System.out.println();
	}
}
