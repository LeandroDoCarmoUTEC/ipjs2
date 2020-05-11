package ej15;

public class E15_MiClase_LeandroDoCarmo {
	private int numero;
	private String palabra;
	
	
	public E15_MiClase_LeandroDoCarmo() { // constructor por defecto
		
	}
	
	public E15_MiClase_LeandroDoCarmo(int num, String pal) { // constructor que asigna número y palabra
		this.numero = num;
		this.palabra = pal;
	}
	
	public E15_MiClase_LeandroDoCarmo(String pal) { // constructor que asigna el valor 1 al número y palabra a la palabra el valor recibido
		this.numero = 1;
		this.palabra = pal;
	}
	
	public String toString() {
        return "num = " + this.numero + ", cad = " + this.palabra;
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