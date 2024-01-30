package libro200Ejercicios.cap7;

//Define un array de 10 caracteres con el nombre simbolo.
//y asigna valores a los elementos segun la tabla que se muestra a continuacion
//Muestre el contenido de todos los elementos del array. 
//¿Que sucede con los valores que no han sido inicializado?
public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		char []simbolos = new char[10];
		
		simbolos[0]='a';
		simbolos[1]='x';
		simbolos[4]='@';
		simbolos[6]=' ';
		simbolos[7]='+';
		simbolos[8]='Q';
		
		for(int i=0; i<simbolos.length;i++ ) {
			System.out.println(simbolos[i]);
		}
		
	}

}
