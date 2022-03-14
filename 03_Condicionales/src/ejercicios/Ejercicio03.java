package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	
	public static void main(String[] args) {
		/*
		 * Lea un caracter por teclado y compruebe si es mayúscula
		 */
		
		String letra = JOptionPane.showInputDialog("Escriba un caracter");
		String letraMayuscula = letra.toUpperCase();
		JOptionPane.showMessageDialog(null, (letra.equals(letraMayuscula) ? "Es letra mayúscula" : "No es letra mayúscula"));
		
	}

}
