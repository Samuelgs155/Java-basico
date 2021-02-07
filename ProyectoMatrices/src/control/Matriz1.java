package control;

import java.util.Scanner;

public class Matriz1 {
	
	Scanner teclado;
	int[][] matriz35;

	/*
	 * Crear una matriz de 3 filas por 5 columnas con elementos de tipo int, 
	 * cargar sus componentes y luego imprimirlas.
	 */
	public static void main(String[] args) {
		Matriz1 matriz1 = new Matriz1();
		matriz1.cargar();
		matriz1.imprimirMatriz();

	}
	
	public void cargar() {
		teclado = new Scanner(System.in);
		matriz35 = new int[3][5];
		
		System.out.println("Cargar matriz de 3x5");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("Ingrese el valor de la posición (" + i + "," + j + ") :");
				matriz35[i][j] = teclado.nextInt();
			}
		}		
	}
	
	public void imprimirMatriz() {
		System.out.println("Imprimir matriz");
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("[" + i + "," + j + "] :" + matriz35[i][j]);				
			}
		}
	}

}
