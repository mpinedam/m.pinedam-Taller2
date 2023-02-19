package modelo;

public class Pedido {
	
	
	private int numeroPedido;
	private int idPedido;
	String nombreCliente;
	String direccionCliente;
	
	public Pedido(int numeroPedido, int idPedido, String nombreCliente, String direccionCliente) {
		this.numeroPedido = numeroPedido;
		this.idPedido = idPedido;
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		
		
		
	}
	
	public int darNumPedido() {
		return numeroPedido;
	}
	
	public int darIdpedido() {
		return idPedido;
	}
	
}
