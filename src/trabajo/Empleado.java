package trabajo;

public class Empleado {
	private int numBps;
	private int numFuncionario;
	private String nombre = "";
	private String apellido = "";
	private String direccion = "";
	private String telefono = "";
	
	/**
	 * Calcula y devuelve el sueldo del empleado
	 * @return double Sueldo
	 */
	public double getSueldo() {
		return 0; 
	} 
	
	public Empleado(int numBps, int numFuncionario, String nombre, String apellido, String direccion, String telefono).
	
	

	//	GETTERS AND SETTERS ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	public int getNumBps() {
		return numBps;
	}

	public void setNumBps(int numBps) {
		this.numBps = numBps;
	}

	public int getNumFuncionario() {
		return numFuncionario;
	}

	public void setNumFuncionario(int numFuncionario) {
		this.numFuncionario = numFuncionario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
