package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio01 {
	
	/*
	 * Programa que lea un n�mero entero y muestre si es m�ltiplo de 10
	 */

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un n�mero:"));
		
		JOptionPane.showMessageDialog(null, (numero % 10 == 0) ? "M�ltiplo de 10" : "No es m�ltiplo de 10");
		

	}

}
