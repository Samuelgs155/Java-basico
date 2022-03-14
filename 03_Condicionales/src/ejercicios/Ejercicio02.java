package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*
		 * Pedir 2 numeros y decir cual es el mayor
		 */
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el número 1"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el número 2"));
		JOptionPane.showMessageDialog(null, (num1 >= num2) ? "El número mayor es " + num1 : "El número mayor es " + num2);
	}

}
