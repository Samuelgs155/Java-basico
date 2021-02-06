package problemas;

import java.util.Scanner;

public class VectorNElementos {

	Scanner teclado;
	int numElementos;
	int[] elementos;
	int menor;
	
	/**
	 * Cargar un vector de n elementos. 
	 * imprimir el menor y un mensaje si se repite dentro del vector.
	 * @param args
	 */
	public static void main(String[] args) {
		VectorNElementos ve = new VectorNElementos();
		ve.cargarElementos();
		ve.imprimirMenor();
		ve.imprimirMenorRepetido();

	}

	public void cargarElementos() {
		
		teclado = new Scanner(System.in);
		System.out.print("Ingrese cuántos elementos va a introducir: ");
		numElementos = teclado.nextInt();
		elementos = new int[numElementos];
		System.out.println("");
		for(int i=0; i<numElementos;i++) {
			System.out.print("Ingrese el elemento " + (i+1) + ": ");
			elementos[i] = teclado.nextInt();
		}		
	}
	
	public void imprimirMenor() {
		this.menor = elementos[0];
		for(int i=0; i<elementos.length; i++) {
			if(elementos[i] < menor) {
				menor = elementos[i];
			}
		}
		System.out.println("El elemento menor es " + this.menor);
	}
	
	public void imprimirMenorRepetido() {
		int contador = 0;
		for(int i=0; i<elementos.length; i++) {
			if(elementos[i] == this.menor) {
				contador++;
			}
		}
		if(contador > 0) {
			System.out.println("El elemento menor se repite " + contador + " veces");
		} else {
			System.out.println("El elemento menor NO se repite.");
		}
	}
}
