package ejercicio01;

import javax.swing.JOptionPane;

public class Control {

	public static void main(String[] args) {
		/*
		 * programa que calule el area y el perimetro de un cuadrilatero dada la
		 * longitud de 2 de sus lados. Los valores ser�n introducidos por l�neas de
		 * ordenes. Si es un cuadrado se proporcionara la longitud de un de los lados al
		 * constructor
		 */
		Cuadrilatero c1;
		float lado1, lado2;
		
		lado1 = Float.parseFloat(JOptionPane.showInputDialog("Escriba el lado 1"));
		lado2 = Float.parseFloat(JOptionPane.showInputDialog("Escriba el lado 2"));
		
		if(lado1 == lado2) {
			c1 = new Cuadrilatero(lado1);
		} else {
			c1 = new Cuadrilatero(lado1, lado2);
		}
		System.out.println("El per�metro del cuadril�tero es de " + c1.getPerimetro());
		System.out.println("El �rea del cuadril�tero es de " + c1.getArea());
	}

}
