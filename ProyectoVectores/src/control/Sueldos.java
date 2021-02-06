package control;

import java.util.Scanner;

public class Sueldos {
	
	Scanner teclado;
	int[] sueldos;

	/**
	 * Se desea guardar los sueldos de 5 operarios.
		Según lo conocido deberíamos definir 5 variables 
		si queremos tener en un cierto momento los 5 sueldos almacenados en memoria.
		Empleando un vector solo se requiere definir un único nombre 
		y accedemos a cada elemento por medio del subíndice
	 * @param args
	 */
	public static void main(String[] args) {
		Sueldos sueldos = new Sueldos();
		sueldos.cargarSueldos();
		sueldos.imprimirSueldos();

	}
	
	public void cargarSueldos() {
		teclado = new Scanner(System.in);
		sueldos = new int[5];
		for(int i = 0; i< 5; i++) {
			System.out.print("Ingrese el sueldo " + (i+1) + ": ");
			sueldos[i] = teclado.nextInt();
		}		
	}
	
	public void imprimirSueldos() {
		for(int i = 0; i< 5; i++) {
			System.out.println("El sueldo del empleado " + (i+1) + " es: " + sueldos[i]);
		}
	}

}
