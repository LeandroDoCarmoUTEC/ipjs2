package trabajo;

public class Jornalero extends Empleado {
	private double valorHora;
	private double cantidadHoras;
	
	@Override
	public double getSueldo() {
		return this.valorHora * this.cantidadHoras;
	}

	
	// GETTERS AND SETTERS ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public double getCantidadHoras() {
		return cantidadHoras;
	}
	public void setCantidadHoras(double cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}
	
	
}
