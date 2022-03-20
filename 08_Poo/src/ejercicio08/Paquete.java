package ejercicio08;

public class Paquete {
	
	private int numeroPaquete;
	private String dni;
	private double peso;
	private int prioridad; // 0-normal, 1-alta, 2-express
	
	public Paquete(int numeroPaquete, String dni, double peso, int prioridad) {
		super();
		this.numeroPaquete = numeroPaquete;
		this.dni = dni;
		this.peso = peso;
		this.prioridad = prioridad;
	}

	public int getNumeroPaquete() {
		return numeroPaquete;
	}

	public void setNumeroPaquete(int numeroPaquete) {
		this.numeroPaquete = numeroPaquete;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	@Override
	public String toString() {
		return "Paquete [numeroPaquete=" + numeroPaquete + ", dni=" + dni + ", peso=" + peso + ", prioridad="
				+ prioridad + "]";
	}
	
	

}
