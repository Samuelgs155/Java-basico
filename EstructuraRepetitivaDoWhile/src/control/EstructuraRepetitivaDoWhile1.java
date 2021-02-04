package control;

import java.util.Scanner;

public class EstructuraRepetitivaDoWhile1 {

	/**
	 * Escribir un programa que solicite la carga de un n�mero entre 0 y 999, 
	 * y nos muestre un mensaje de cu�ntos d�gitos tiene el mismo. 
	 * Finalizar el programa cuando se cargue el valor 0.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor;		
		do {
			System.out.println("Ingrese un n�mero entero entre 0 y 999: (Salir con el 0): ");
			valor = teclado.nextInt();
			if(valor > 999 || valor < 0) {
				System.out.println("N�mero fuera de rango.");
			} else {
				if(valor > 99 ) {
					System.out.println("El n�mero tiene 3 d�gitos.");
				} else if(valor > 9) {
					System.out.println("El n�mero tiene 2 d�gitos.");
				} else {
					System.out.println("El n�mero tiene 1 d�gito.");
				}
			}
			
		} while(valor != 0);
		System.out.println("Fin del programa.");
		

	}

}
