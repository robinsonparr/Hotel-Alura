package controller;

import Dao.UsuarioDao;
import factory.ConnectionFactory;

public class UsuarioController {
	
	private UsuarioDao usuarioDao;
	
	public UsuarioController() {
		ConnectionFactory factory = new ConnectionFactory();
		this.usuarioDao = new UsuarioDao(factory.recuperaConexion());

	}

	public boolean BuscarUsuario(String nombre, String contrasena) {
		return usuarioDao.buscarUsuario(nombre, contrasena);
	}
	
	
	

}
