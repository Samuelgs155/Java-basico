package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio06 {
	
	public static void main(String[] args) {
		/*
		 * Programa que toma dos n�meros y diga si son pares o impares
		 */
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el primer n�mero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el segundo n�mero"));
		
		if(num1 % 2 == 0 && num2 % 2 == 0 ) {
			JOptionPane.showMessageDialog(null, "Ambos son pares");
		} else if(num1 % 2 == 0 && num2 % 2 != 0 ) {
			JOptionPane.showMessageDialog(null, "El primero es par y el segundo impar");
		} else if(num1 % 2 != 0 && num2 % 2 == 0 ) {
			JOptionPane.showMessageDialog(null, "El primero es impar y el segundo par");
		} else {
			JOptionPane.showMessageDialog(null, "Ambos son impares");
		}
	}

}
