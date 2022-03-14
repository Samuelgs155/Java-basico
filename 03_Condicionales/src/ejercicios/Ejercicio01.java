package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio01 {
	
	/*
	 * Programa que lea un número entero y muestre si es múltiplo de 10
	 */

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un número:"));
		
		JOptionPane.showMessageDialog(null, (numero % 10 == 0) ? "Múltiplo de 10" : "No es múltiplo de 10");
		

	}

}
