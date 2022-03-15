package ejercicios;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio05 {

	public static void main(String[] args) {
		/*
		 * Juego para adivinar un número
		 * Generar un número entre 0-100 y luego ir pidiendo números 
		 * indicando "es mayor" y "es menor" acorde al aleatorio
		 * el proceso termina cuando se acierta el número
		 */
		
		// Producir nuevo int aleatorio entre 0 y 100
		int aleatorio = (int) (Math.random() * 100);
		System.out.println(aleatorio);
		int numero = 0;
		do {
			try{
				numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número (salir con el 0):"));
				if(numero > aleatorio) {
					JOptionPane.showMessageDialog(null, "El " + numero + " es mayor.");
				} else if(numero < aleatorio) {
					JOptionPane.showMessageDialog(null, "El " + numero + " es menor.");
				} else {
					JOptionPane.showMessageDialog(null, "Acertó");
				}
			} catch (Exception e) {
				
		    }				
			
		}while(numero != aleatorio);
		
	}

}
