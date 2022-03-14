package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		/*
		 * En MegaPlaza hace un 20% de descuento a los clientes cuando la compra supera 300neuros
		 */
		
		double compra = Double.parseDouble(JOptionPane.showInputDialog("Escriba el precio de la compra"));
		String texto = "Su compra asciende a ";
		JOptionPane.showMessageDialog(null, (compra > 300) ? texto + (compra*0.8) : texto + compra);

	}

}
