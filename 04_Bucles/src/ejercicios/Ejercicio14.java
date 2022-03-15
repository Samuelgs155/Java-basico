package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio14 {

	public static void main(String[] args) {
		/*
		 * Dados 5 alumnos
		 * mostrar edad y estatura media 
		 * cantidad alumnos mayores de 18 anios
		 * miden más de 1.75
		 */
		int sumaEdad = 0;
		double sumaAltura = 0.0;
		int mayores18anios = 0;
		int mayores175 = 0;
		for(int i=1;i<=5;i++) {
			int edad = Integer.parseInt(JOptionPane.showInputDialog("escriba la edad del alumno"));
			double altura  = Double.parseDouble(JOptionPane.showInputDialog("escriba la altura del alumno"));
			
			sumaEdad = sumaEdad + edad;
			sumaAltura = sumaAltura + altura;
			
			if(edad > 18) {
				mayores18anios++;
			}
			if(altura > 1.75) {
				mayores175++;
			}
		}
		double mediaEdad = sumaEdad / 5;
		double mediaAltura = sumaAltura / 5;
		JOptionPane.showMessageDialog(null, "La media de edad es " + mediaEdad + "\n" 
				+  "La media de altura es " + mediaAltura + "\n" 
				+ "Num mayores 18 años " + mayores18anios + "\n" 
				+ "Más altos de 1.75m es " + mayores175);

	}

}
