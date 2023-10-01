package libroAprenderAProgramar.cap7;

public class Texto {

	private String cad;
	private final int tamMax;
	static final String VOCALES = "aeiouáéíóú";
	
	public Texto(int tamMax) {
		cad = "";
		this.tamMax = tamMax;
		}
	
	//añadir un caracter al final del texto siempre y cuando haya espacio
	public void agregar(char c) {
		if(tamMax > cad.length()) {
			cad = cad + c;
		}
	}
	
	//añadir un cadena al final del texto siempre y cuando haya espacio
		public void agregar(String c) {
			if(tamMax >= cad.length() + c.length()) {
				cad = cad + c;
			}
		}
	
	//añade un caracter al comienzo del texto siempre y cuando haya espacio
	public void agregarPrincipip(char c) {
		if(tamMax > cad.length()) {
			cad = c + cad;
		}
	}
	
	//añade una cadena al comienzo del texto siempre y cuando haya espacio
	public void agregarPrincipip(String c) {
		if(tamMax >= cad.length() + c.length()) {
			cad = c + cad;
		}
	}
	
	public void msotar() {
		System.out.println(cad);
	}
	
	//devuelve las vocales presentes en el texto
	public int numVocales() {
		int voc = 0;
		for(int i = 0; i<cad.length(); i++) {
			if(esVocal(cad.charAt(i))) {
				voc++;
			}
		}
		return voc;
	}
	
	//comprueba si el caracter ingresado es una vocal
	private boolean esVocal(char c) {
		boolean vocal = false;
	
		c = Character.toLowerCase(c);
		
		if(VOCALES.indexOf(c) != -1) {
			vocal = true;
		}
		return vocal;
	}
}
