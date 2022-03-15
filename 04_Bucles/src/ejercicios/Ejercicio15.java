package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio15 {

	public static void main(String[] args) {
		/*
		 * Pedir 10 sueldos
		 * Mostrar suma y mayores de 1000
		 */
		
		int contador = 1;
		int numSueldosMayores1000 = 0;
		double suma = 0;
		do {
			try {
				int salario = Integer.parseInt(JOptionPane.showInputDialog("Escribe el salario del empleado " + contador++));
				contador++;
				suma = suma + salario;
				if(salario > 1000) {
					numSueldosMayores1000++;
				}
			} catch(Exception e) {
				
			}
		} while(contador <= 10);
		JOptionPane.showMessageDialog(null, "La suma de salarios es " + suma + "\n" 
				+ "El número de sueldos mayores a 1000 es " + numSueldosMayores1000);

	}

}
