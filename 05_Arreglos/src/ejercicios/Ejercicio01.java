package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		/*
		 * Leer 5 n�meros, guardarlos en un arreglo y mostrarlos en el mismo orden
		 */
		Scanner teclado = new Scanner(System.in);
		
		float[] numeros = new float[5];
		
		System.out.println("Escriba 5 n�meros");
		for(int i=0;i<5;i++) {
			System.out.print("Escriba el n�mero " + (i+1) + ": ");
			numeros[i] = teclado.nextFloat();
		}
		System.out.println("\nLos n�meros introducidos fueron: ");
		for(float num: numeros) {
			System.out.print(num + ", ");
		}

	}

}
