package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio20 {

	public static void main(String[] args) {
		/*
		 * Pedir N sueldos
		 * encontrar el sueldo mayor
		 */
		double sueldoMayor = 0;
		int posicion = 0;
		int num = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos sueldos va a ingresar? "));
		for(int i =0 ; i< num; i++) {
			double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo " + (i+1)));
			if(sueldo >= sueldoMayor) {
				sueldoMayor = sueldo;
				posicion = i + 1;
			}
		}
		JOptionPane.showMessageDialog(null, "El sueldo mayor fue el del empleado " + posicion + " con un sueldo de " + sueldoMayor + " euros");

	}

}
