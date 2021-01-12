package com.work.testTruper.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PEDIDOS_W")
public class Pedido implements Serializable {

	private static final long serialVersionUID = 11012021L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private double total;
	
	@Column(name = "DATE_SALE")
	private Date fechaVenta;
	
	@Column(name = "USERNAME")
	private String nombreUsuario;
	
	// TODO: Relación con PedidoDetalle
//	private List<PedidoDetalle> pedidoDetalle;
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Pedido:{id:").append(id).append("]");
		sb.append("[total:").append(total).append("]");
		sb.append("[fechaVenta:").append(fechaVenta).append("]");
		sb.append("[nombreUsuario:").append(nombreUsuario).append("]}");
		return sb.toString();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public Date getFechaVenta() {
		return fechaVenta;
	}


	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

/*
	public List<PedidoDetalle> getPedidoDetalle() {
		return pedidoDetalle;
	}


	public void setPedidoDetalle(List<PedidoDetalle> pedidoDetalle) {
		this.pedidoDetalle = pedidoDetalle;
	}
*/
	
}
