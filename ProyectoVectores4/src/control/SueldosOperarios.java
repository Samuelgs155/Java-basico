package control;

import java.util.Scanner;

public class SueldosOperarios {
	
	Scanner teclado;
	String[] nombres;
	int[] sueldos;

	
	/**
	 * Confeccionar un programa que permita cargar los nombres de 5 operarios 
	 * y sus sueldos respectivos. 
	 * Mostrar el sueldo mayor y el nombre del operario.
	 * @param args
	 */
	public static void main(String[] args) {
		SueldosOperarios so = new SueldosOperarios();
		so.cargarOperario();
		so.imprimirSueldoMayor();

	}
	
	public void cargarOperario() {
		teclado = new Scanner(System.in);
		nombres = new String[5];
		sueldos = new int[5];
		
		for(int i = 0; i < nombres.length; i++) {
			System.out.print("Ingrese el nombre del operario " + (i+1) + ": ");
			nombres[i] = teclado.next();
			System.out.print("Ingrese el sueldo del operario " + (i+1) + ": ");
			sueldos[i] = teclado.nextInt();
		}
	}
	
	public void imprimirSueldoMayor() {
		
		int max = 0;
		int posicion = 0;
		for(int i = 0; i < nombres.length; i++) {
			if(sueldos[i] > max) {
				max = sueldos[i];
				posicion = i;
			}			
		}
		
		System.out.println("El operario que más gana es " + nombres[posicion] + " (" + sueldos[posicion] + ")");
	}

}
