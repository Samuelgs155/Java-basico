package control;

public class DiasLaborales {

	/**
	 * Almacenar en un vector los nombres de d�as que trabaja un empleado. Contar la
	 * cantidad de d�as que pertenecen a d�as laborables y fin de semana.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String[] trabajo = { "lunes", "mi�rcoles", "s�bado", "domingo" };
		int laborables = 0;
		int finsemana = 0;
		for (int f = 0; f < trabajo.length; f++)
			switch (trabajo[f]) {
			case "lunes":
			case "martes":
			case "mi�rcoles":
			case "jueves":
			case "viernes":
				laborables++;
				break;
			case "s�bado":
			case "domingo":
				finsemana++;
				break;
			}
		System.out.println("Cantidad de d�as que trabaja en d�as h�biles: " + laborables);
		System.out.println("Cantidad de d�as que trabaja en fin de semana: " + finsemana);

	}

}
