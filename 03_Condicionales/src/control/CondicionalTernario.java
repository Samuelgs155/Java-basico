package control;

import javax.swing.JOptionPane;

public class CondicionalTernario {

	public static void main(String[] args) {
		int numero;
		String mensaje;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

		mensaje = (numero%2==0) ? "Es par" : "Es impar";
		
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
