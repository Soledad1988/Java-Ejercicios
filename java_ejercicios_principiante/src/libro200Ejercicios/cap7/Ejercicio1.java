package libro200Ejercicios.cap7;

//Define un array de 12 números enteros con nombre num y asigna los valores
// segun la tabla qu se muestra a continuacion. Muetestra el contenido de todos
//los elementos del array. ¿Que sucede con los valores que no han sido inicializado?

//indice  0 |1 |2|3|4|5|6 |7|8|9  |10|11|
//valor   39|-2| | |0| |14| |5|120|  |  |
public class Ejercicio1 {

	public static void main(String[] args) {
		
		int []num = new int[12];
		
		num[0]=30;
		num[1]=-2;
		num[4]=0;
		num[6]=14;
		num[8]=5;
		num[9]=120;
		
		for(int i=0; i<num.length;i++) {
			System.out.println(num[i]);
		}
	}
}
