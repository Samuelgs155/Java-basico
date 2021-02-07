package control3;

public class Persona {
	
	private static final int MAYOREDAD = 18;
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println(nombre + " " + edad);
    }

    public String retornarNombre() {
        return nombre;
    }

    public boolean esMayor() {
        if (edad >= MAYOREDAD)
            return true;
        else
            return false;
    }

}
