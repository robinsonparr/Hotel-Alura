package controller;

import java.time.LocalDate;
import java.util.List;

import Dao.HuespedDao;
import factory.ConnectionFactory;
import modelo.Huesped;

public class HuespedController {

	
	public HuespedDao huespedDao;
	
	public HuespedController() {
		ConnectionFactory factory = new ConnectionFactory();
		this.huespedDao = new HuespedDao(factory.recuperaConexion());
		
		
		}
	
	public void guardar(Huesped huesped) {
		this.huespedDao.guardar(huesped);
	}
	
	
	public List<Huesped> listar(){
		return this.huespedDao.listar();
	}
	
	
	public List<Huesped> buscarId(String id){
		return this.huespedDao.buscarId(id);
	}
	
	public void actualizar(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, String telefono, int idReserva, int id) {
		this.huespedDao.actualizar(nombre, apellido, fechaNacimiento, nacionalidad, telefono, idReserva, id);
	}
	
	public void eliminar(int id) {
		this.huespedDao.elimnar(id);
	}
	
}
