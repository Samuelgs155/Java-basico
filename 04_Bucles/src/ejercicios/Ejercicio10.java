package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		/*
		 * Mostrar el producto de los 10 primeros números impares
		 */
		int contador = 1;
		int numero = 0;
		int suma = 0;
		do {
			if( numero % 2 != 0) {
				suma = suma + numero;
				contador++;
			}
			numero++;
		} while(contador <= 10);
		System.out.println("La suma de los 10 primeros números impares es " + suma);
		
		
	}

}
