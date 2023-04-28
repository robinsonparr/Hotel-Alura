package controller;

import java.time.LocalDate;
import java.util.List;

import Dao.ReservaDao;
import factory.ConnectionFactory;
import modelo.Reserva;

public class ReservaController {

	private ReservaDao reservaDao;

	public ReservaController() {
		ConnectionFactory factory = new ConnectionFactory();
		this.reservaDao = new ReservaDao(factory.recuperaConexion());
	}

	public void guardar(Reserva reserva) {
		this.reservaDao.guardar(reserva);
	}

	public List<Reserva> listar() {
		return this.reservaDao.listar();
	}

	public List<Reserva> buscarId(String id) {
		return this.reservaDao.buscarId(id);
	}

	public void actualizar(LocalDate fechaEntrada, LocalDate fechaSalida, String valor, String formaPago, int id) {
		this.reservaDao.actualizar(fechaEntrada, fechaSalida, valor, formaPago, id);
	}
	

	public void eliminar(Integer id) {
    	this.reservaDao.eliminar(id);
    }
}


