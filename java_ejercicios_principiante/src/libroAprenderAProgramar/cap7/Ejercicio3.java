package libroAprenderAProgramar.cap7;

//Para la clase Cuentacorriente escribir un programa  que compruebe el funcionamiento
//de sus metodos, incluido los contructores
public class Ejercicio3 {

	public static void main(String[] args) {
		
		CuentaCorriente cuenta1 = new CuentaCorriente("Pepe", "25436987");
		
		cuenta1.limiteDescubierto = -100;
		
		cuenta1.ingresarDinero(1000);
		cuenta1.sacarDinero(300);
		cuenta1.mostrarInformacion();
		
		System.out.println("Puedo sacar $700: "+cuenta1.sacarDinero(700));
		System.out.println("Puedo sacar $500: "+cuenta1.sacarDinero(500));
		
		//vamos a probar el constructor que solo utiliza el saldo
		cuenta1 = new CuentaCorriente(100);
		cuenta1.mostrarInformacion();
		
		cuenta1 = new CuentaCorriente(2000, -300, "50348796");
		cuenta1.mostrarInformacion();
	}
}
