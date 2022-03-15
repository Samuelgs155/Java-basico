package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio16 {

	public static void main(String[] args) {
		/*
		 * Pide un numero entre 0 y 10
		 * mostrar su tabla de multiplicar
		 */
		int num = Integer.parseInt(JOptionPane.showInputDialog("escriba la edad del alumno (entre  0 y 10)"));

		for(int i = 0; i<= 10 ; i++) {
			System.out.println(num + " x " + i + " = " + (i*num));
		}
	}

}
