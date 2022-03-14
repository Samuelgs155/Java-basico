package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * Construir un programa que simule el funcionamiento de una calculadora
		 * que puede realizar las cuatro operaciones aritméticas básicas
		 * suma, resta, producto y división
		 * el usuario debe especificar la operación con el primer caracter
		 * del primer parámetros de la línea de comandos 
		 * S o s para sumar
		 * R o r para restar
		 * P, p, M o m para multiplicar
		 * D o d para dividir
		 */
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el primer número"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el segundo número"));
		char operacion = JOptionPane.showInputDialog("Escriba la operación").charAt(0);
		
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
				JOptionPane.showMessageDialog(null, "La multiplicación es " + (num1 * num2));
				break;
			case 'D':
			case 'd':
				JOptionPane.showMessageDialog(null, "La división es " + (num1 / num2));
				break;
			default:
				JOptionPane.showMessageDialog(null, "La operación es desconocida");
		}
		
	}
}
