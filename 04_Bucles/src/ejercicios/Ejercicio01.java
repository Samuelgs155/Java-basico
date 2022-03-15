package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		/*
		 * Leer un n�mero y mostrar su cuadrado
		 * repetir hasta que se introduzca un n�mero negativo
		 */
		int numero = 0;
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un n�mero para obtener su cuadrado (salir un negativo):"));
			int cuadrado = (int) Math.pow(numero, 2);
			JOptionPane.showMessageDialog(null, "El cuadrado de " + numero + " es " + cuadrado);
			
		}while(numero >= 0);

	}

}
