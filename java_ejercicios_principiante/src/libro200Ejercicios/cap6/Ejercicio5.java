package libro200Ejercicios.cap6;

//Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
//separados por espacios. Muestra el maximo, el minimo y la media de los números
public class Ejercicio5 {

	public static void main(String[] args) {
		
		int numeros;
		int suma = 0;
		int max = 199;
		int min = 100;
		int media;
		
		for(int i = 0; i < 50; i++) {
			numeros = (int)(Math.random()*100 + 100);
			System.out.println(numeros + " ");
			suma += numeros;
			
			if (numeros < min) {
		        min = numeros;
		      }
		      
		      if (numeros > max) {
		        max = numeros;
		      }
		}
		media = suma / 50;
		
		System.out.println("Suma: "+suma);
		System.out.println("Media: "+media);
		System.out.println("Maximo: "+max);
		System.out.println("Minimo: "+min);
	}
}
