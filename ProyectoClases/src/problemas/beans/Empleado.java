package problemas.beans;

import java.util.Scanner;

/**
 * Confeccionar una clase que represente un empleado. 
 * Definir como atributos su nombre y su sueldo. 
 * Confeccionar los métodos para la carga, otro para imprimir sus datos 
 * y por último uno que imprima un mensaje si debe pagar impuestos (si el sueldo supera a 3000) 
 * @param args
 */
public class Empleado {
	
	Scanner teclado;
	private String nombre;
	private double sueldo;
	
	public void inicializar() {
		teclado = new Scanner(System.in);
		System.out.println("Escriba el nombre del empleado: ");
		this.nombre = teclado.next();
		System.out.println("Escriba el sueldo del empleado: ");
		this.sueldo = teclado.nextDouble();
	}
	
	public void imprimir() {
		System.out.println("\nEl nombre del empleado es: " + this.nombre);
		System.out.println("\nEl sueldo del empleado es: " + this.sueldo);
	}
	
	public void debePagarImpuestos() {
		if(this.sueldo > 3000) {
			System.out.println("\nDebe pagar impuestos.");
		} else {
			System.out.println("\nNO debe pagar impuestos.");
		}
	}

}
