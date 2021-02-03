package problemas;

import java.util.Scanner;

public class NotasAlumnos {

	/**
	 * Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe 
	 * cuántos tienen notas mayores o iguales a 7 y cuántos menores
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int contador = 1;
		int notasMayoresASiete = 0;
		int notasMenoresASiete = 0;
		
		double nota;;
		
		while(contador <= 10) {
			System.out.print("Ingrese la nota del alumno " + contador + " : ");
			nota = teclado.nextDouble();
			contador++;
			if(nota >= 7) {
				notasMayoresASiete++;
			} else {
				notasMenoresASiete++;
			}
		}
		
		System.out.println("Existen " + notasMayoresASiete + " notas mayores o igual a 7.");
		System.out.println("Existen " + notasMenoresASiete + " notas menores a 7.");
		
		
		

	}

}
