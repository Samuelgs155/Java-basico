package control;

public class DiasLaborales {

	/**
	 * Almacenar en un vector los nombres de días que trabaja un empleado. Contar la
	 * cantidad de días que pertenecen a días laborables y fin de semana.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String[] trabajo = { "lunes", "miércoles", "sábado", "domingo" };
		int laborables = 0;
		int finsemana = 0;
		for (int f = 0; f < trabajo.length; f++)
			switch (trabajo[f]) {
			case "lunes":
			case "martes":
			case "miércoles":
			case "jueves":
			case "viernes":
				laborables++;
				break;
			case "sábado":
			case "domingo":
				finsemana++;
				break;
			}
		System.out.println("Cantidad de días que trabaja en días hábiles: " + laborables);
		System.out.println("Cantidad de días que trabaja en fin de semana: " + finsemana);

	}

}
