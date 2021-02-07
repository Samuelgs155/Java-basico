package control;

import java.util.Scanner;

public class Matriz {
	private Scanner teclado;
	private int[][] mat;

	/**
	 * Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir la matriz
	 * completa utilizando la estructura for que recorre colecciones.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Matriz pm = new Matriz();
		pm.imprimir();

	}

	public Matriz() {
		teclado = new Scanner(System.in);
		System.out.print("Cuantas fila tiene la matriz:");
		int filas = teclado.nextInt();
		System.out.print("Cuantas columnas tiene la matriz:");
		int columnas = teclado.nextInt();
		mat = new int[filas][columnas];
		for (int f = 0; f < mat.length; f++) {
			for (int c = 0; c < mat[f].length; c++) {
				System.out.print("Ingrese componente:");
				mat[f][c] = teclado.nextInt();
			}
		}
	}

	public void imprimir() {
		for (int[] fila : mat) {
			for (int elemento : fila)
				System.out.print(elemento + " ");
			System.out.println();
		}
	}
}
