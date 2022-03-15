package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio18 {

	public static void main(String[] args) {
		/*
		 * Una empresa vende desinfectantes
		 * PAra facturar, en cada factura hay
		 * codigo artíuclo, la cantidad vendida y precio articulo
		 * 
		 * De 5 facturas introducidas, facturación total, cantidad en litros del articulo 1
		 * cuantas facturas de más de 600 se hicieron
		 * 
		 */
		double facturacionTotal = 0;
		int numArticulo01 = 0;
		int mayor600 = 0;
		for(int i=0;i<5;i++) {
			int articuloId = Integer.parseInt(JOptionPane.showInputDialog("Codigo del articulo"));
			double litros = Double.parseDouble(JOptionPane.showInputDialog("Cuantos litros se vendieron"));
			double facturado = 0;
			switch(articuloId) {
				case 1:
					facturado = 0.6 * litros;
					break;
				case 2:
					facturado = 3 * litros;
					break;
				case 3:
					facturado = 1.25 * litros;
					break;
			}
			
			facturacionTotal = facturacionTotal + facturado;
			if(facturado > 600) {
				mayor600++;
			}
			if(articuloId == 1) {
				numArticulo01++;
			}
		}
		JOptionPane.showMessageDialog(null, "La facturación total es " + facturacionTotal + " euros\n" 
				+  "El numero de ventas del articulo 1 fue de " + numArticulo01 + "\n" 
				+ "El número de facturas mayor a 600 fue de " + mayor600 );

	}

}
