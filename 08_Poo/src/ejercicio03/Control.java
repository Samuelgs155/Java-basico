package ejercicio03;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		/*
		 * Programa dada una serie de vehículos caracterizados por
		 * marca, modelo y precio
		 * imprima las propiedades del vehiculo más varato
		 * Leer por teclado las características de cada vehiculo y crear una clase
		 * que represente a cada uno de llos
		 */
		
		Vehiculo[] vehiculos;
		int numVehiculos;
		
		Scanner teclado = new Scanner(System.in);		
		System.out.println("Escriba cuantos vehículos va a introducir");
		numVehiculos = teclado.nextInt();
		vehiculos = new Vehiculo[numVehiculos];
		
		for(int i=0;i<numVehiculos;i++) {
			System.out.println("Escriba las características del vehículo " + (i+1) + ":");
			Vehiculo vh = new Vehiculo();
			System.out.println("Escriba la marca del vehiculo");
			String marca = teclado.next();
			System.out.println("Escriba el modelo del vehiculo");
			String modelo = teclado.next();
			System.out.println("Escriba el precio del vehiculo");
			float precio = teclado.nextFloat();
			vehiculos[i] = new Vehiculo(marca, modelo, precio);
		}
		
		int indiceMasbarato = indiceVehiculoMasBarato(vehiculos);
		
		System.out.println(vehiculos[indiceMasbarato].mostrarDatos());

	}
	
	public static int indiceVehiculoMasBarato(Vehiculo[] vehiculos) {
		float precio;
		int indice = 0;
		precio = vehiculos[0].getPrecio();
		for(int i=0;i<vehiculos.length;i++) {
			if(precio > vehiculos[i].getPrecio()) {
				precio = vehiculos[i].getPrecio();
				indice = i;
			}
		}
		return indice;
	}

}
