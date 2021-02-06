package problemas;

import java.util.Scanner;

public class Problema1 {

	private Scanner teclado;
	private String[] paises;
	private int[] habitantes;

	/**
	 * Cargar en un vector los nombres de 5 paises y en otro vector paralelo la
	 * cantidad de habitantes del mismo. Ordenar alfabéticamente e imprimir los
	 * resultados. Por último ordenar con respecto a la cantidad de habitantes (de
	 * mayor a menor) e imprimir nuevamente.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Problema1 pv=new Problema1();
        pv.cargar();
        pv.ordenarPorNombres();
 	    System.out.println("Ordenados alfabéticamente");
        pv.imprimir();
        pv.ordenarPorHabitantes();
 	    System.out.println("Ordenados por cantidad de habitnates");        
        pv.imprimir();

	}

	public void cargar() {
		teclado = new Scanner(System.in);
		paises = new String[5];
		habitantes = new int[5];
		System.out.println("Carga de paises y habitantes");
		for (int f = 0; f < paises.length; f++) {
			System.out.print("Ingese el nombre del pais:");
			paises[f] = teclado.next();
			System.out.print("Ingrese la cantidad de habitantes:");
			habitantes[f] = teclado.nextInt();
		}
	}

	public void ordenarPorNombres() {
		for (int k = 0; k < paises.length; k++) {
			for (int f = 0; f < paises.length - 1 - k; f++) {
				if (paises[f].compareTo(paises[f + 1]) > 0) {
					String auxpais;
					auxpais = paises[f];
					paises[f] = paises[f + 1];
					paises[f + 1] = auxpais;
					int auxhabitante;
					auxhabitante = habitantes[f];
					habitantes[f] = habitantes[f + 1];
					habitantes[f + 1] = auxhabitante;
				}
			}
		}
	}

	public void ordenarPorHabitantes() {
		for (int k = 0; k < paises.length; k++) {
			for (int f = 0; f < paises.length - 1 - k; f++) {
				if (habitantes[f] < habitantes[f + 1]) {
					String auxpais;
					auxpais = paises[f];
					paises[f] = paises[f + 1];
					paises[f + 1] = auxpais;
					int auxhabitante;
					auxhabitante = habitantes[f];
					habitantes[f] = habitantes[f + 1];
					habitantes[f + 1] = auxhabitante;
				}
			}
		}
	}
	
	public void imprimir() {
        for(int f=0;f<paises.length;f++) {
            System.out.println(paises[f] + " - " + habitantes[f]);
        }
    }

}
