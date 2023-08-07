package libro200Ejercicios;

//modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura
//con un color diferente
public class Ejercicio5 {

	public static void main(String[] args) {
		
		System.out.println("------------------------------------------------");
		System.out.println("\tMaterias\tDia\tHorario");
		System.out.println("------------------------------------------------");
		System.out.println("\t\033[31mProgramación\tLunes\t15:00hs");
		System.out.println("\t\033[32mMatematicas\tMartes\t16:00hs");
		System.out.println("\t\033[34mInformatica\tMartes\t17:30hs");
		System.out.println("\t\033[37mEstadistica\tJueves\t17:00hs");
		System.out.println("------------------------------------------------");
	}
}
