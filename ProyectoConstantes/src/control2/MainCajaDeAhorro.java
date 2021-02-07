package control2;

public class MainCajaDeAhorro {

	/**
	 * Implementar una clase llamada CajaDeAhorro. 
	 * Se debe almacenar el número de documento del titular y el monto depositado. 
	 * Una vez que se carga el documento no permitir su cambio.
Plantear dos constructores uno que llegue el documento del titular 
y el monto a depositar, y un segundo constructor que solo llegue el documento
	 * @param args
	 */
	public static void main(String[] args) {
		CajaDeAhorro caja1 = new CajaDeAhorro("21222333", 1000);
		CajaDeAhorro caja2 = new CajaDeAhorro("36454444");
		caja1.imprimir();
		caja2.imprimir();

	}

}
