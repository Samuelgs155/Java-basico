package control4;

public class EjemploConstantes {

	public static void main(String[] args) {
		final double PI = 3.14159265358979323846;
        final double radio;
        radio=20;
        double perimetro = 2 * PI * radio;
        System.out.println(String.format("El perímetro de un círculo de radio %s es %s", radio, perimetro));
	}
}
