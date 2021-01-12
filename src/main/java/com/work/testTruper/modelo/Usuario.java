package com.work.testTruper.modelo;

public class Usuario {

	private String userName;
	
	private String password;
	
	private String role;
	
	private String nombre;
	
	private String apellidos;
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Usuario:{[nombre:").append(nombre).append("]");
		sb.append("[role:").append(role).append("]");
		sb.append("[nombre:").append(nombre).append(" ").append(apellidos).append("]}");
			
		return sb.toString();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}
