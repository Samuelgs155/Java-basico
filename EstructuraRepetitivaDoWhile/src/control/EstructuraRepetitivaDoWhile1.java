package control;

import java.util.Scanner;

public class EstructuraRepetitivaDoWhile1 {

	/**
	 * Escribir un programa que solicite la carga de un número entre 0 y 999, 
	 * y nos muestre un mensaje de cuántos dígitos tiene el mismo. 
	 * Finalizar el programa cuando se cargue el valor 0.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor;		
		do {
			System.out.println("Ingrese un número entero entre 0 y 999: (Salir con el 0): ");
			valor = teclado.nextInt();
			if(valor > 999 || valor < 0) {
				System.out.println("Número fuera de rango.");
			} else {
				if(valor > 99 ) {
					System.out.println("El número tiene 3 dígitos.");
				} else if(valor > 9) {
					System.out.println("El número tiene 2 dígitos.");
				} else {
					System.out.println("El número tiene 1 dígito.");
				}
			}
			
		} while(valor != 0);
		System.out.println("Fin del programa.");
		

	}

}
