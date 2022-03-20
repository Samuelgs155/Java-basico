package ejercicio08;

import java.util.Scanner;

import ejercicio07.Cuenta;

public class Control {
	
	/*
	 * Empresa de envío de paquetes a sus sucursales
	 * sucursal: numero, dirección y ciudad
	 * paquete: precio, prioridad
	 * precios: 1 euro por kg, 10 euros extra por prioridad alta y 20 si es express
	 * cada paquete tendrá un número de referencia y el dni de la persona que lo envía
	 * 
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroSucursal, numeroPaquete, prioridad, opcion;
		int contadorSucursal = 0;
		int contadorPaquete = 0;
		String direccion, ciudad, dni;
		double peso;
		int indice;
		
		Sucursal[] sucursales = new Sucursal[50];
		Paquete[] paquetes = new Paquete[100];
		
		do {
			System.out.println("\t:MENU:");
			System.out.println("1. Crear una nueva sucursal");
			System.out.println("2. Enviar paquete");
			System.out.println("3. Consultar sucursal");
			System.out.println("4. Consultar paquete");
			System.out.println("5. Mostrar todas sucursales");
			System.out.println("6. Mostrar todos los paquetes");
			System.out.println("7. SALIR");
			System.out.println("Escriba la opción apropiada");
			opcion = teclado.nextInt();
			System.out.println("");
			
			
			switch(opcion) {
				case 1:
					System.out.println("1. Crear una nueva sucursal");
					System.out.println("Escriba el número de sucursal");
					numeroSucursal = teclado.nextInt();
					System.out.println("Escriba la dirección de la sucursal");
					direccion = teclado.next();
					System.out.println("Escriba la ciudad de la sucursal");
					ciudad = teclado.next();				
					sucursales[contadorSucursal] = new Sucursal(numeroSucursal, direccion, ciudad);
					contadorSucursal++;
					System.out.println("");
					break;
				case 2:
					System.out.println("2. Enviar paquete");
					System.out.println("Escriba el número de sucursal");
					numeroSucursal = teclado.nextInt();
					indice = buscarSucursal(sucursales, numeroSucursal);
					if(indice == -1) {
						System.out.println("\nNo hay sucursal asociada");
						System.out.println("");
					} else {
						System.out.println("Escriba el número de paquete");
						numeroPaquete = teclado.nextInt();
						System.out.println("Escriba el dni");
						dni = teclado.next();
						System.out.println("Escriba el peso");
						peso = teclado.nextDouble();
						System.out.println("Escriba la prioridad");
						prioridad = teclado.nextInt();					
						paquetes[contadorPaquete] = new Paquete(numeroPaquete, dni, peso, prioridad);
						double precioPaquete = sucursales[indice].calcular_precio(paquetes[contadorPaquete]);
						System.out.println("El precio del paquete será de " + precioPaquete + " euros");
						contadorPaquete++;
						System.out.println("");
					}
					
					break;
				case 3:
					System.out.println("3. Consultar sucursal");
					System.out.println("Escriba el número de sucursal");
					numeroSucursal = teclado.nextInt();
					indice = buscarSucursal(sucursales, numeroSucursal);
					if(indice == -1) {
						System.out.println("\nNo hay sucursal asociada");
						System.out.println("");
					} else {
						Sucursal sucursal = sucursales[indice];
						System.out.println(sucursal.mostrarSucursal());
						System.out.println("");
					}
					break;
				case 4:
					System.out.println("3. Consultar pquete");
					System.out.println("Escriba el número del paquete");
					numeroPaquete = teclado.nextInt();
					indice = buscarPaquete(paquetes, numeroPaquete);
					if(indice == -1) {
						System.out.println("\nNo hay paquete asociado");
						System.out.println("");
					} else {
						Paquete paquete = paquetes[indice];
						System.out.println(paquete.toString());
						System.out.println("");
					}
					break;
				case 5:
					System.out.println("5. Mostrar todas sucursales");
					for(int i=0;i<contadorSucursal;i++) {
						System.out.println(sucursales[i].mostrarSucursal());
					}
					System.out.println("");
					break;
				case 6:
					System.out.println("5. Mostrar todos los paquetes");
					for(int i=0;i<contadorPaquete;i++) {
						System.out.println(paquetes[i].toString());
					}
					System.out.println("");
					break;
				case 7:
					System.out.println("SALIR");
					break;
				default:
					System.out.println("Opción incorrecta");
					System.out.println("");
					break;
			}
			
		} while(opcion != 7);
	}
	
	public static int buscarSucursal(Sucursal[] sucursales, int n) {
		int i=0, indice=0;
		boolean encontrado = false;
		
		// busqueda secuencial
		while((i<sucursales.length) && (encontrado==false)) {
			if(sucursales[i].getNumeroSucursal() == n) {
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
	
	public static int buscarPaquete(Paquete[] paquetes, int n) {
		int i=0, indice=0;
		boolean encontrado = false;
		
		// busqueda secuencial
		while((i<paquetes.length) && (encontrado==false)) {
			if(paquetes[i].getNumeroPaquete() == n) {
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
