package control;

import javax.swing.JOptionPane;

public class CondicionalesIf {

	public static void main(String[] args) {
		int numero, dato = 5;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
		
		if(numero == dato) {
			JOptionPane.showMessageDialog(null, "El número es igual a 5");
		} else {
			JOptionPane.showMessageDialog(null, "El número es diferente a 5");
		}

	}

}
