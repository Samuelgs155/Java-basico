package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio06 {

	public static void main(String[] args) {
		/*
		 * Pedir numeros hasta que teclee un 0
		 * mostrar la suma de todos
		 */
		int numero = 0;
		int suma = 0;
		do {
			try{
				numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número (salir con el 0):"));
				suma = suma + numero;
			} catch (Exception e) {
				numero = 0;
		    }			
				
			
		}while(numero != 0);
		JOptionPane.showMessageDialog(null, "La suma de todos los números es " + suma);
	}

}
