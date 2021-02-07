package control;

import java.util.Scanner;

public class Matriz2 {
	
	private Scanner teclado;
    private int[][] mat;

	/**
	 * Crear y cargar una matriz de 4 filas por 4 columnas. 
	 * Imprimir la diagonal principal.
	 * @param args
	 */
	public static void main(String[] args) {
		Matriz2 ma=new Matriz2();
        ma.cargar();
        ma.imprimirDiagonalPrincipal();

	}
	
	public void cargar() {
		teclado = new Scanner(System.in);
		mat = new int[4][4];
		
		System.out.println("Cargar matriz de 4x4");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("Ingrese el valor de la posición (" + i + "," + j + ") :");
				mat[i][j] = teclado.nextInt();
			}
		}
	}

	public void imprimirDiagonalPrincipal() {
        for(int k=0;k<4;k++) {
            System.out.print(mat[k][k]+" ");
        }
    }
}
