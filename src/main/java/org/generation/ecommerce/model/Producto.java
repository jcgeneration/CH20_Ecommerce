package org.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
// POJO - Plain Old Java Object

@Entity /// Es una entidad
@Table(name="producto") // Estableciendo el nombre de la tabla en la base de datos
public class Producto {
	@Id   // id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Genera automáticamente
	@Column(name="id", unique=true, nullable=false)    // único y no es nulo
	private Long id;//Read-only
	private String nombre;
	private String descripcion;
	@Column(name="url_imagen")
	private String URL_imagen;
	private double precio;
	public Producto(Long id, String nombre, String descripcion, String uRL_imagen, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		URL_imagen = uRL_imagen;
		this.precio = precio;
	}//constructor
	
	public Producto() {	} //constructor

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getURL_imagen() {
		return URL_imagen;
	}

	public void setURL_imagen(String uRL_imagen) {
		URL_imagen = uRL_imagen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", URL_imagen="
				+ URL_imagen + ", precio=" + precio + "]";
	}//toString
	
}//class Producto
