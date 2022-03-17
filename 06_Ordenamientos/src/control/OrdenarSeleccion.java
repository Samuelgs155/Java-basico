package control;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class OrdenarSeleccion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] arreglo;
		int nElementos;
		int min;
		int aux;
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Escriba cuántos elementos se van a introducir"));
		arreglo = new int[nElementos];
		
		for(int i=0; i < nElementos; i++) {
			System.out.print("Escriba el valor del elemento " + (i+1) + ": ");
			arreglo[i] = teclado.nextInt();
		}
		
		// Ordenamiento por seleccion
		for(int i=0; i < nElementos; i++) {
			min = i;
			for(int j=i+1; j < nElementos; j++) {
				if(arreglo[j] < arreglo[min]) {
					min = j;
				}
			}
			aux = arreglo[i];
			arreglo[i] = arreglo[min];
			arreglo[min] = aux;
		}
		
		System.out.println("");
		System.out.println("Mostrar el arreglo de forma creciente");
		for(int i=0; i < nElementos; i++) {
			System.out.print(arreglo[i] + "-");;
		}
		
		System.out.println("");
		System.out.println("Mostrar el arreglo de forma decreciente");
		for(int i=(nElementos - 1); i >= 0 ; i--) {
			System.out.print(arreglo[i] + "-");;
		}

	}

}
