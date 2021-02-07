package problema;

public class Main {

	/**
	 * Declarar un tipo enum llamado 'Mes', 
	 * asociar para cada constante el número de mes que corresponde.
	 * @param args
	 */
	public static void main(String[] args) {
		Mes mes1 = Mes.AGOSTO;
        System.out.print(mes1 + " " + mes1.retornarNumero()); // AGOSTO 8

	}

}
