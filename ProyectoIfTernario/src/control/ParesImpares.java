package control;

public class ParesImpares {

	/**
	 * Mostrar los números del 1 al 100 e indicar si se trata de un número par o impar.
	 * @param args
	 */
	public static void main(String[] args) {
		for (int f = 1; f <= 100; f++)
            System.out.println(f + " es " + (f % 2 == 0 ? "par" : "impar"));

	}

}
