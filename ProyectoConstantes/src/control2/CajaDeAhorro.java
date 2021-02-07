package control2;

public class CajaDeAhorro {
	
	private final String documento;
	private float monto;

	public CajaDeAhorro(String documento, float monto) {
		this.documento = documento;
		this.monto = monto;
	}

	public CajaDeAhorro(String documento) {
		this.documento = documento;
		this.monto = 0;
	}

	public void imprimir() {
		System.out.println("Documento:" + documento + "  Saldo:" + monto);
	}

}
