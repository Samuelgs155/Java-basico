package control;

public class Operadores_03_Math {

	public static void main(String[] args) {
		double raiz = Math.sqrt(9);
		System.out.println(raiz);
		System.out.println("--------------");
		double base = 5;
		double exponente = 2;
		double resultado = Math.pow(base, exponente);
		System.out.println(resultado);
		System.out.println("--------------");
		double numero = 4.56;
		double resultado1 = Math.round(numero);
		System.out.println(resultado1);
		System.out.println("--------------");
		float fNumero = 4.56f;
		int resultado2 = Math.round(fNumero);
		System.out.println(resultado2);
		System.out.println("--------------");
		double numerorandom = Math.random();
		System.out.println(numerorandom);
		System.out.println("--------------");
	}
}
