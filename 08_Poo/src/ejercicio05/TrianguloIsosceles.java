package ejercicio05;

public class TrianguloIsosceles {
	
	private double base;
	private double lado;
	
	public TrianguloIsosceles(double base, double lado) {
		super();
		this.base = base;
		this.lado = lado;
	}
	
	public double obtenerPerimetro() {
		return (2*this.lado) + this.base;
	}
	
	public double obtenerArea() {
		double area = (base*Math.sqrt((lado*lado)-((base*base)/4)))/2;
		return area;
	}
	
	public String mostrarDatos() {
		return "El triángulo tiene de base: " + base + ", lado: " + lado +", perimetro: " + this.obtenerPerimetro() + 
				", area: " + this.obtenerArea();
	}

}
