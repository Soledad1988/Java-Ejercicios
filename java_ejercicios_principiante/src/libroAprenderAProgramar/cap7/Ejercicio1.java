package libroAprenderAProgramar.cap7;

//Diseñar la clase Cuentacorriente sabiendo que los datos necesarios son saldo, limite de descubierto
//nombre, DNI del titular. las operaciones tipicas
//*crear cuenta: se necesita el nombre y el dni del titular. el saldo inicial sera 0 y el limite de descubierto -50
//*sacar dinero: solo se podra sacr dinero hasta el limite de descubierto. El metodo debe indicar si ha sido posible llevar a cabo la operacion
//*ingresar dinero: se incrementa el saldo
//*mostrar informacion: muestra la informacion disponible de la cuenta corriente
public class Ejercicio1 {

	public static void main(String[] args) {
		
		CuentaCorriente cuenta1 = new CuentaCorriente("Juan","25436987");
		
		cuenta1.limiteDescubierto = -100;
		
		cuenta1.ingresarDinero(1000);
		cuenta1.sacarDinero(300);
		cuenta1.mostrarInformacion();
		
		System.out.println("Puedo sacar $700: "+cuenta1.sacarDinero(700));
		System.out.println("Puedo sacar $500: "+cuenta1.sacarDinero(500));
	}
}
