package ejercicio06;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		/*
		 * Construir un programa para trabajar con numeros complejos
		 * con este menu
		 * 1. Sumar 2 numeros complejos
		 * 2. Multiplicar 2 numeros complejos
		 * 3. Comparar dos números complejos (iguales o no)
		 * 4. Multiplicar un número complejo por uno entero
		 */
		Scanner teclado = new Scanner(System.in);
		NumeroComplejo num1, num2, suma, mult;
		double a,b,c,d;
		int opcion;
		
		do {
			System.out.println("\t:Operaciones con Números Complejos:");
			System.out.println("1. Sumar dos números complejos");
			System.out.println("2. Multiplicar 2 numeros complejos");
			System.out.println("3. Comparar dos números complejos (iguales o no)");
			System.out.println("4. Multiplicar un número complejo por uno entero");
			System.out.println("5. Salir");
			System.out.println("Escriba la opción");
			opcion = teclado.nextInt();
			System.out.println("");
			
			switch(opcion) {
				case 1:
					System.out.println("Sumar dos números complejos");
					System.out.println("Escriba el primer numero complejo");
					System.out.println("Parte real:");
					a = teclado.nextDouble();
					System.out.println("Parte imaginaria:");
					b = teclado.nextDouble();
					System.out.println("Escriba el segundo numero complejo");
					System.out.println("Parte real:");
					c = teclado.nextDouble();
					System.out.println("Parte imaginaria:");
					d = teclado.nextDouble();
					System.out.println("");
					num1 = new NumeroComplejo(a,b);
					num2 = new NumeroComplejo(c,d);
					suma = num1.calcularSuma(num2);
					System.out.println("La suma es: (" + suma.getA() + " + " + suma.getB() +"i)");
					System.out.println("");
					break;
				case 2:
					System.out.println("Multiplicar 2 numeros complejos");
					System.out.println("Escriba el primer numero complejo");
					System.out.println("Parte real:");
					a = teclado.nextDouble();
					System.out.println("Parte imaginaria:");
					b = teclado.nextDouble();
					System.out.println("Escriba el segundo numero complejo");
					System.out.println("Parte real:");
					c = teclado.nextDouble();
					System.out.println("Parte imaginaria:");
					d = teclado.nextDouble();
					System.out.println("");
					num1 = new NumeroComplejo(a,b);
					num2 = new NumeroComplejo(c,d);
					suma = num1.calcularProducto(num2);
					System.out.println("El producto es: (" + suma.getA() + " + " + suma.getB() +"i)");
					System.out.println("");
					break;
				case 3:
					System.out.println("Comparar dos números complejos (iguales o no)");
					System.out.println("Escriba el primer numero complejo");
					System.out.println("Parte real:");
					a = teclado.nextDouble();
					System.out.println("Parte imaginaria:");
					b = teclado.nextDouble();
					System.out.println("Escriba el segundo numero complejo");
					System.out.println("Parte real:");
					c = teclado.nextDouble();
					System.out.println("Parte imaginaria:");
					d = teclado.nextDouble();
					System.out.println("");
					num1 = new NumeroComplejo(a,b);
					num2 = new NumeroComplejo(c,d);
					boolean sonIguales = num1.comprobarIgualdad(num2);
					if(sonIguales) {
						System.out.println("Son iguales");
					} else {
						System.out.println("No son iguales");
					}
					System.out.println("");
					break;
				case 4:
					System.out.println("Multiplicar un número complejo por uno entero");
					System.out.println("Escriba el primer numero complejo");
					System.out.println("Parte real:");
					a = teclado.nextDouble();
					System.out.println("Parte imaginaria:");
					b = teclado.nextDouble();
					System.out.println("Escriba el segundo numero entero");
					int entero = teclado.nextInt();
					System.out.println("");
					num1 = new NumeroComplejo(a,b);
					mult = num1.multiplicarPorEntero(entero);
					System.out.println("El producto es: (" + mult.getA() + " + " + mult.getB() +"i)");
					System.out.println("");
					break;
				case 5:
					System.out.println("Seleccionó SALIR");
					System.out.println("");
					break;
				default:
					System.out.println("Opción no válida");
					System.out.println("");
					break;
			}
		} while(opcion != 5);

	}

}
