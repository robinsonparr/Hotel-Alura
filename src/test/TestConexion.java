package test;

import java.sql.Connection;
import java.sql.SQLException;

import factory.ConnectionFactory;

public class TestConexion {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
        Connection con = factory.recuperaConexion();

       System.out.println("Conexion Exitosa");
        
       con.close();
        System.out.println("Conexion cerrada correctamente");
    }
	
}
