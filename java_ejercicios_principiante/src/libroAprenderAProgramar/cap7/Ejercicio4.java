package libroAprenderAProgramar.cap7;

//Modificar la visibilidad de la clase CuentaCorriente2 para que sea visible desde
//clases externas y la visibilidad de sus atributos para que:
//*saldo y limite no sean visibles para otra clase
//*nombres ea publico para cualquier clase
//*dni solo sea visible por clases vecinas
public class Ejercicio4 {

	public static void main(String[] args) {
		
		CuentaCorriente2 cuenta1 = new CuentaCorriente2("Pepe", "25436987");
		
		//cuenta1.saldo = 2000; no es visible
		cuenta1.dni="11111111";
		cuenta1.nombre = "Antonio";
		//cuenta1.limite = -100; atributo privado no es accesible fuera de su clase
	}
}
