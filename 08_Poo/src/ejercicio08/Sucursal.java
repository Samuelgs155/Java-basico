package ejercicio08;

public class Sucursal {
	
	private int numeroSucursal;
	private String direccion;
	private String ciudad;
	
	public Sucursal(int numeroSucursal, String direccion, String ciudad) {
		super();
		this.numeroSucursal = numeroSucursal;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}

	public int getNumeroSucursal() {
		return numeroSucursal;
	}

	public void setNumeroSucursal(int numeroSucursal) {
		this.numeroSucursal = numeroSucursal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String mostrarSucursal() {
		return "Los datos de la sucursal son: [numero, direccion, ciudad] = [" 
				+ getNumeroSucursal() + "," + getDireccion() + "," + getCiudad() + "]";
	}
	
	public double calcular_precio(Paquete t) {
		double precio = t.getPeso();
		if(t.getPrioridad() == 1) {
			precio += 10;
		} else if(t.getPrioridad() == 2) {
			precio += 20;
		}
		return precio;
		
	}
	

}
