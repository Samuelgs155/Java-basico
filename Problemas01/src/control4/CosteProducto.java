package control4;

import java.util.Scanner;

public class CosteProducto {

	/**
	 * Se debe desarrollar un programa que pida el ingreso del precio de un artículo 
	 * y la cantidad que lleva el cliente.
	 * Mostrar lo que debe abonar el comprador.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double precioArticulo;
		int numeroArticulos;
		
		double costeCompra;
		
		System.out.println("Ingrese el precio del articulo:");
		precioArticulo = teclado.nextDouble();
		System.out.println("Ingrese el número de artículos que se lleva:");
		numeroArticulos = teclado.nextInt();
		
		costeCompra = precioArticulo * numeroArticulos;
		
		System.out.println("El coste de la compra es:");
		System.out.println(costeCompra);
	}

}
