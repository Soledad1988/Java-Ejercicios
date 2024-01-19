package libro200Ejercicios.cap6;

//Escribe un programa que muestre la tirada de tres dados. Se debe
//mostrar tambien la suma total (lo puntos que suman los tres dados)
public class Ejercicio1 {

	public static void main(String[] args) {
		int dados;
		int suma = 0;
		
		System.out.println("Números aleatorios: ");
		
		for(int i = 1; i <= 3; i++) {
			dados = (int)(Math.random()*6+1);
			System.out.println(dados);
			suma += dados;
			
		}
		
		System.out.println("suma: " + suma);
		
	
	}
}
