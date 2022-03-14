package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * Construir un programa que simule el funcionamiento de una calculadora
		 * que puede realizar las cuatro operaciones aritm�ticas b�sicas
		 * suma, resta, producto y divisi�n
		 * el usuario debe especificar la operaci�n con el primer caracter
		 * del primer par�metros de la l�nea de comandos 
		 * S o s para sumar
		 * R o r para restar
		 * P, p, M o m para multiplicar
		 * D o d para dividir
		 */
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el primer n�mero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el segundo n�mero"));
		char operacion = JOptionPane.showInputDialog("Escriba la operaci�n").charAt(0);
		
		switch(operacion) {
			case 's':
			case 'S':
				JOptionPane.showMessageDialog(null, "La suma es " + (num1 + num2));
				break;
			case 'R':
			case 'r':
				JOptionPane.showMessageDialog(null, "La resta es " + (num1 - num2));
				break;
			case 'P':
			case 'p':
			case 'm':
			case 'M':
				JOptionPane.showMessageDialog(null, "La multiplicaci�n es " + (num1 * num2));
				break;
			case 'D':
			case 'd':
				JOptionPane.showMessageDialog(null, "La divisi�n es " + (num1 / num2));
				break;
			default:
				JOptionPane.showMessageDialog(null, "La operaci�n es desconocida");
		}
		
	}
}
