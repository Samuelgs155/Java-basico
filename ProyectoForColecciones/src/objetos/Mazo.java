package objetos;

public class Mazo {

	private Carta[] cartas;

	public Mazo() {
		cartas = new Carta[6];
		cartas[0] = new Carta(1, "Trebol");
		cartas[1] = new Carta(2, "Trebol");
		cartas[2] = new Carta(3, "Trebol");
		cartas[3] = new Carta(4, "Trebol");
		cartas[4] = new Carta(5, "Trebol");
		cartas[5] = new Carta(6, "Trebol");
	}

	public void imprimir() {
		System.out.println("Listado completo del mazo de cartas");
		for (Carta carta : cartas)
			carta.imprimir();
	}

	public void imprimirUnaAlAzar() {
		System.out.println("Una carta elegida al azar");
		cartas[(int) (Math.random() * 6)].imprimir();
	}
}
