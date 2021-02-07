package problemas;

import java.util.Scanner;

public class Problema2 {
	private Scanner teclado;
    private int[][] mat;
    
    /**
     * Crear una matriz de n * m filas (cargar n y m por teclado) 
     * Imprimir los cuatro valores que se encuentran en los v�rtices de la misma (mat[0][0] etc.)
     * @param ar
     */
    public static void main(String[] ar) {
    	Problema2 ma=new Problema2();
        ma.cargar();
        ma.imprimirVertices();
    }
    
    public void cargar() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas=teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas=teclado.nextInt();
        mat=new int[filas][columnas];
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print("Ingrese componente:");
                mat[f][c]=teclado.nextInt();
            }
        }
    }
           
    public void imprimirVertices() {
    	System.out.println("V�rtice superior izquierdo:");
        System.out.println(mat[0][0]);
    	System.out.println("V�rtice superior derecho:");        
        System.out.println(mat[0][mat[0].length-1]);
    	System.out.println("V�rtice inferior izquierdo:");        
        System.out.println(mat[mat.length-1][0]);
    	System.out.println("V�rtice inferior derecho:");        
        System.out.println(mat[mat.length-1][mat[mat.length-1].length-1]);
    }  

}
