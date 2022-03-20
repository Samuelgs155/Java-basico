package ejercicio07;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		/*
		 Programa para realizar gestiones de un banco 
		 Tendremos 2 clases: Cliente y Cuenta
		 Cliente: nombre, apellido, dni
		 cuenta: numeroCuenta, saldo, consultar saldo, ingresar y sacar dinero		 
		 */
		
		Scanner teclado = new Scanner(System.in);
		String nombre,apellido,dni;
		int numCuenta, nCuentas, opcion, indiceNumCuenta;
		double saldo;
		Cuenta[] cuentas;
		Cliente cliente;
		
		System.out.print("Escriba el nombre del cliente");
		nombre = teclado.nextLine();
		System.out.print("Escriba el apellido del cliente");
		apellido = teclado.nextLine();
		System.out.print("Escriba el dni del cliente");
		dni = teclado.nextLine();
		System.out.println("");
		System.out.print("Cuantas cuentas tiene");
		nCuentas = teclado.nextInt();
		
		System.out.print("Datos para las cuentas");
		cuentas = new Cuenta[nCuentas];
		for(int i=0;i<nCuentas;i++) {
			System.out.print("Datos para la cuenta " + (i+1) + ":");
			System.out.print("Numero de cuenta");
			numCuenta = teclado.nextInt();
			System.out.print("Saldo de la cuenta");
			saldo = teclado.nextDouble();
			cuentas[i] = new Cuenta(numCuenta, saldo);
		}
		
		cliente = new Cliente(nombre, apellido, dni, cuentas);
		
		do {
			System.out.println("\t:MENU:");
			System.out.println("1. Ingresar dinero en la cuenta");
			System.out.println("2. Retirar dinero en la cuenta");
			System.out.println("3. Consultar dinero en la cuenta");
			System.out.println("4. SALIR");
			System.out.println("Escriba la opcion");
			opcion = teclado.nextInt();
			System.out.println("");
			
			switch(opcion) {
				case 1:
					System.out.println("Ingresar dinero en la cuenta");
					
					System.out.println("Escriba el numero de la cuenta a ingresar ");
					numCuenta = teclado.nextInt();
					indiceNumCuenta = buscarNumCuenta(cuentas, numCuenta);
					if(indiceNumCuenta == -1) {
						System.out.println("\nNo hay cuenta asociada");
						System.out.println("");
					} else {
						System.out.println("Escriba el dinero a ingresar");
						double ingreso = teclado.nextDouble();
						cliente.ingresar_dinero(indiceNumCuenta, ingreso);
						System.out.println("Dinero ingresado");
						saldo = cliente.consultar_saldo(indiceNumCuenta);
						System.out.println("Saldo disponible de la cuenta " + indiceNumCuenta + " es " + saldo);
						System.out.println("");
					}
					
					break;
				case 2:
					System.out.println("Retirar dinero en la cuenta");
					
					System.out.println("Escriba el numero de la cuenta para retirar ");
					numCuenta = teclado.nextInt();
					indiceNumCuenta = buscarNumCuenta(cuentas, numCuenta);
					if(indiceNumCuenta == -1) {
						System.out.println("\nNo hay cuenta asociada");
						System.out.println("");
					} else {
						System.out.println("Escriba el dinero a retirar");
						double retiro = teclado.nextDouble();
						cliente.retirar_dinero(indiceNumCuenta, retiro);
						System.out.println("Dinero retirado");
						saldo = cliente.consultar_saldo(indiceNumCuenta);
						System.out.println("Saldo disponible de la cuenta " + indiceNumCuenta + " es " + saldo);
						System.out.println("");
					}
					
					break;
				case 3:
					System.out.println("Consultar dinero en la cuenta");
					
					System.out.println("Escriba el numero de la cuenta para consultar ");
					numCuenta = teclado.nextInt();
					indiceNumCuenta = buscarNumCuenta(cuentas, numCuenta);
					if(indiceNumCuenta == -1) {
						System.out.println("\nNo hay cuenta asociada");
						System.out.println("");
					} else {
						saldo = cliente.consultar_saldo(indiceNumCuenta);
						System.out.println("Saldo disponible de la cuenta " + indiceNumCuenta + " es " + saldo);
					}
					
					break;
				case 4:
					System.out.println("SALIR");
					break;
				default:
					System.out.println("\nOpción errónea.\n");
					break;
			}
			
		} while(opcion != 4);
	}
	
	public static int buscarNumCuenta(Cuenta[] cuentas, int n) {
		int i=0, indice=0;
		boolean encontrado = false;
		
		// busqueda secuencial
		while((i<cuentas.length) && (encontrado==false)) {
			if(cuentas[i].getNumeroCuenta() == n) {
				encontrado = true;
				indice = i;
			}
			i++;
		}
		if(encontrado == false) {
			indice = -1;
		}
		return indice;
	}

}
