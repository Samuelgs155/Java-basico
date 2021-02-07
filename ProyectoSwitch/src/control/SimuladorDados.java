package control;

public class SimuladorDados {

	/**
	 * Simular el tirado de un dado 1000 veces. 
	 * Mostrar luego la cantidad de veces que salieron cada valor. 
	 * Resolverlo empleando tanto con if como con switch.
	 * @param args
	 */
	public static void main(String[] args) {
		int lado1 = 0;
        int lado2 = 0;
        int lado3 = 0;
        int lado4 = 0;
        int lado5 = 0;
        int lado6 = 0;
        for (int f = 0; f < 1000; f++) {
            int dado = (int) (Math.random() * 6) + 1;
            if (dado == 1)
                lado1++;
            else if (dado == 2)
                lado2++;
            else if (dado == 3)
                lado3++;
            else if (dado == 4)
                lado4++;
            else if (dado == 5)
                lado5++;
            else if (dado == 6)
                lado6++;
        }
        System.out.println("Resultado de la primer simulación");
        System.out.println("Cantidad de veces que salieron 1:" + lado1);
        System.out.println("Cantidad de veces que salieron 2:" + lado2);
        System.out.println("Cantidad de veces que salieron 3:" + lado3);
        System.out.println("Cantidad de veces que salieron 4:" + lado4);
        System.out.println("Cantidad de veces que salieron 5:" + lado5);
        System.out.println("Cantidad de veces que salieron 6:" + lado6);

        // Empleando la estructura swich
        lado1 = 0;
        lado2 = 0;
        lado3 = 0;
        lado4 = 0;
        lado5 = 0;
        lado6 = 0;
        for (int f = 0; f < 1000; f++) {
            int dado = (int) (Math.random() * 6) + 1;
            switch (dado) {
            case 1:
                lado1++;
                break;
            case 2:
                lado2++;
                break;
            case 3:
                lado3++;
                break;
            case 4:
                lado4++;
                break;
            case 5:
                lado5++;
                break;
            case 6:
                lado6++;
                break;
            }
        }
        System.out.println("Resultado de la segunda simulación");
        System.out.println("Cantidad de veces que salieron 1:" + lado1);
        System.out.println("Cantidad de veces que salieron 2:" + lado2);
        System.out.println("Cantidad de veces que salieron 3:" + lado3);
        System.out.println("Cantidad de veces que salieron 4:" + lado4);
        System.out.println("Cantidad de veces que salieron 5:" + lado5);
        System.out.println("Cantidad de veces que salieron 6:" + lado6);

	}

}
