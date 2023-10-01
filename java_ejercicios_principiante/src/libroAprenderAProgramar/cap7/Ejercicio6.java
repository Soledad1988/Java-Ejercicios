package libroAprenderAProgramar.cap7;

//Duseñar la clase texto que gestiona una cadena de caracteres con algunas caracteristicas:
//*La cadena de caracteres tendra una longituda maxima que se especifica en el constructir
//*Permitir añadir un caracter, al principio o al final, siempre y cuando exista espacio disponible
//*Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y cuando
//no se rebase el tamaña maximo establecido
//*Es necesario cuantas vocales (mayusculas y minusculas) hay en el texto.
public class Ejercicio6 {

	public static void main(String[] args) {
		
		Texto t = new Texto(5);
		t.agregarPrincipip("ho");
		t.agregarPrincipip(";");
		t.agregar("La");
		t.agregar("X");
		
		t.msotar();
		System.out.println("Numero de vocales: "+t.numVocales());
		
	}
}
