package ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Ejercicio09 {

	public static void main(String[] args) {
		/*
		 * Pedir dia, mes y a�o de una fecha y decir si es correcta
		 */
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Escriba el dia"));  // d�a [1,...,31]
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Escriba el mes"));  // mes [1,...,12]
		int anyo = Integer.parseInt(JOptionPane.showInputDialog("Escriba el a�o")); // a�o
		
        if (anyo < 1900) {
            // throw new IllegalArgumentException("A�o inv�lido.");
            JOptionPane.showMessageDialog(null, "A�o inv�lido");
        } 

        try {
        	LocalDate today = LocalDate.of(anyo, mes, dia);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println(formatter.format(today)); // 01/01/2016
            JOptionPane.showMessageDialog(null, "A�o v�lido " + formatter.format(today));
        } catch(Exception e) {
        	JOptionPane.showMessageDialog(null, "Fecha inv�lida");
        }
        
	}

}
