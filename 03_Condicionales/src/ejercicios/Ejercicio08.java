package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio08 {

	public static void main(String[] args) {
		/*
		 * Pedir un n�mero entre 0 y 99999 y decir cu�ntes cifras tiene
		 */
		String num1 = JOptionPane.showInputDialog("Escriba un n�mero entre 0 y 99 999");
		JOptionPane.showMessageDialog(null, num1 + " tiene " + num1.length() + " d�gitos");
	}

}
