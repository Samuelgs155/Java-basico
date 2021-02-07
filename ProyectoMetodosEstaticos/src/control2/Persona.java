package control2;

public class Persona {

	private String nombre;
	private int edad;

	public Persona() {

	}

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void imprimir() {
        System.out.println(this.nombre + " " + this.edad);
    }
	
	public static Persona edadMayor(Persona p1, Persona p2) {
		if(p1.getEdad() >= p2.getEdad()) {
			return p1;
		} else if (p1.getEdad() < p2.getEdad()) {
			return p2;
		} 
		return null;
	}

}
