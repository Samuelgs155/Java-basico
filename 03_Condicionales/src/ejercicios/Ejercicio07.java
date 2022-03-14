package ejercicios;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ejercicio07 {
	
	public static void main(String[] args) {
		/*
		 * Programa que pida 3 numeros y los ordene de mayor a menor
		 */
		int[] numeros = new int[3];
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el primer número"));
		numeros[0] = num1;
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el segundo número"));
		numeros[1] = num2;
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el segundo número"));
		numeros[2] = num3;
		Arrays.sort(numeros);
		JOptionPane.showMessageDialog(null, "Los numeros ordenados son: " + numeros[0] + ", "
				+ numeros[1] + ", "
				+ numeros[2]);
		
	}

}
