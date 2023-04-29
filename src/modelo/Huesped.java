package modelo;

import java.time.LocalDate;

public class Huesped {
	
	private int id;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String nacionalidad;
	private String telefono;
	private int idReserva;
	
	



	public Huesped(int id, String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad,
			String telefono, int idReserva) {
	
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.telefono = telefono;
		this.idReserva = idReserva;
	}


	public int getId() {
		return this.id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return this.nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return this.apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getNacionalidad() {
		return this.nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public String getTelefono() {
		return this.telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public int getIdReserva() {
		return this.idReserva;
	}


	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	} 
	
	
	
	

}
