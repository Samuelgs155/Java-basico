package problemas;

import java.util.Scanner;

public class Problema1 {

	private Scanner teclado;
    private int[][] mat;

	/**
	 * Crear una matriz de 2 filas y 5 columnas. 
	 * Realizar la carga de componentes por columna 
	 * (es decir primero ingresar toda la primer columna, 
	 * luego la segunda columna y así sucesivamente)
		Imprimir luego la matriz. 
	 * @param args
	 */
	public static void main(String[] args) {
		Problema1 ma=new Problema1();
        ma.cargar();
        ma.imprimir();
	}
	
	public void cargar() {
		teclado = new Scanner(System.in);
		mat = new int[2][5];
		
		System.out.println("Cargar matriz de 2x5 por columnas");
		
		for(int j=0; j<5; j++) {
			for(int i=0; i<2; i++) {
				System.out.print("Ingrese el valor de la posición (" + i + "," + j + ") :");
				mat[i][j] = teclado.nextInt();
			}
		}
	}
	
	public void imprimir() {
        for(int f=0;f<2;f++) {
            for(int c=0;c<5;c++) {
                System.out.print(mat[f][c]+" ");
            }
            System.out.println();
        }
    }
	

}
