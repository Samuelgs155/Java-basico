package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*
		 * Leer un número y decir si es positivo o negativo
		 * repetir hasta que se introduzca un 0
		 */
		int numero = 0;
		do {
			try{
				numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número (salir con el 0):"));
			} catch (Exception e) {
				numero = 0;
		    }			
			if(numero > 0) {
				JOptionPane.showMessageDialog(null, "El número " + numero + " es positivo");
			} else if(numero < 0){
				JOptionPane.showMessageDialog(null, "El número " + numero + " es negativo");
			}
			
			
		}while(numero != 0);

	}

}
