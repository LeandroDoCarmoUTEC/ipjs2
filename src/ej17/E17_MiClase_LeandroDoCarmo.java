package ej17;

public class E17_MiClase_LeandroDoCarmo {
	private int numero;
	private String palabra;

	public E17_MiClase_LeandroDoCarmo() { // constructor por defecto

	}

	public E17_MiClase_LeandroDoCarmo(int num, String pal) { // constructor que asigna n�mero y palabra
		this.numero = num;
		this.palabra = pal;
	}

	public E17_MiClase_LeandroDoCarmo(String pal) { // constructor que asigna el valor 1 al n�mero y palabra a la palabra el valor
									// recibido
		this.numero = 1;
		this.palabra = pal;
	}

	public String toString() {
		return "num = " + this.numero + ", cad = " + this.palabra;
	}

	private void aumentaNumero(int num) { // incrementa el valor de n�mero
		this.numero += num;
	}

	/**
	 * Si recibe "blanco" devuelve el largo de palabra, si recibe negro devuelve
	 * n�mero * 10. Si recibe otra cosa lanza una excepci�n
	 * 
	 * @param color Color blanco o color negro
	 * @return int
	 * @throws Exception
	 */
	private int valorPalabra(String color) throws Exception {
		if (color.toLowerCase() == "blanco") {
			return this.palabra.length();
		} else if (color.toLowerCase() == "negro") {
			return this.numero * 10;
		} else {
			throw new Exception("ERROR: Los �nicos colores aceptados son Blanco o Negro");
		}
	}

	// GET AND SET ****************
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

}