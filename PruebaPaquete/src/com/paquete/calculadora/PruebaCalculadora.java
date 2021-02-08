package com.paquete.calculadora;

import com.paquete.rutinas.Cadena;
import com.paquete.rutinas.Matematica;

public class PruebaCalculadora {

	public static void main(String[] args) {
		System.out.println("La suma de 2+2 es " + Matematica.sumar(2, 2));
		String cadena = "Hola Mundo";
		System.out.println(Cadena.mayuscula(cadena));

	}

}
