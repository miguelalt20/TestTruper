package com.work.testTruper.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PEDIDOS_DETALLE_W")
public class PedidoDetalle {

	@Id
	private int id;
	
//	private Pedido pedido;
	private int idPedido;
	
//	private Producto producto;
	@Column
	private String sku;
	
	@Column(name = "AMOUT")
	private int cantidad;
	
	@Column(name = "PRICE")
	private double precio;
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("DetallePedido:{id:").append(id).append("]");
		sb.append("[idPedido:").append(idPedido).append("]");
		sb.append("[sku:").append(sku).append("]");
		sb.append("[cantidad:").append(cantidad).append("]");
		sb.append("[precio:").append(precio).append("]}");
		return sb.toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
