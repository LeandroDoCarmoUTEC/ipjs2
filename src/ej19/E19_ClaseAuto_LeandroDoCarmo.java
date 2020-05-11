package ej19;

public class E19_ClaseAuto_LeandroDoCarmo implements E19_InterfazVehiculo_LeandroDoCarmo {
	static final int nroRuedas = 4;
	String marca;

	@Override
	public String mostrarMarcaRodado() {
		return this.marca + " - " + this.nroRuedas;
	}
	
	public E19_ClaseAuto_LeandroDoCarmo(String m) {
		this.marca = m;
	}

}
