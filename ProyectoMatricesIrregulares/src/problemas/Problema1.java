package problemas;

import java.util.Scanner;

public class Problema1 {
	private Scanner teclado;
    private int[][] mat;
	
	/**
	 * Confeccionar una clase para administrar una matriz irregular de 5 filas y 1 columna 
	 * la primer fila, 2 columnas la segunda fila 
	 * y así sucesivamente hasta 5 columnas la última fila (crearla sin la intervención del operador)
Realizar la carga por teclado e imprimir posteriormente.
	 * @param args
	 */
	public static void main(String[] args) {
		Problema1 ma=new Problema1();
        ma.cargar();
        ma.imprimir();

	}
	
	public void cargar() {
        teclado=new Scanner(System.in);
        mat=new int[5][];
        for(int f=0;f<mat.length;f++) {
            mat[f]=new int[f+1];            
            for(int c=0;c<mat[f].length;c++) {
                System.out.print("Ingrese componente:");
                mat[f][c]=teclado.nextInt();
            }
        }
    }
    
    public void imprimir() {
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print(mat[f][c]+" ");
            }
            System.out.println();
        }
    }

}
