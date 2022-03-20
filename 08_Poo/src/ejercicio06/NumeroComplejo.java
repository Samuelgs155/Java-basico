package ejercicio06;

public class NumeroComplejo {
	
	private double a;
	private double b;
	
	public NumeroComplejo(double a, double b) {
		super();
		this.a = a; // Parte real
		this.b = b; // Parte imaginaria
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	};
	
	public NumeroComplejo calcularSuma(NumeroComplejo c) {
		// numero1 = 3 + 4i
		// numero2 = 2 + 5i
		// suma = 5 + 9i
		NumeroComplejo suma = new NumeroComplejo(this.a + c.getA(), this.b + c.getB());
		return suma;		
	}
	
	public NumeroComplejo calcularProducto(NumeroComplejo c) {
		/*
		 *  numero1 = 3 + 4i
			numero2 = 2 + 5i
			producto = (3*2 - 4*3) + (3*5 + 4*2)i
		 */
		NumeroComplejo producto = new NumeroComplejo(((this.a * c.getA()) - (this.b*this.a)), 
				((this.a + c.getB()) + (this.b * c.getA()) ));
		return producto;	
	}
	
	public boolean comprobarIgualdad(NumeroComplejo c) {
		/*
		 *  numero1 = 3 + 4i
			numero2 = 2 + 5i
		*/
		boolean igualdad = false;
		if(a==c.getA() && (this.b==c.getB())) {
			 igualdad = true;
		}
		return igualdad;
	}
	
	public NumeroComplejo multiplicarPorEntero(int val) {
		// numero1 = 3 + 4i
		// entero = 2
		// mult = 6 + 8i
		NumeroComplejo mult = new NumeroComplejo(this.a * val, this.b * val);
		return mult;
	}

}
