package problema;

public class MainMazo {

	/**
	 * Crear un proyecto y dentro del mismo crear dos clases. 
	 * La primer clase se debe llamar 'Carta', con dos atributos el palo 
	 * y el número de carta. Por otro lado declarar una clase llamada 'Mazo' 
	 * que contenga un ArrayList de tipo 'Carta'. 
	 * Imprimir las cartas en forma ordenadas según como se insertaron y 
	 * luego mezclar y volver a imprimir.
	 * @param args
	 */
	public static void main(String[] args) {
		Mazo mazo = new Mazo();
        System.out.println("Mazo de cartas ordenado");
        mazo.imprimir();
        mazo.barajar();
        System.out.println("Mazo de cartas despues de barajar");
        mazo.imprimir();

	}

}
