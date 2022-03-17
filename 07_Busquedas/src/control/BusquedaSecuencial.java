package control;

import javax.swing.JOptionPane;

public class BusquedaSecuencial {

	public static void main(String[] args) {

		int[] arreglo = {4,1,5,2,3};
		boolean flag = false;
		
		int dato = Integer.parseInt(JOptionPane.showInputDialog("Escriba el n�mero a buscar"));
		
		// busqueda secuencial
		int i = 0;
		while(i<arreglo.length && flag == false) {
			if(arreglo[i] == dato) {
				flag = true;
			}
			i++;
		}
		
		if(flag == false) {
			JOptionPane.showMessageDialog(null, "El n�mero no se encuentra en el arreglo");
		} else {
			JOptionPane.showMessageDialog(null, "El n�mero se encuentra en el arreglo en la posici�n: " + (i-1));
		}

	}

}
