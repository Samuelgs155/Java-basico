package control;

import java.util.Scanner;

public class CadenaDeCaracteres1 {

	/**
	 * Solicitar el ingreso del nombre y edad de dos personas. 
	 * Mostrar el nombre de la persona con mayor edad.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);		
		String[] nombres = new String[2];
		int[] edades = new int[2];
		int max = 0;
		int posicion = 0;
		
		for(int i = 0; i < 2; i++) {
			System.out.print("Ingrese el nombre de la persona " + (i+1) + ": ");
			nombres[i] = teclado.next();
			System.out.print("Ingrese la edad de la persona " + (i+1) + ": ");
			edades[i] = teclado.nextInt();
		}		
		for(int i = 0; i < 2; i++ ) {
			if(edades[i] > max) {
				max = edades[i];
				posicion = i;
			}
		}		
		System.out.println(nombres[posicion] + " de " + edades[posicion] + " años es el mayor de los dos.");

	}

}
