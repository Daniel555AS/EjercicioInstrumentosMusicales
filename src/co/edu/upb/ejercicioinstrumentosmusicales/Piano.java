package co.edu.upb.ejercicioinstrumentosmusicales;

public class Piano extends InstrumentoMusical implements Afinable {

	private int numTeclas;
	
	public Piano(String nombre, double precio, String fabricante, int numTeclas) {
		super(nombre, precio, fabricante);
		setNumTeclas(numTeclas);
	}
	
	public int getNumTeclas() {
		return numTeclas;
	}
	
	public void setNumTeclas(int numTeclas) {
		this.numTeclas = numTeclas;
	}
	
	@Override
	public void tocar() {
		System.out.println("   Se ha Tocado el Piano.");
	}
	
	@Override
	public void afinar() {
		System.out.println("   Se ha afinado el Piano.");
	}
	
} // public class Piano extends InstrumentoMusical implements Afinable
