package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import factory.ConnectionFactory;

public class Usuario {

	private int id;
	private String nombre;
	private String contrasena;

	public Usuario(int id, String nombre, String contrasena) {
		this.id = id;
		this.nombre = nombre;
		this.contrasena = contrasena;
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

	public String getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public static boolean validarUsuarios(String nombre, String contraseña) {
		ConnectionFactory con = new ConnectionFactory();
		Connection connect = con.recuperaConexion();
		try {
			final PreparedStatement statement = connect.prepareStatement("SELECT * FROM usuarios WHERE nombre=? AND contrasena=?");
			try(statement){
				statement.setString(1, nombre);
				statement.setString(2, contraseña);
				
				statement.execute();
				
				final ResultSet resultSet = statement.executeQuery();
				return resultSet.next();
			}
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

}
