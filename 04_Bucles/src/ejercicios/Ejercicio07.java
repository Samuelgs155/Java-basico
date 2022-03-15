package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio07 {

	public static void main(String[] args) {
		int numero = 0;
		double suma = 0;
		int contador = 0;
		do {
			try{
				numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número (salir ponga un negativo):"));
				if(numero >= 0) {
					suma = suma + numero;
					contador++;
				}				
			} catch (Exception e) {
				numero = -1;
		    }
		}while(numero >= 0);
		double media = suma / contador;
		JOptionPane.showMessageDialog(null, "La media de todos los números es " + media);

	}

}
