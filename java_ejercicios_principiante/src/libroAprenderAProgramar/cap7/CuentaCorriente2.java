package libroAprenderAProgramar.cap7;

public class CuentaCorriente2 {

	public String nombre;
	public String dni;
	private double saldo;
	private double limiteDescubierto;

	//constructor para crear cuenta con atributos personalizados
	public CuentaCorriente2(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		saldo = 0;
		limiteDescubierto = -50;
	}
	
	//sobrecargamos constructores -- Ejercicio 2
	public CuentaCorriente2(double saldo) {
		this.nombre = "sin asignar";
		this.dni = "sin asignar";
		this.saldo = 0;
		this.limiteDescubierto = 0;
	}
	
	//sobrecargamos constructores -- Ejercicio 2
	public CuentaCorriente2(double saldo, double limiteDescubierto,String dni) {
		this.nombre = "sin asignar";
		this.dni = dni;
		this.saldo = saldo;
		this.limiteDescubierto = limiteDescubierto;
	}
	
	
	public boolean sacarDinero(double dinero) {
		boolean operacionPosible = true;
		if((saldo - dinero) >= limiteDescubierto) {
			saldo -= dinero;
		}else {
			System.out.println("No hay dinero suficiente");
			operacionPosible = false;
		}
		return operacionPosible;
	}
	
	public void ingresarDinero(double dinero) {
		saldo += dinero;
	}
	
	public void mostrarInformacion() {
		System.out.println("Nombre: "+nombre);
		System.out.println("DNI: "+dni);
		System.out.println("Saldo: "+saldo);
		System.out.println("Limite de Descubierto: "+limiteDescubierto);
	}
	
}
