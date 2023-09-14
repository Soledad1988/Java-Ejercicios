package libroAprenderAProgramar.cap7;

//En la clase CuentaCorriente sobrecargar los constructores para que permita crear objetos
//*Solo con el saldo inicial, no seran necesarios los datos del titular. por defecto el limite sera 0
//*con un  saldo inicial, con un limite descubierto y con DNI del titular de la cuenta
public class Ejercicio2 {

	public static void main(String[] args) {
		
	
	CuentaCorriente cuenta1 = new CuentaCorriente("Juan","25436987");
	CuentaCorriente cuenta2 = new CuentaCorriente(1000);
	CuentaCorriente cuenta3 = new CuentaCorriente(1000, 50 ,"25436987");
	
	cuenta1.mostrarInformacion();
	cuenta2.mostrarInformacion();
	cuenta3.mostrarInformacion();
	
	
	}
	
}
