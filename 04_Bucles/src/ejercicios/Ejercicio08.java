package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio08 {
	
	public static void main(String[] args) {
		/*
		 * Pedir un n�mero N y mostrar todos los numeros del 1 al N
		 */
		try {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un n�mero (salir con el 0):"));
			if(numero > 0) {
				for(int i=1;i<=numero;i++) {
					if(i != numero) {
						System.out.print(i + ", ");
					} else {
						System.out.print(i);
					}
					
				}
			}
		} catch(Exception e) {
			System.out.println("Error en el n�mero introducido");
		}
		
		
		
	}

}
