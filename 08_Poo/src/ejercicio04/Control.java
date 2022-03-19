package ejercicio04;

import java.util.Scanner;

import ejercicio03.Vehiculo;

public class Control {

	public static void main(String[] args) {
		/*
		 * Programa competencia atletismo
		 * gestiona una serie de atletas con 
		 * nombre y tiempo de carrera
		 * Programa muestra los datos del ganador de la carrera
		 */
		
		Atleta[] atletas;
		int numAtletas;
		
		Scanner teclado = new Scanner(System.in);		
		System.out.println("Escriba cuantos atletas participaron:");
		numAtletas = teclado.nextInt();
		atletas = new Atleta[numAtletas];
		System.out.println("");
		
		for(int i=0;i<numAtletas;i++) {
			System.out.println("Escriba las características del atleta " + (i+1) + ":");			
			System.out.println("Escriba el dorsal del atleta");
			int dorsal = teclado.nextInt();
			System.out.println("Escriba el nombre del atleta");
			String nombre = teclado.next();
			System.out.println("Escriba el tiempo del atleta");
			float tiempo = teclado.nextFloat();
			atletas[i] = new Atleta(dorsal, nombre, tiempo);
			System.out.println("");
		}
		
		int indiceMasRapido = indiceAtletaMasRapido(atletas);
		System.out.println("");
		System.out.println(atletas[indiceMasRapido].mostrarDatos());

	}
	
	public static int indiceAtletaMasRapido(Atleta[] atletas) {
		float tiempo;
		int indice = 0;
		tiempo = atletas[0].getTiempoCarrera();
		for(int i=0;i<atletas.length;i++) {
			if(tiempo > atletas[i].getTiempoCarrera()) {
				tiempo = atletas[i].getTiempoCarrera();
				indice = i;
			}
		}
		return indice;
	}

}
