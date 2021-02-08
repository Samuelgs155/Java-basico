package control;

public class FizzBuzz {

	
	/**
	 * Codificar un programa que muestre en pantalla los números del 1 al 100, 
	 * sustituyendo los múltiplos de 3 por el palabra "Fizz" y, 
	 * a su vez, los múltiplos de 5 por "Buzz". 
	 * Para los números que, al mismo tiempo, son múltiplos de 3 y 5, 
	 * mostrar el mensaje "FizzBuzz".
	 * @param args
	 */
	public static void main(String[] args) {
		for (int f = 1; f <= 100; f++)
            System.out.println(f % 3 == 0 && f % 5 == 0 ? "FizzBuzz" : (f % 3 == 0 ? "Fizz" : (f % 5 == 0 ? "Buzz" : f)));

	}

}
