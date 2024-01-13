package libro200Ejercicios.cap4;

import java.util.Scanner;

//Realizar un minicuestaionario con 10 preguntas tipo test sobre las asignaturas
//que se imparten en el curso. Cada pregunta acertada sumara un punto. El programa
//mostrara al final la calificacion obtenida.
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		
		int puntos = 0;
	    String respuesta;
	    
	    System.out.println("CUESTIONARIO");
	    
	    System.out.println("1. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?");
	    System.out.println("a) int\nb) double\nc) float"); 
	    System.out.print("=> ");
	    respuesta = p.nextLine();
	    
	    if (respuesta.equals("b")) {
	      puntos++;
	      System.out.println("Correcto");
	    } else {
	      System.out.println("Incorrecto");
	    }
	    
	    System.out.println("2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos");
	    System.out.println("a) XML\nb) SELECT\nc) SQL"); 
	    System.out.print("=> ");
	    respuesta = p.nextLine(); 
	    
	    if (respuesta.equals("c")) {
	      puntos++;
	      System.out.println("Correcto");
	    } else {
	      System.out.println("Incorrecto");
	    }
	    
	    System.out.println("\nHa obtenido " + puntos + " puntos.");
	}
}
