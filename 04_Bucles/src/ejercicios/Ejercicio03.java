package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		/*
		 * Leer un n�mero y decir si es positivo o negativo
		 * repetir hasta que se introduzca un 0
		 */
		int numero = 0;
		do {
			try{
				numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un n�mero (salir con el 0):"));
			} catch (Exception e) {
				numero = 0;
		    }			
			if(numero % 2 == 0) {
				JOptionPane.showMessageDialog(null, "El n�mero " + numero + " es par");
			} else if(numero < 0){
				JOptionPane.showMessageDialog(null, "El n�mero " + numero + " es impar");
			}
			
			
		}while(numero != 0);

	}

}
