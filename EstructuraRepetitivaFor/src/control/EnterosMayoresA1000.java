package control;

import java.util.Scanner;

public class EnterosMayoresA1000 {
	
	
	/**
	 * Escribir un programa que lea n números enteros 
	 * y calcule la cantidad de valores mayores o iguales a 1000.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numEnteros;
		int num;
		int mayoresA1000 = 0;
		
		System.out.print("Ingrese cuántos números enteros va a ingresar: ");
		numEnteros = teclado.nextInt();
		
		for(int i = 0; i < numEnteros; i++) {
			System.out.print("Ingrese el número entero " + (i+1) + ": ");
			num = teclado.nextInt();			
			if(num >= 1000) {
				mayoresA1000++;
			}
		}
		
		System.out.println("Se han ingresado " + mayoresA1000 + " números mayores a 1000.");
		
	}

}
