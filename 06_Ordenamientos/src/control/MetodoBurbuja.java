package control;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MetodoBurbuja {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] arreglo;
		int nElementos;
		int aux;
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Escriba cuántos elementos se van a introducir"));
		arreglo = new int[nElementos];
		
		for(int i=0; i < nElementos; i++) {
			System.out.print("Escriba el valor del elemento " + (i+1) + ": ");
			arreglo[i] = teclado.nextInt();
		}
		
		// Metodo burbuja
		for(int i=0; i < (nElementos - 1); i++) {
			for(int j=0; j < (nElementos - 1); j++) {
				if(arreglo[j] > arreglo[j+1] ) { // Si numeroActual > numeroSiguiente
					aux = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = aux;
				}
			}
		}
		
		// mostrar
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
