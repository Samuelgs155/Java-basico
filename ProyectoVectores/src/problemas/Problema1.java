package problemas;

import java.util.Scanner;

public class Problema1 {
	
	Scanner teclado;
	int[] vector;
	
	/**
	 * Desarrollar un programa que permita ingresar un vector de 8 elementos, e informe:
El valor acumulado de todos los elementos del vector.
El valor acumulado de los elementos del vector que sean mayores a 36.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Problema1 p1 = new Problema1();
		p1.cargarElementos();
		p1.imprimirValorAcumulado();
		p1.imprimirNumMayores();
		
	}
	
	public void cargarElementos() {
		teclado = new Scanner(System.in);
		vector = new int[8];
		for(int i = 0; i < 8; i++) {
			System.out.print("Ingrese el valor " + (i+1) + ": ");
			vector[i] = teclado.nextInt();
		}
	}
	
	public void imprimirValorAcumulado() {
		int suma = 0;
		for(int i = 0; i < 8; i++) {
			suma += vector[i];			
		}
		System.out.println("La suma acumulada es: " + suma);
	}
	
	public void imprimirNumMayores() {
		int contador = 0;
		for(int i = 0; i < 8; i++) {
			if(vector[i] > 36) {
				contador++;
			}
		}
		System.out.println("El número de valores mayor a 36 es de: " + contador);
	}

}
