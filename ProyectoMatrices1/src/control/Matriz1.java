package control;

import java.util.Scanner;

public class Matriz1 {
	
	private Scanner teclado;
    private int[][] mat;

	/**
	 * Crear una matriz de n * m filas (cargar n y m por teclado) 
	 * Imprimir la matriz completa y la última fila.
	 * @param args
	 */
	public static void main(String[] args) {
		Matriz1 ma = new Matriz1();
        ma.cargar();
        ma.imprimirMatriz();
        ma.ultimaFila();

	}
	
	public void cargar() {
		teclado = new Scanner(System.in);
		
        System.out.print("Ingrese el # de filas de la matriz:");
        int filas = teclado.nextInt();
        
        System.out.print("Ingrese el # de columnas de la matriz:");
        int columnas = teclado.nextInt();
        
        mat = new int[filas][columnas];
        
        for(int i=0; i < mat.length; i++) {
            for(int j=0; j < mat[i].length; j++) {
                System.out.print("Ingrese componente:");
                mat[i][j]=teclado.nextInt();
            }
        }
	}

	public void imprimirMatriz() {
		System.out.println("Imprimir matriz");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				System.out.print("[" + i + "," + j + "] :" + mat[i][j]);				
			}
		}
	}
	
	public void ultimaFila() {
    	System.out.println("Ultima fila de la matriz:");
        for(int i=0;i < mat[mat.length - 1].length;i++) {
            System.out.println(mat[mat.length - 1][i]);
        }
    }
	
}
