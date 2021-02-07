package problema;

public class Main {

	public static void main(String[] args) {
		Persona persona1=new Persona();
        persona1.cargarDatosPersonales();
        Empleado empleado1=new Empleado();
        empleado1.cargarDatosPersonales();
        empleado1.cargarSueldo();
        persona1.imprimirDatosPersonales();        
        empleado1.imprimirDatosPersonales();
        empleado1.imprimirSueldo();

	}

}
