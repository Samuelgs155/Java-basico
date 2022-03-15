package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio11 {
	
	public static void main(String[] args) {
		/*
		 * Pedir 10 números y mostrar la suma total
		 */
		int contador = 1;
		int suma = 0;
		do {
			try {
				int numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número :"));
				suma = suma + numero;
				contador++;
				
			} catch(Exception e) {
				System.out.println("Error en el número introducido");
			}
			
		} while(contador <= 10);
		JOptionPane.showMessageDialog(null, "La suma vale " + suma);		
		
		
		
	}

}
