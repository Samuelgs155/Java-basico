package problema;

public class GenerarEstados {

	
	/**
	 * Se tienen los siguientes vectores paralelos con las notas y nombres de alumnos:
        String[] alumnos = { "juan", "ana", "luis", "carla", "pedro", "laura", "maria" };
        int[] notas = { 3, 7, 10, 9, 2, 8, 5 };
		Generar otro vector paralelo con el String "libre" si la nota es menor a 4 
		y la cadena "regular" si la nota es mayor o igual a cuatro.

		Emplear el operador condicional para cargar el vector paralelo.
	 * @param args
	 */
	public static void main(String[] args) {
		String[] alumnos = { "juan", "ana", "luis", "carla", "pedro", "laura", "maria" };
        int[] notas = { 3, 7, 10, 9, 2, 8, 5 };
        String[] estados = new String[notas.length];
        for (int f = 0; f < notas.length; f++)
            estados[f] = notas[f] >= 4 ? "regular" : "libre";
        for (int f = 0; f < notas.length; f++)
            System.out.println(alumnos[f] + " tiene una nota " + notas[f] + " esta " + estados[f]);

	}

}
