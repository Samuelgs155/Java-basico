package problemas;

import java.util.Scanner;

public class EmpleadoFabrica {
	
	private Scanner teclado;
    String nombre;
    float sueldo;

	
	/**
	 * Confeccionar una clase que represente un empleado. 
	 * Definir como atributos su nombre y su sueldo. 
	 * En el constructor cargar los atributos 
	 * y luego en otro método imprimir sus datos 
	 * y por último uno que imprima un mensaje 
	 * si debe pagar impuestos (si el sueldo supera a 3000) 
	 * @param args
	 */
	public static void main(String[] args) {
		EmpleadoFabrica empleado1;
        empleado1=new EmpleadoFabrica();
        empleado1.pagaImpuestos();

	}
	
	public EmpleadoFabrica() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado:");
        nombre=teclado.next();
        System.out.print("Ingrese su sueldo:");
        sueldo=teclado.nextFloat();
    }
    
    public void pagaImpuestos() {
        if (sueldo>3000) {
            System.out.print("Debe abonar impuestos");
        } else {
            System.out.print("No paga impuestos");
        }
    }

}
