package libroAprenderAProgramar.cap8;

//Diseñar la clase hora que representa un instante de tiempo compuesto por una hora
//(0 a 23)  y los minutoa.
//Hora(hora, minuto) que construya un objeto con los datos pasados por parametros
//inc(), que incrementa la hora en un minuto.
//setMinutos(valor) que asigna un valor, si tiene sentido,  a los minutos
//setHota(valor) que asigna un valor, si tiene sentido, a la hora.
//toString(), que deuelve un string con la representacion del reloj
public class Ejercicio1 {

	public static void main(String[] args) {
		
		Hora hora = new Hora(11, 30);
		
		System.out.println(hora);
		
		for(int i = 0; i<=61;i++) {
			hora.inc();
		}
		
		System.out.println(hora);
		hora.setHora(20);//cambiamos la hora a las 20
		System.out.println(hora);
	}
}
