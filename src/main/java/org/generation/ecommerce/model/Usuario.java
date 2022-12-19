package org.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	private Long id;
	@Column(name="email", nullable = false)
	private String username;
	@Column(name="password", nullable = false)
	private String password;
	public Usuario(Long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}//constructor
	public Usuario() {}  //constructor vacío
	public String getUsername() {
		return username;
	}//getUsername
	public void setUsername(String username) {
		this.username = username;
	}//setUsername
	public String getPassword() {
		return password;
	}//getPassword
	public void setPassword(String password) {
		this.password = password;
	}//setPassword
	public Long getId() {
		return id;
	}//getId
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", username=" + username + ", password=" + password + "]";
	}//toString
	
}// class Usuario
