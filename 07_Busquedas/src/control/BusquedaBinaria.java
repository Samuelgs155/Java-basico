package control;

import javax.swing.JOptionPane;

public class BusquedaBinaria {

	public static void main(String[] args) {
		
		int[] arreglo = {4,5,1,2,3};
		int inf;
		int sup;
		int mitad;
		int i;
		boolean flag = false;
		
		int dato = Integer.parseInt(JOptionPane.showInputDialog("Escriba el número a buscar"));
		
		// Busqueda binaria
		inf = 0;
		sup = arreglo.length;
		i = 0;
		mitad = (inf + sup) / 2;
		
		while(inf <= sup && i < arreglo.length) {
			if(arreglo[mitad] == dato) {
				flag = true;
				break;
			}
			if(arreglo[mitad] > dato) {
				sup = mitad;
				mitad = (inf + sup) / 2;
			}
			if(arreglo[mitad] < dato) {
				inf = mitad;
				mitad = (inf + sup) / 2;
			}
			i++;
		}
		
		if(flag == false) {
			JOptionPane.showMessageDialog(null, "El número no se encuentra en el arreglo");
		} else {
			JOptionPane.showMessageDialog(null, "El número se encuentra en el arreglo en la posición: " + (i-1));
		}
	}

}
