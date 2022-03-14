package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio05 {

	public static void main(String[] args) {
		/*
		 * Un obrero necesita calcular su salario semanal
		 * si trabaja 40 horas o menos se le paga 16 euros la hora
		 * Si trabaja más de 40 horas se le pagan a 16 euros las primeras 40 horas y a 20 las extras
		 */
		
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Escriba las horas que trabajó:"));
		if(horas <= 40) {	
			double salario = horas * 16;
			JOptionPane.showMessageDialog(null, "Su salario es de " + salario);
		} else {
			double salario = 40 * 16;
			int horasExtras = horas - 40;
			double salarioExtra = horasExtras * 20;
			JOptionPane.showMessageDialog(null, "Su salario es de " + (salario + salarioExtra));
		}
		

	}

}
