package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio12 {

	public static void main(String[] args) {
		/*
		 * Hacer un programa que simule un cajero automático con un saldo 
		 * inicial de 1000 con estas opciones
		 */
		
		double saldo = 1000.0;
		int opcion = 0;
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al cajero automático.\n"
					+ "Elija la opción que más le guste:\n"
					+ "1.Ingresar dinero en la cuenta.\n"
					+ "2.Retirar dinero de la cuenta.\n"
					+ "3.Salir"));
			if(opcion == 1) {
				double ingresar = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto va a ingresar?"));
				saldo = saldo + ingresar;
				JOptionPane.showMessageDialog(null, "Su saldo actual es de " + saldo + " euros.");
			} else if(opcion == 2) {
				double retirar = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto va a retirar?"));
				saldo = saldo - retirar;
				JOptionPane.showMessageDialog(null, "Su saldo actual es de " + saldo + " euros.");
			} else if(opcion == 3) {
				JOptionPane.showMessageDialog(null, "Su saldo actual es de " + saldo + " euros.\n"
						+ "Que tenga un buen día.");
			} else {
				JOptionPane.showMessageDialog(null, "Opción no válida, por favor repita.");
			}

		} while(opcion != 3);
		
	}

}
 