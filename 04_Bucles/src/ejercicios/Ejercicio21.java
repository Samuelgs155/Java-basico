package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio21 {

	public static void main(String[] args) {
		/*
		 * Pedir 10 sueldos
		 * decir si hay alguno negativo
		 */
		boolean hayNegativos = false;
		for(int i =0 ; i< 10; i++) {
			double num = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un n�mero "));
			if(num < 0) {
				hayNegativos = true;
			}
		}
		if(hayNegativos) {
			JOptionPane.showMessageDialog(null, "Hay n�meros negativos");
		} else {
			JOptionPane.showMessageDialog(null, "No hay n�meros negativos");
		}
		

	}

}
