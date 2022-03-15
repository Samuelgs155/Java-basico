package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio22 {

	public static void main(String[] args) {
		/*
		 * Pedir 5 notas
		 * decir si hay alguno suspenso
		 */
		boolean haySuspensos = false;
		for(int i =0 ; i< 5; i++) {
			double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación del alumno " + (i+1)));
			if(nota < 5) {
				haySuspensos = true;
			}
		}
		if(haySuspensos) {
			JOptionPane.showMessageDialog(null, "Hay suspensos");
		} else {
			JOptionPane.showMessageDialog(null, "No hay suspensos");
		}
		

	}

}
