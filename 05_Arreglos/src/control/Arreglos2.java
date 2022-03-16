package control;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arreglos2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int nElementos = Integer.parseInt(JOptionPane.showInputDialog("Escribe el número de elementos"));
		
		char[] letras = new char[nElementos];
		
		System.out.println("Escribe los elementos del arreglo");
		for(int i=0;i<letras.length;i++) {
			System.out.println("Digite el caracter " + (i+1) + ":");
			letras[i] = teclado.next().charAt(0);
		}
		System.out.println("\nLos caracteres fueron:");
		for(int i=0;i<letras.length;i++) {
			System.out.print(letras[i]);
		}

	}

}
