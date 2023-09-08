package libroAprenderAProgramar.cap2;

import java.util.Scanner;

//Pedir el dia, mes y año de una fecha e indicar si al fecha es correcta. Recordemos que
//existen meses con 28, 30 y 31 dias. No se consideran los años bisiestos
public class Ejercicio12 {

	//da error
	public static void main(String[] args) {
		
		int dia;
		int mes = 0;
		int año;
		boolean fechaCorrecta = true;
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese el dia: ");
		dia = p.nextInt();
		
		System.out.println("Ingrese el mes: ");
		dia = p.nextInt();
		
		System.out.println("Ingrese el año: ");
		año = p.nextInt();
		
		if (año == 0) {
			fechaCorrecta = false;
		}else {
			//febrero
			if(mes == 2 && (1 <= dia && dia <=28)) {
				fechaCorrecta = true;
			}else //meses de 30 días
			if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (1 <= dia && dia <=30)) {
				fechaCorrecta = true;
			}else //meses de 31 días
			if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (1 <= dia && dia <=31)) {
					fechaCorrecta = true;
			}else {
				fechaCorrecta = false;
			}
			
		}
		if(fechaCorrecta) {
			System.out.println("Fecha correcta: "+dia+"/"+mes+"/"+año);
		}else {
			System.out.println("Fecha incorrecta");
		}
	}
	
}
