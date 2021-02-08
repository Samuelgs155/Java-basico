package control;

import java.util.PriorityQueue;

public class PruebaPriorityQueue {

	/**
	 * Una variante de una cola clásica la implementa la clase PriorityQueue. 
	 * Cuando se agregan elementos a la cola se organiza según su valor, 
	 * por ejemplo si es un número se ingresan de menor a mayor.
	 * @param args
	 */
	public static void main(String[] args) {
		PriorityQueue<Integer> cola1 = new PriorityQueue<Integer>();
        cola1.add(70);
        cola1.add(120);
        cola1.add(6);
        System.out.println("Imprimimos la cola con prioridades de enteros");
        while (!cola1.isEmpty())
            System.out.print(cola1.poll() + "-");

	}

}
