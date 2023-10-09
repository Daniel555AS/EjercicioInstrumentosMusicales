package co.edu.upb.ejercicioinstrumentosmusicales;

public abstract class InstrumentoMusical {

	private String nombre;
	private double precio; // Precio en Dolares Estadounidenses
	private String fabricante;
	
	public InstrumentoMusical(String nombre, double precio, String fabricante) {
		setNombre(nombre);
		setPrecio(precio);
		setFabricante(fabricante);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public abstract void tocar();
	
} // public abstract class InstrumentoMusical
