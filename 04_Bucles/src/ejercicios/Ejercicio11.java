package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio11 {
	
	public static void main(String[] args) {
		/*
		 * Pedir 10 n�meros y mostrar la suma total
		 */
		int contador = 1;
		int suma = 0;
		do {
			try {
				int numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un n�mero :"));
				suma = suma + numero;
				contador++;
				
			} catch(Exception e) {
				System.out.println("Error en el n�mero introducido");
			}
			
		} while(contador <= 10);
		JOptionPane.showMessageDialog(null, "La suma vale " + suma);		
		
		
		
	}

}
