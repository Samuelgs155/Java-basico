package ejercicio10;

public class Entrenador extends Persona {

	private String estrategia;

	public Entrenador(String nombre, String apellidos, int edad, String estrategia) {
		super(nombre, apellidos, edad);
		this.estrategia = estrategia;
	}

	public String getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(String estrategia) {
		this.estrategia = estrategia;
	}

	public void planificarEntrenamiento() {
		System.out.println("Planifica entrenamiento");
	}

	@Override
	void partidoFutbol() {
		System.out.println("Dirige un partido de fútbol");

	}

	@Override
	void entrenamiento() {
		System.out.println("Dirige un entrenamiento");

	}

}
