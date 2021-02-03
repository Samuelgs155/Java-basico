package control4;

import java.util.Scanner;

public class EstructuraControl {

	
	/**
	 * Confeccionar un programa que permita cargar un n�mero entero positivo 
	 * de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras. 
	 * Mostrar un mensaje de error si el n�mero de cifras es mayor. 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Ingrese un n�mero");
		numero = teclado.nextDouble();
		
		if((numero <= 999) && (numero >= 0)) {
			
			if(numero > 99) {
				System.out.println("El n�mero introducido tiene tres cifras.");
			} else {
				if(numero > 9) {
					System.out.println("El n�mero introducido tiene dos cifras.");
				} else {
					System.out.println("El n�mero introducido tiene una cifra.");
				}
			}
			
		} else {
			if(numero > 999) {
				System.out.println("El n�mero introducido tiene m�s de tres cifras.");
			} else {
				System.out.println("El n�mero introducido es menor a cero");
			}
		}
	}
}
