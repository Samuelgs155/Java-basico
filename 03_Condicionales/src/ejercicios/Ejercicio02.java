package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*
		 * Pedir 2 numeros y decir cual es el mayor
		 */
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el n�mero 1"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el n�mero 2"));
		JOptionPane.showMessageDialog(null, (num1 >= num2) ? "El n�mero mayor es " + num1 : "El n�mero mayor es " + num2);
	}

}
