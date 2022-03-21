package ejercicio10;

public class Doctor extends Persona {

	private String titulacion;
	private int anyosExperiencia;

	public Doctor(String nombre, String apellidos, int edad, String titulacion, int anyosExperiencia) {
		super(nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.anyosExperiencia = anyosExperiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAnyosExperiencia() {
		return anyosExperiencia;
	}

	public void setAnyosExperiencia(int anyosExperiencia) {
		this.anyosExperiencia = anyosExperiencia;
	}

	public void curarLesion() {
		System.out.println("Cura una lesión");
	}

	@Override
	void partidoFutbol() {
		System.out.println("Da asistencia en un partido");
		
	}

	@Override
	void entrenamiento() {
		System.out.println("Da asistencia en un entrenamiento");
		
	}

}
