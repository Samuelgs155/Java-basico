package ejercicio04;

public class Atleta {
	
	private int numero;
	private String nombre;
	private float tiempoCarrera;
	
	public Atleta(int numero, String nombre, float tiempoCarrera) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.tiempoCarrera = tiempoCarrera;
	}
	
	public String mostrarDatos() {
		return "El atleta: " + this.getNumero() + ". " + this.getNombre() + ", hizo un tiempo de " + this.getTiempoCarrera();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getTiempoCarrera() {
		return tiempoCarrera;
	}

	public void setTiempoCarrera(float tiempoCarrera) {
		this.tiempoCarrera = tiempoCarrera;
	}
	
	
	

}
