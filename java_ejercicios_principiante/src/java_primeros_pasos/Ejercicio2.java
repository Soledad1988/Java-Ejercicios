package java_primeros_pasos;

import java.util.Scanner;

//determinar si una persona pertenece al segmento de ingresos altos
public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Por favor ingrese el monto total de sus ingresos: ");
		float ing = p.nextFloat();
		
		float ingresos = 489083;
		
		System.out.println("Por favor ingrese la cantidad de vehículos registrados a su nombre: ");
		int auto = p.nextInt();
		
		int vehiculos = 3;
		
		System.out.println("Por favor ingrese la cantidad de inmuebles registrados a su nombre: ");
		int inm = p.nextInt();
		
		int inmueble = 3;
		
		/*System.out.println("Por favor ingrese la letra s para confirmar la tenencia embarcaciones y/o aeronaves: ");
		boolean bienesLujo = p.nextBoolean();
		boolean s = true;*/
		
		if((ing>=ingresos)&&(auto>=vehiculos)&&(inm>=inmueble)) { //&&(bienesLujo==s)
			System.out.println("Usted pertenece al segmeno de altos ingresos.");
		}else{
			System.out.println("No pertenese al segmento de altos ingresos.");
		}
	}
}
