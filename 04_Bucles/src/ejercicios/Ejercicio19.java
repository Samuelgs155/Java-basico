package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio19 {

	public static void main(String[] args) {
		/*
		 * Dadas 6 notas, escribir la cantididad de alumnos
		 * aprobados,
		 * condicionados (=4)
		 * suspensos
		 */
		int alumAprobados = 0;
		int alumCondicionados = 0;
		int alumSuspensos = 0;
		for(int i=0;i<6;i++) {
			int nota = Integer.parseInt(JOptionPane.showInputDialog("Notas del alumno " + (i+1)));
			if(nota < 4 && nota >= 0) {
				alumSuspensos++;
			} else if(nota == 4) {
				alumCondicionados++;
			} else if(nota > 4 && nota <= 10) {
				alumAprobados++;
			}
		}
		JOptionPane.showMessageDialog(null, "El número de alumnos suspensos fue de " + alumSuspensos + "\n" 
				+  "El número de alumnos condicionados fue de  " + alumCondicionados + "\n" 
				+ "El número de alumnos aprobaos fue de  " + alumAprobados );
	}

}
