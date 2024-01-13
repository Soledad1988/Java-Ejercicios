package libro200Ejercicios.cap4;

import java.util.Scanner;

//Escrib eun programa que nos diga los horoscopos a partir del dia y mes de nacimiento
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		int mes;
		int dia;
		String signo = "";
		
		System.out.println("Ingrese el mes de nacimiento: ");
		mes = p.nextInt();
		
		System.out.println("Ingrese el dia de nacimiento: ");
		dia = p.nextInt();
		
		switch(mes) {
		case 1:
			if(dia < 21) {
				signo = "Capricornio";
			}else {
				signo = "Acuario";
			}
			break;
			
		case 2:
			if(dia < 20) {
				signo = "Acuario";
			}else {
				signo = "Piscis";
			}
			break;
			
		case 3:
			if(dia < 21) {
				signo = "Piscis";
			}else {
				signo = "Aries";
			}
			break;
			
		case 4:
			if(dia < 21) {
				signo = "Aries";
			}else {
				signo = "Tauro";
			}
			break;
			
		case 5:
			if(dia < 21) {
				signo = "Tauro";
			}else {
				signo = "Geminis";
			}
			break;
			
		case 6:
			if(dia < 22) {
				signo = "Geminis";
			}else {
				signo = "Cancer";
			}
			break;
			
		case 7:
			if(dia < 22) {
				signo = "Cancer";
			}else {
				signo = "Leo";
			}
			break;
			
		case 8:
			if(dia < 24) {
				signo = "Leo";
			}else {
				signo = "Virgo";
			}
			break;
			
		case 9:
			if(dia < 24) {
				signo = "Virgo";
			}else {
				signo = "Libra";
			}
			break;
			
		case 10:
			if(dia < 24) {
				signo = "Libra";
			}else {
				signo = "Escorpio";
			}
			break;
			
		case 11:
			if(dia < 24) {
				signo = "Escorpio";
			}else {
				signo = "Sagitario";
			}
			break;
			
		case 12:
			if(dia < 23) {
				signo = "Sagitario";
			}else {
				signo = "Capricornio";
			}
			break;
			
		default:
			
		}
		System.out.println("Su Horoscopo es: "+signo);
	}
}
