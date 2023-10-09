package co.edu.upb.ejercicioinstrumentosmusicales;

public class Guitarra extends InstrumentoMusical implements Afinable {

	private int numCuerdas;
	
	public Guitarra(String nombre, double precio, String fabricante, int numCuerdas) {
		super(nombre, precio, fabricante);
		setNumCuerdas(numCuerdas);
	}
	
	public int getNumCuerdas() {
		return numCuerdas;
	}
	
	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}
	
	@Override
	public void tocar() {
		System.out.println("   Se ha tocado la Guitarra.");
	}
	
	@Override
	public void afinar() {
		System.out.println("   Se ha Afinado la Guitarra.");
	}
	
} // public class Guitarra extends InstrumentoMusical implements Afinable
