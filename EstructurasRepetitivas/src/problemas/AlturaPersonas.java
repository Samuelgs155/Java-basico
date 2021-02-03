package problemas;

import java.util.Scanner;

public class AlturaPersonas {

	/**
	 * Se ingresan un conjunto de n alturas de personas por teclado. 
	 * Mostrar la altura promedio de las personas.
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		int numPersonas;
		int _numPersonas;
		double alturaPersona;
		double alturaTotal = 0;
		
		System.out.print("Ingrese el número de personas: ");
		numPersonas = teclado.nextInt();
		_numPersonas = numPersonas;
		while(numPersonas > 0) {
			System.out.print("Ingrese la altura de la persona: ");
			alturaPersona = teclado.nextDouble();
			alturaTotal = alturaTotal + alturaPersona;
			numPersonas--;
		}
		
		System.out.println("La altura promedio es:");
		System.out.println((double) alturaTotal / _numPersonas);
		System.out.println("");

	}

}
