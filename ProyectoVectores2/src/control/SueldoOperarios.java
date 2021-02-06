package control;

import java.util.Scanner;

public class SueldoOperarios {
	
	Scanner teclado;
	int numSueldos;
	int[] sueldos;

	/**
	 * Se desea almacenar los sueldos de operarios. 
	 * Cuando se ejecuta el programa se debe pedir la cantidad de sueldos a ingresar. 
	 * Luego crear un vector con dicho tamaño.
	 * @param args
	 */
	public static void main(String[] args) {
		SueldoOperarios so = new SueldoOperarios();
		so.cargarOperarios();
		so.imprimirSueldos();

	}
	
	public void cargarOperarios() {
		teclado = new Scanner(System.in);
		
		System.out.println("Cuántos sueldos va a cargar? ");
		numSueldos = teclado.nextInt();
		sueldos = new int[numSueldos];
		
		for(int i=0; i<sueldos.length;i++) {
			System.out.print("Ingrese el sueldo " + (i+1) + ": ");
			sueldos[i] = teclado.nextInt();
		}
	}
	
	public void imprimirSueldos() {
		System.out.println("La lista de sueldos es de: ");
		for(int f=0;f<sueldos.length;f++) {
            System.out.println(sueldos[f]);
        }
	}

}
