package libroAprenderAProgramar.cap7;

public class CuentaCorriente3 {

	public String nombre;
	public String dni;
	public double saldo;
	public double limiteDescubierto;
	
	//nombre del banco por defecto
	static String nombreBanco = "Internacional Java Bank";

	//constructor para crear cuenta con atributos personalizados
	public CuentaCorriente3(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		saldo = 0;
		limiteDescubierto = -50;
	}
	
	//sobrecargamos constructores -- Ejercicio 2
	public CuentaCorriente3(double saldo) {
		this.nombre = "sin asignar";
		this.dni = "sin asignar";
		this.saldo = 0;
		this.limiteDescubierto = 0;
	}
	
	//sobrecargamos constructores -- Ejercicio 2
	public CuentaCorriente3(double saldo, double limiteDescubierto,String dni) {
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
		System.out.println("Banco: "+nombreBanco);
	}
	
	//cambiar el nombre del banco
	static void cambiarNombreBanco(String nuevoNombre) {
		nombreBanco = nuevoNombre;
	}
}
