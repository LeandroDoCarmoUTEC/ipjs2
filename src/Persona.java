public class Persona {
	private String nombre = "";
	private String ci = "";
	private String credencial = "";
	private String pais = "";
	private boolean habilitado = false;

	public boolean puedeVotar() throws Exception {
		if (!this.pais.toLowerCase().equals("uruguay") && this.ci.isEmpty()) {
			throw new NoVotaException("No puede votar: No es de uruguay y no tiene ci\r\n");
		}
		if (!this.habilitado) {
			throw new NoVotaException("No puede votar: No está habilitado por el BPS\r\n");
		}
		if (this.credencial.isEmpty()) {
			throw new NoVotaException("No puede votar: Es de uruguay y no tiene credencial\r\n");
		}
		return true;
	}

	// GETTERS AND SETTERS ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getCredencial() {
		return credencial;
	}

	public void setCredencial(String credencial) {
		this.credencial = credencial;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

}
