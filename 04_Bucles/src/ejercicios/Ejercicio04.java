package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		/*
		 * Leer números hasta que se teclee uno negativo
		 * repetir hasta que se introduzca un negativo
		 */
		int numero = 0;
		int contador = 0;
		do {
			try{
				numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número (salir con el 0):"));
				if(numero >= 0) {
					contador++;
				}
			} catch (Exception e) {
				numero = -1;
		    }			
				
			
		}while(numero >= 0);
		JOptionPane.showMessageDialog(null, "Se han introducido " + contador + " números");
	}

}
