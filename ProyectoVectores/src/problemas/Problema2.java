package problemas;

import java.util.Scanner;

public class Problema2 {
	
	Scanner teclado;
	int[] vector1;
	int[] vector2;
	int[] resultado;
	
	/**
	 * Realizar un programa que pida la carga de dos vectores numéricos enteros de 4 elementos. 
	 * Obtener la suma de los dos vectores, 
	 * dicho resultado guardarlo en un tercer vector del mismo tamaño. 
	 * Sumar componente a componente. 
	 * @param args
	 */
	public static void main(String[] args) {
		Problema2 p2 = new Problema2();
		p2.cargaDatos();
		p2.imprimirResultado();
		
	}
	
	public void cargaDatos() {
		teclado = new Scanner(System.in);
		vector1 = new int[4];
		vector2 = new int[4];
		resultado = new int[4];	
		for(int j=0; j < 2; j++) {
			for(int i=0; i < 4; i++) {
				System.out.print("Ingrese el valor " + (i+1) + " del vector " + (j+1) + ": ");
				if(j==0) {
					vector1[i] = teclado.nextInt();
				} else {
					vector2[i] = teclado.nextInt();
				}
			}
		}		
	}
	
	public void imprimirResultado() {
		System.out.println("Vector resultante");
		for(int i=0; i < 4; i++) {
			resultado[i] = vector1[i] + vector2[i];			
		}
		for(int i=0; i < 4; i++) {
			System.out.println(resultado[i]);			
		}
	}
}
