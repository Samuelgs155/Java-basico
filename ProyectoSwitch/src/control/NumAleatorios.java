package control;

public class NumAleatorios {

	/**
	 * Generar 100 valores aleatorios comprendidos entre 1 y 10. 
	 * Contar cuantos se generaron con los valores 1,5,10 y los que no son ni 1,5 o 1
	 * @param args
	 */
	public static void main(String[] args) {
		int cant1=0;
        int cant5=0;
        int cant10=0;
        int otros=0;
        for (int f = 0; f < 100; f++) {
            int valor = (int) (Math.random() * 10) + 1;
            switch (valor) {
            case 1:
                cant1++;
                break;
            case 5:
                cant5++;
                break;
            case 10:
                cant10++;
                break;
            default:
                otros++;
            }
        }
        System.out.println("Cantidad de veces que salieron 1: " + cant1);
        System.out.println("Cantidad de veces que salieron 5: " + cant5);
        System.out.println("Cantidad de veces que salieron 10: " + cant10);
        System.out.println("Cantidad de veces que no salieron 1,5 o 10: " + otros);

	}

}
