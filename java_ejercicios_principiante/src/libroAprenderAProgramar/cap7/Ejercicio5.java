package libroAprenderAProgramar.cap7;

//Todas las cuentas Corrientes con las que vamos a trabajar pertenecen al mismo banco
//Añadir un atributo que almacena el nombre del banco (que es único) en la clase CuentaCorriente3
//Diseñar un método que permita modificar el nombre del banco (al que pertenecen todas las cuentas)
public class Ejercicio5 {

	public static void main(String[] args) {
		
		CuentaCorriente3 cuenta1 = new CuentaCorriente3("Pepe","22547741");
		CuentaCorriente3 cuenta2 = new CuentaCorriente3("Ana", "44444555");
		
		cuenta1.mostrarInformacion();
		cuenta2.nombreBanco = "Banco central";
		
		cuenta1.mostrarInformacion();
		CuentaCorriente3.nombreBanco ="Caja de ahorro Do-While";
		
		cuenta1.mostrarInformacion();
		
		CuentaCorriente3.cambiarNombreBanco("If-Else Bank");
		cuenta1.mostrarInformacion();
	}
}
