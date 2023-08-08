package libroAprenderAProgramar;

//El tipo short permite almacenar valores comprendidos entre -32768 y 32767. Se pide
//escribir un programa que compruebe que el rango de valores de un tipo se comporta de forma
//ciclica, es decir, el valor siguiente al maximo es el valor minimo y viceversa
public class Ejercicio4 {

	public static void main(String[] args) {
		
		short num;
		num = (short) 32767;
		
		System.out.println("Valor máximo para el tipo short: "+num);
		
		num++;
		
		System.out.println("Valor minimo para el tipo short: "+num);
	}
}
