package control2;

public class Persona {

	private String nombre;
    private int edad;
    public static int cantidad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        cantidad++;
    }

    public void imprimir() {
        System.out.println(nombre + " " + edad);
    }
}
