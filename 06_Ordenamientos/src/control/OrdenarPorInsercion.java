package control;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class OrdenarPorInsercion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] arreglo;
		int nElementos;
		int pos;
		int aux;
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Escriba cuántos elementos se van a introducir"));
		arreglo = new int[nElementos];
		
		for(int i=0; i < nElementos; i++) {
			System.out.print("Escriba el valor del elemento " + (i+1) + ": ");
			arreglo[i] = teclado.nextInt();
		}
		
		// Ordenamiento por insercion
		for(int i=0; i < nElementos; i++) {
			pos = i;
			aux = arreglo[i];
			while((pos>0) && (arreglo[pos-1] > aux)) {
				arreglo[pos] = arreglo[pos-1];
				pos--;
			}
			arreglo[pos] = aux;
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
