package co.edu.upb.ejercicioinstrumentosmusicales;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("\n====================== Instrumentos Musicales ======================\n");
		
		// ----------------- Crear una Instancia de la Clase Guitarra ----------------
		
		Guitarra guitarra1 = new Guitarra("Malibu Vintage", 940.00 ,"Fender", 6);
		
		System.out.println("\n----------------------- Guitarra #1 -----------------------\n");	
		System.out.println("-->Nombre: " + guitarra1.getNombre() + ".");
		System.out.println("-->Precio(USD): $" + guitarra1.getPrecio());
		System.out.println("-->Fabricante: " + guitarra1.getFabricante() + ".");
		System.out.println("-->Numero de Cuerdas: " + guitarra1.getNumCuerdas());
		System.out.println("-->Afinar la Guitarra #1:"); 
		guitarra1.afinar();
		System.out.println("--> Tocar la Guitarr #1:");
		guitarra1.tocar();
		System.out.println("\n-----------------------------------------------------------");
		
		// ---------------------------------------------------------------------------
		
		
		// ----------------- Crear otra Instancia de la Clase Guitarra ----------------
		
		Guitarra guitarra2 = new Guitarra("Rgms7-Bk", 710.45, "Ibanez", 7);
		
		System.out.println("\n----------------------- Guitarra #2 -----------------------\n");
		System.out.println("-->Nombre: " + guitarra2.getNombre() + ".");
		System.out.println("-->Precio(USD): $" + guitarra2.getPrecio());
		System.out.println("-->Fabricante: " + guitarra2.getFabricante()+ ".");
		System.out.println("-->Numero de Cuerdas: " + guitarra2.getNumCuerdas());
		System.out.println("-->Afinar la Guitarra #2:");
		guitarra2.afinar();
		System.out.println("-->Tocar la Guitarra #2:");
		guitarra2.tocar();
		System.out.println("\n-----------------------------------------------------------\n");
		// ---------------------------------------------------------------------------
		
		
		// ----------------- Crear una Instancia de la Clase Piano ----------------
		
		Piano piano1 = new Piano("Piano Vertical JU109PE", 4123.00, "Yamaha", 88);
		
		System.out.println("\n------------------------ Piano #1 -------------------------\n");
		System.out.println("-->Nombre: " + piano1.getNombre() + ".");
		System.out.println("-->Precio(USD): $" + piano1.getPrecio());
		System.out.println("-->Fabricante: " + piano1.getFabricante()+ ".");
		System.out.println("-->Numero de Tecas: " + piano1.getNumTeclas());
		System.out.println("-->Afinar el Piano #1:");
		piano1.afinar();
		System.out.println("-->Tocar el Piano #1:");
		piano1.tocar();
		System.out.println("\n-----------------------------------------------------------");
		
		// -------------------------------------------------------------------------
		
		
		// ----------------- Crear otra Instancia de la Clase Piano ----------------
		
		Piano piano2 = new Piano("Piano Vertical ND-21", 6350, "Kawai", 88);
		
		System.out.println("\n------------------------ Piano #2 -------------------------\n");
		System.out.println("-->Nombre: " + piano2.getNombre() + ".");
		System.out.println("-->Precio(USD): $" + piano2.getPrecio());
		System.out.println("-->Fabricante: " + piano2.getFabricante() + ".");
		System.out.println("-->Numero de Teclas: " + piano2.getNumTeclas());
		System.out.println("-->Afinar el Piano #2: ");
		piano2.afinar();
		System.out.println("-->Tocar el Piano #2: ");
		piano2.tocar();
		System.out.println("\n-----------------------------------------------------------\n");
		
		// -------------------------------------------------------------------------
		
		System.out.println("\n====================================================================\n");
		
	} // main

} // public class Principal
