package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*
		 * Leer 5 n�meros, guardarlos en un arreglo
			realizar la media de n�meros positivos, negativos y el n�mero de ceros
		 */
		Scanner teclado = new Scanner(System.in);		
		float[] numeros = new float[5];
		float sumPositivos = 0;
		int numPositivos = 0;
		float sumNegativos = 0;
		int numNegativos = 0;
		int numCeros = 0;
		
		System.out.println("Escriba 5 n�meros");
		for(int i=0;i<5;i++) {
			System.out.print("Escriba el n�mero " + (i+1) + ": ");
			numeros[i] = teclado.nextFloat();
		}
		
		System.out.println("\nLos resultados fueron: ");		
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i] > 0) {
				sumPositivos = sumPositivos + numeros[i];
				numPositivos++;
			} else if(numeros[i] < 0) {
				sumNegativos = sumNegativos + numeros[i];
				numNegativos++;
			} else if(numeros[i] == 0) {
				numCeros++;
			}
		}
		System.out.println("La media de n�meros positivos es de: " + (sumPositivos / numPositivos));
		System.out.println("La media de n�meros negativos es de: " + (sumNegativos / numNegativos));
		System.out.println("El n�mero de ceros fue de: " + numCeros);
	}

}
