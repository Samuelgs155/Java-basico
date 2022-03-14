package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio11 {
	
	public static void main(String[] args) {
		/*
		 * Pedir una nota de 0 a 10
		 * y decir la calificacion
		 */
		double nota = Double.parseDouble(JOptionPane.showInputDialog("Escriba la nota del alumno"));
		if(nota >= 0 && nota < 5) {
			JOptionPane.showMessageDialog(null, "Insuficiente");
		} else if (nota >= 5 && nota < 6) {
			JOptionPane.showMessageDialog(null, "Suficiente");
		} else if(nota >= 6 && nota < 7) {
			JOptionPane.showMessageDialog(null, "Bien");
		} else if(nota >= 7 && nota < 9) {
			JOptionPane.showMessageDialog(null, "Notable");
		} else if(nota >= 9 && nota < 10){
			JOptionPane.showMessageDialog(null, "Sobresaliente");
		} else {
			JOptionPane.showMessageDialog(null, "Nota fuera de rango");
		}
	}

}
