package control;

public class ValoresAleatorios {

	/**
	 * Generar 10 valores aleatorios comprendidos entre 1 y 50. 
	 * Mostrar cada uno de los valores y un mensaje indicando si tiene 1 o 2 dígitos.
	 * @param args
	 */
	public static void main(String[] args) {
		for (int f = 0; f < 10; f++) {
            int aleatorio = (int) (Math.random() * 50) + 1;
            System.out.println("El valor " + aleatorio + " tiene " + (aleatorio < 10 ? "1 dígito" : "2 dígitos"));
        }

	}

}
