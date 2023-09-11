package libroAprenderAProgramar.cap4;

//Diseñar una funcion que nos diga si un número es primo
public class Ejercicio6 {

	public static void main(String[] args) {
		
		for(int i = 0; i<=15;i++) {
			if(esPrimo(i)) {
				System.out.println(i + " Es primo");
			}else{
				System.out.println(i + " Es compuesto");
			}
		}
	}
	
	public static boolean esPrimo(int num) {
		boolean primo = true;
		int i = 2;
		
		if(num <2 ) {
			primo = false;
		}
		
		while(i < num  && primo == true) {
			if(num%i==0) {
				primo = false;
			}
			i++;
		}
		
		return primo;
	}
}
