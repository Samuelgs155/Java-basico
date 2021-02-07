package control;

import java.util.Scanner;

public class MatrizIrregular {
	
	private Scanner teclado;
    private int[][] mat;
    
    /**
     * Confeccionaremos un programa que permita crear una matriz irregular 
     * y luego imprimir la matriz en forma completa. 
     * @param ar
     */
    public static void main(String[] ar) {
    	MatrizIrregular ma=new MatrizIrregular();
        ma.cargar();
        ma.imprimir();
    }
    
    public void cargar() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas=teclado.nextInt();
        mat=new int[filas][];
        for(int f=0;f<mat.length;f++) {
            System.out.print("Cuantas elementos tiene la fila " + f + ":");
            int elementos=teclado.nextInt();
            mat[f]=new int[elementos];            
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
