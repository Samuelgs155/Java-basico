package control;

import javax.swing.JOptionPane;

public class CondicionalesSwitch {

	public static void main(String[] args) {
		int dato;
		
		dato = Integer.parseInt(JOptionPane.showInputDialog("Escriba un dato"));
		
		switch(dato) {
			case 1: 
				JOptionPane.showMessageDialog(null, "El número es el 1");
				break;
			case 2: 
				JOptionPane.showMessageDialog(null, "El número es el 2");
				break;
			case 3: 
				JOptionPane.showMessageDialog(null, "El número es el 3");
				break;
			case 4: 
				JOptionPane.showMessageDialog(null, "El número es el 4");
				break;
			case 5: 
				JOptionPane.showMessageDialog(null, "El número es el 5");
				break;
			default:
				JOptionPane.showMessageDialog(null, "El número no está en el rango 1-5");
		}

	}

}
