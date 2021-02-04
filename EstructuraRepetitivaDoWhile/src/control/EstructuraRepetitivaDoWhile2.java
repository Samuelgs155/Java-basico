package control;

import java.util.Scanner;

public class EstructuraRepetitivaDoWhile2 {

	/**
	 * Escribir un programa que solicite la carga de números por teclado, 
	 * obtener su promedio. Finalizar la carga de valores cuando se cargue el valor 0.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double valor;
		double suma = 0;
		int numeroValores = 0;
		double promedio;		
		
		do {
			System.out.print("Ingrese un número: ");
			valor = teclado.nextDouble();			
			suma += valor;
			if(valor != 0) {
				numeroValores++;
			}			
		} while(valor != 0);
		
		promedio = (double) (suma / numeroValores);
		System.out.println("El valor promedio de los " + numeroValores + " números es: " + promedio);
	}

}
