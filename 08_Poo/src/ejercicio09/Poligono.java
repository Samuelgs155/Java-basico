package ejercicio09;

public abstract class Poligono {

	private int numeroLados;

	public Poligono(int numeroLados) {
		super();
		this.numeroLados = numeroLados;
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	public void setNumeroLados(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	public abstract double area();

	@Override
	public String toString() {
		return "Poligono [numeroLados=" + numeroLados + "]";
	}

}
