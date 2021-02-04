package control;

import java.util.Scanner;

public class EstructuraRepetitivaDoWhile3 {

	
	/**
	 * Realizar un programa que permita ingresar el peso (en kilogramos) de piezas. 
	 * El proceso termina cuando ingresamos el valor 0. Se debe informar:
		a) Cuántas piezas tienen un peso entre 9.8 Kg. y 10.2 Kg.?, 
			cuántas con más de 10.2 Kg.? 
			y cuántas con menos de 9.8 Kg.?
		b) La cantidad total de piezas procesadas.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double valor;
		int numPiezas = 0;
		int numPiezasPesadas = 0;
		int numPiezasMedias = 0;
		int numPiezasLigeras = 0;
		
		do {
			System.out.print("Ingrese el peso de la pieza en kg: (Salir con 0) ");
			valor = teclado.nextDouble();
			
			if(valor != 0) {
				numPiezas++;
				if(valor > 10.2) {
					numPiezasPesadas++;
				} else if(valor < 9.8) {
					numPiezasLigeras++;
				} else {
					numPiezasMedias++;
				}
			}
		} while( valor != 0);
		
		System.out.println("");
		System.out.println("El número de piezas que pesan más de 10.2 kg es: " + numPiezasPesadas);
		System.out.println("El número de piezas que pesan entre de 10.2 y 9.8 kg es: " + numPiezasMedias);
		System.out.println("El número de piezas que pesan menos de 9.8 kg es: " + numPiezasLigeras);
		System.out.println("");
		System.out.println("# total de piezas procesadas es de: " + numPiezas);
	}
}
