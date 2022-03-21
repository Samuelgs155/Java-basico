package ejercicio10;

public class Futbolista extends Persona {

	private int dorsal;
	private String posicion;

	public Futbolista(String nombre, String apellidos, int edad, int dorsal, String posicion) {
		super(nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.posicion = posicion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public void entrevista() {
		System.out.println("Da entrevista");
	}

	@Override
	void partidoFutbol() {
		System.out.println("Juega partido de fútbol");

	}

	@Override
	void entrenamiento() {
		System.out.println("Entrena");

	}
	

}
