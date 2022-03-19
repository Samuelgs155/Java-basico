package ejercicio03;

public class Vehiculo {

	private String marca;
	private String modelo;
	private float precio;

	public Vehiculo(String marca, String modelo, float precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public Vehiculo() {
		super();
	}
	
	public String mostrarDatos() {
		return "La marca es: " + this.getMarca() + ", el modelo es: " + this.getModelo() + ", el precio es: " + this.getPrecio();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	};

}
