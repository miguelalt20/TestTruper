package com.work.testTruper.modelo;

public class Producto {

	private String sku;
	
	private String nombre;
	
	private int existencia;
	
	private double precio;
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Producto:{[SKU:").append(sku).append("]");
		sb.append("[nombre:").append(nombre).append("]");
		sb.append("existencia:").append(existencia).append("]");
		sb.append("precio:").append(precio).append("]}");
		return sb.toString();
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
