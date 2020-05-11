package ej19;

public class E19_ClaseMoto_LeandroDoCarmo implements E19_InterfazVehiculo_LeandroDoCarmo {
	static final int nroRuedas = 2;
	String marca;
	
	@Override
	public String mostrarMarcaRodado() {
		return this.nroRuedas + " - " + this.marca;
	}

	public E19_ClaseMoto_LeandroDoCarmo(String m) {
		this.marca = m;
	}

}
