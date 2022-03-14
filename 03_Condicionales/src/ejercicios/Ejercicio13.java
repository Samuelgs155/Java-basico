package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio13 {

	public static void main(String[] args) {
		/*
		 * Hacer un programa que pase de Kg a otra unidad de masa
		 */
		float medida;
		int opcion;
		
		medida = Float.parseFloat(JOptionPane.showInputDialog("Escribe la cantidad de Kg:"));
		opcion = Integer.parseInt(JOptionPane.showInputDialog("MENU\n"
				+ "1. Hectogramos\n"
				+ "2. Decagramos\n"
				+ "3. Gramos\n"
				+ "4. Decigramos\n"
				+ "5. Centigramos\n"
				+ "6. Miligramos\n"));
		switch(opcion) {
			case 1:
				JOptionPane.showMessageDialog(null, medida + "kg son " + (medida*10) + " hectogramos");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, medida + "kg son " + (medida*100) + " decagramos");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, medida + "kg son " + (medida*1000) + " gramos");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, medida + "kg son " + (medida*10000) + " decigramos");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, medida + "kg son " + (medida*100000) + " centigramos");
				break;
			case 6:
				JOptionPane.showMessageDialog(null, medida + "kg son " + (medida*1000000) + " miligramos");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opción incorrecta.");
		}
	}

}
