package libroAprenderAProgramar.cap10;

import java.util.Scanner;
import java.io.*;

//Realizar un programa que solicite al usuario el nombre de un fichero de texto
//y muestre su contenido en pantalla. Si no se proporciona ningun nombre de fichero,
//la aplicacion utilizara por defecto prueba.txt
public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		final String POR_DEFECTO = "prueba.txt";
		
		System.out.println("Escriba el nombre del fichero: ");
		String nombreFichero = p.nextLine();
		
		if(nombreFichero.isEmpty()) {
			nombreFichero = POR_DEFECTO;
		}
		
		try {
			BufferedReader f = new BufferedReader(new FileReader(nombreFichero));
			
			int c = f.read();
			while(c != -1) {
				System.out.println((char) c);
				c = f.read();
			}
			f.close();
		}catch(EOFException | FileNotFoundException eof){
			System.out.println("Fichero no se puedo abrir");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
