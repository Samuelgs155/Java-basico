package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio09 {
	
	public static void main(String[] args) {
		/*
		 * Escribir todos los números de 100 al 0 de 7 en 7
		 */		
		for(int i=100;i>=0;i = i - 7) {
			if(i >= 0) {
				System.out.print(i + ", ");
			} else {
				System.out.print(i);
			}			
		}		
		
	}

}
