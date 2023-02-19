package modelo;

public class ProductoMenu {

	private String nombre;
	private int preciobase;

	public ProductoMenu(String nombre, int preciobase) {
		this.nombre = nombre;
		this.preciobase = preciobase;
		
		
	}
	
	public String darNombre() {
		return nombre;
	}
	
	public int darPrecio() {
		return preciobase;
	}
}
