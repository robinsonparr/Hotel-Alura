package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import modelo.Huesped;

public class HuespedDao {

	private Connection con;

	public HuespedDao(Connection con) {
		this.con = con;
	}

	public void guardar(Huesped huesped) {
		try {
			PreparedStatement statement;
			statement = con.prepareStatement("INSERT INTO HUESPEDES "
					+ "(nombre, apellido, fechaNacimiento, nacionalidad, telefono, idReserva)"
					+ " VALUES (?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

			try (statement) {
				statement.setString(1, huesped.getNombre());
				statement.setString(2, huesped.getApellido());
				statement.setObject(3, huesped.getFechaNacimiento());
				statement.setString(4, huesped.getNacionalidad());
				statement.setString(5, huesped.getTelefono());
				statement.setInt(6, huesped.getIdReserva());

				statement.execute();

				final ResultSet resultSet = statement.getGeneratedKeys();

				try (resultSet) {
					while (resultSet.next()) {
						huesped.setId(resultSet.getInt(1));
					}
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
	
	public List<Huesped> listar() {
        List<Huesped> resultado = new ArrayList<Huesped>();

        try {
            final PreparedStatement statement = con
                    .prepareStatement("SELECT id, nombre, apellido, fechaNacimiento, nacionalidad, telefono, idReserva FROM HUESPEDES");
    
            try (statement) {
                statement.execute();
    
                final ResultSet resultSet = statement.getResultSet();
    
                try (resultSet) {
                    while (resultSet.next()) {
                        resultado.add(new Huesped(
                        		resultSet.getInt("id"),
                                resultSet.getString("nombre"),
                                resultSet.getString("apellido"),
                                resultSet.getDate("fechaNacimiento").toLocalDate(),
                                resultSet.getString("nacionalidad"),
                                resultSet.getString("telefono"),
                                resultSet.getInt("idReserva")
                                ));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultado;
    }
	public List<Huesped> buscarId(String id){
		List<Huesped> resultado = new ArrayList<Huesped>();

        try {
            final PreparedStatement statement = con
                    .prepareStatement("SELECT id, nombre, apellido, fechaNacimiento, nacionalidad, telefono, idReserva FROM huespedes WHERE id =?");
    
            try (statement) {
            	statement.setString(1, id);
                statement.execute();
    
                final ResultSet resultSet = statement.getResultSet();
    
                try (resultSet) {
                    while (resultSet.next()) {
                        resultado.add(new Huesped(
                        		resultSet.getInt("id"),
                                resultSet.getString("nombre"),
                                resultSet.getString("apellido"),
                                resultSet.getDate("fechaNacimiento").toLocalDate(),
                                resultSet.getString("nacionalidad"),
                                resultSet.getString("telefono"),
                                resultSet.getInt("idReserva")
                                ));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultado;
	}
	public void actualizar(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, String telefono, int idReserva, int id) {
		try (
	             PreparedStatement statement = con.prepareStatement(
	            		"UPDATE huespedes SET "
	            		+ "nombre = ?, "
	            		+ "apellido = ?, "
	            		+ "fechaNacimiento = ?, "
	            		+ "nacionalidad = ?, "
	            		+ "telefono = ?, "
	            		+ "idReserva = ? "
	            		+ "WHERE id = ?")){           
	            	
	                statement.setString(1, nombre);
	                statement.setString(2, apellido);
	                statement.setObject(3, fechaNacimiento);
	                statement.setString(4, nacionalidad);
	                statement.setString(5, telefono);
	                statement.setInt(6, idReserva);
	                statement.setInt(7, id);
	                statement.execute();

	            }catch (SQLException e) {
	                throw new RuntimeException(e);
	        } 
	}
	
	public void elimnar(int id) {
try {
        	
            final PreparedStatement statement = con.prepareStatement("DELETE FROM huespedes WHERE id = ?");

            try (statement) {
                statement.setInt(1, id);
                statement.execute();              

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
		
	}
}
