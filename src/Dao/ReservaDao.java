package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import modelo.Reserva;

public class ReservaDao {

	private Connection con;

	public ReservaDao(Connection con) {
		this.con = con;
	}

	public void guardar(Reserva reserva) {
		try {
			PreparedStatement statement;
			statement = con.prepareStatement(
					"INSERT INTO RESERVAS" + "(fechaEntrada, fechaSalida, valor, formaPago)" + "VALUES (?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);

			try (statement) {
				statement.setObject(1, reserva.getFechaEntrada());
				statement.setObject(2, reserva.getFechaSalida());
				statement.setObject(3, reserva.getValor());
				statement.setObject(4, reserva.getFormaPago());

				statement.execute();

				final ResultSet resultSet = statement.getGeneratedKeys();

				try (resultSet) {
					while (resultSet.next()) {
						reserva.setId(resultSet.getInt(1));
					}
				}
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Reserva> listar() {
		List<Reserva> resultado = new ArrayList<Reserva>();

		try {
			final PreparedStatement statement = con
					.prepareStatement("SELECT id, fechaEntrada, fechaSalida, valor, formaPago FROM reservas");
			try (statement) {
				statement.execute();

				final ResultSet resultSet = statement.getResultSet();

				try (resultSet) {
					while (resultSet.next()) {

					
					resultado.add(new Reserva(resultSet.getInt("id"),
							resultSet.getDate("fechaEntrada").toLocalDate(),
							resultSet.getDate("fechaSalida").toLocalDate(),
							resultSet.getString("Valor"),
							resultSet.getString("formaPago")));
				}
			}
	
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);

		}
		return resultado;

	}

	public List<Reserva> buscarId(String id) {
		List<Reserva> resultado = new ArrayList<Reserva>();

		try {
			final PreparedStatement statement = con.prepareStatement(
					"SELECT id, fechaEntrada, fechaSalida, valor, formaPago FROM reservas WHERE id =?");

			try (statement) {
				statement.setString(1, id);
				statement.execute();

				final ResultSet resultSet = statement.getResultSet();

				try (resultSet) {
					while (resultSet.next()) {

						resultado.add(new Reserva(resultSet.getInt("ID"),
								resultSet.getDate("fechaEntrada").toLocalDate().plusDays(1),
								resultSet.getDate("fechaSalida").toLocalDate().plusDays(1),
								resultSet.getString("valor"), resultSet.getString("formaPago")));
					}
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return resultado;

	}
	public void actualizar(LocalDate fechaEntrada, LocalDate fechaSalida, String valor, String formaPago, int id) {
		try {
            final PreparedStatement statement = con.prepareStatement(
                    "UPDATE reservas SET "
                    + " fechaEntrada = ?, "
                    + " fechaSalida = ?,"
                    + " valor = ?,"
                    + "formaPago = ?"
                    + " WHERE id = ?");

            try (statement) {
                statement.setObject(1, java.sql.Date.valueOf(fechaEntrada));
                statement.setObject(2, java.sql.Date.valueOf(fechaSalida));
                statement.setString(3, valor);
                statement.setString(4, formaPago);
                statement.setInt(5, id);
                statement.execute();

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
      }
    }	
	public void eliminar(int id) {
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
