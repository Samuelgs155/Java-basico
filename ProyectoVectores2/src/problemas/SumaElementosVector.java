package problemas;

import java.util.Scanner;

public class SumaElementosVector {
	
	Scanner teclado;
	int numElementos;
	int[] vector;
	
	/**
	 * Desarrollar un programa que permita ingresar un vector de n elementos, 
	 * ingresar n por teclado. Luego imprimir la suma de todos sus elementos 
	 * @param args
	 */
	public static void main(String[] args) {
		
		SumaElementosVector sem = new SumaElementosVector();
		sem.cargarElementos();
		sem.imprimirSuma();
		
	}
	
	public void cargarElementos() {
		teclado = new Scanner(System.in);
		System.out.print("Ingrese cuántos elementos tendrá el vector: ");
		numElementos = teclado.nextInt();
		vector = new int[numElementos];
		for(int i=0; i <vector.length; i++) {
			System.out.print("Ingrese el valor del elemento " + (i+1) + ": ");
			vector[i] = teclado.nextInt();
		}
	}
	
	public void imprimirSuma( ) {
		int suma = 0;
		for(int i=0; i <vector.length; i++) {
			suma += vector[i];
		}
		System.out.println("La suma de todos los elementos es: " + suma);
	}

}
