package control;

import java.util.Set;
import java.util.TreeSet;

public class ListaNoRepetida {

	/**
	 * Generar una lista de 10 valores enteros comprendidos entre 1 y 100. Validar que no se repitan, 
	 * para esto utilizar la ayuda de una de las colecciones de conjuntos visto en este concepto.
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Integer> conjunto1 = new TreeSet<Integer>();
        while (conjunto1.size() < 10) {
            int aleatorio = (int) (Math.random() * 100) + 1;
            conjunto1.add(aleatorio);
        }
        System.out.println(conjunto1);

	}

}
