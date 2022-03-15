package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio13 {

	public static void main(String[] args) {
		/*
		 * Pedir 10 numeros
		 * Mostrar la media de los numeros positivos
		 * Mostrar la media de los numeros negativos
		 * Mostrar la cantidad de ceros
		 */
		int contador = 0;
		int numPositivos = 0;
		double sumaPositivos = 0;
		int numNegativos = 0;
		double sumaNegativos = 0;
		int numCeros = 0;
		do {
			try {
				int numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número"));
				if(numero > 0) {
					numPositivos++;
					sumaPositivos = sumaPositivos + numero;
				} else if (numero < 0) {
					numNegativos++;
					sumaNegativos = sumaNegativos + numero;
				} else {
					numCeros++;
				}
				contador++;
			} catch (Exception e) {
				System.out.println("Hubo un problema");
		    }			
		} while(contador < 10);
		double mediaPositivos = sumaPositivos / numPositivos;
		double mediaNegativos = sumaNegativos / numNegativos;
		JOptionPane.showMessageDialog(null, "La media de números positivos es " + mediaPositivos + "\n" 
				+ "La media de números negativos es " + mediaNegativos + "\n"
				+ "El número de ceros es de " + numCeros);
	}

}
