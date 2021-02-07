package problema;

import java.util.Scanner;

public class SueldoEmpleados3 {

	Scanner teclado;
	int numSueldos;
	int[] sueldos;

	/**
	 * Se desea almacenar los sueldos de operarios. Cuando se ejecuta el programa se
	 * debe pedir la cantidad de sueldos a ingresar. Luego crear un arreglo con
	 * dicho tamaño. Imprimir todos los sueldos ingresados y mostrar el mayor de
	 * ellos.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SueldoEmpleados3 se = new SueldoEmpleados3();
		se.cargarSueldos();
		se.imprimirSueldos();
		se.sueldoMayor();

	}

	public void cargarSueldos() {

		teclado = new Scanner(System.in);

		System.out.print("Ingrese el # de sueldos a introducir: ");
		numSueldos = teclado.nextInt();

		sueldos = new int[numSueldos];

		for (int i = 0; i < sueldos.length; i++) {
			System.out.print("Ingrese sueldo:");
			sueldos[i] = teclado.nextInt();
		}

	}

	public void imprimirSueldos() {
		System.out.println("Imprimir sueldos:");
		for (int sueldo : sueldos)
			System.out.println(sueldo);
	}

	public void sueldoMayor() {
		int mayor = sueldos[0];
		for (int sueldo : sueldos)
			if (sueldo > mayor)
				mayor = sueldo;
		System.out.println("El sueldo mayor que paga la empresa es " + mayor);
	}

}
