package com.uabc.project.api.entities;

public class Student {
	private Long id;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Integer edad;
	
	public Student() {}
	
	public Student(Long id, String nombre, String apellidoPaterno, String apellidoMaterno, Integer edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.edad = edad;
	}
	
	public Long getId() {
		return id;
	}
	public Student setId(Long id) {
		this.id = id;
		return this;
	}
	public String getNombre() {
		return nombre;
	}
	public Student setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public Student setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
		return this;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public Student setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
		return this;
	}
	public Integer getEdad() {
		return edad;
	}
	public Student setEdad(Integer edad) {
		this.edad = edad;
		return this;
	}
}
