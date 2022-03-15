package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio12 {

	public static void main(String[] args) {
		/*
		 * Pedir un numero y calcular su factorial
		 */
		try{
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para calcular su factorial:"));
			int solucion = factorial(numero);
			JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es " + solucion);
		} catch (Exception e) {
			System.out.println("Hubo un problema");
	    }	

	}

	private static int factorial(int numero) {
		if(numero == 1 || numero == 0) {
			return 1;
		} else {
			return numero * factorial(numero - 1);
		}
		
	}

}
