package problemas;

import java.util.Scanner;

public class Empleados {
	
	/**
	 * En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, 
	 * realizar un programa que lea los sueldos que cobra cada empleado 
	 * e informe cu�ntos empleados cobran entre $100 y $300 
	 * y cu�ntos cobran m�s de $300. 
	 * Adem�s el programa deber� informar el importe que gasta la empresa 
	 * en sueldos al personal.
	 * @param args
	 * @return
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numEmpleados;
		int _numEmpleados;
		
		int numEmpleadosEntre100y300 = 0;
		int numEmpleadosMayor300 = 0;
		double salario;
		
		System.out.print("Ingrese el n�mero de empleados: ");
		numEmpleados = teclado.nextInt();
		
		while(numEmpleados > 0) {
			System.out.print("Ingrese el salario del empleado: ");
			salario = teclado.nextDouble();
			numEmpleados--;
			
			if(salario > 300) {
				numEmpleadosMayor300++;
			} else {
				numEmpleadosEntre100y300++;
			}
		}
		
		System.out.println("El n�mero de empleados que cobran m�s de 300$ es: " + numEmpleadosMayor300);
		System.out.println("El n�mero de empleados que cobran entre 100$ y 300$ es: " + numEmpleadosEntre100y300);
	}

}
