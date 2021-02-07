package control;

import java.util.Scanner;

public class Matriz3 {
	
	private Scanner teclado;
    private int[][] mat;

	/**
	 * Crear y cargar una matriz de 3 filas por 4 columnas. Imprimir la primer fila. 
	 * Imprimir la última fila e imprimir la primer columna.
	 * @param args
	 */
	public static void main(String[] args) {
		Matriz3 ma=new Matriz3();
        ma.cargar();
        ma.primerFila();
        ma.ultimaFila();
        ma.primerColumna();

	}
	
	public void cargar() {
		teclado = new Scanner(System.in);
		mat = new int[3][4];
		
		System.out.println("Cargar matriz de 3x4");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("Ingrese el valor de la posición (" + i + "," + j + ") :");
				mat[i][j] = teclado.nextInt();
			}
		}
	}
	
	public void primerFila() {
    	System.out.println("Primer fila de la matriz:");
        for(int c=0;c<4;c++) {
            System.out.println(mat[0][c]);
        }
    }
    
    public void ultimaFila() {
    	System.out.println("Ultima fila de la matriz:");
        for(int c=0;c<4;c++) {
            System.out.println(mat[2][c]);
        }
    }
    
    public void primerColumna() {
    	System.out.println("Primer columna:");
        for(int f=0;f<3;f++) {
            System.out.println(mat[f][0]);
        }
    }

}
