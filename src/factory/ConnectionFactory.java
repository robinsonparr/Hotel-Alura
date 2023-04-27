package factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

	private final DataSource datasource;
	
	private final String DATABASE = "hotel";
    private final String URL = "jdbc:mysql://localhost/" + DATABASE + "?useTimeZone=true&serverTimeZone=UTC";
    private final String USER = "root";
    private final String PASSWORD = "Blanca1213/*";
    
    public ConnectionFactory() {
    	ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
    	comboPooledDataSource.setJdbcUrl(URL);
        comboPooledDataSource.setUser(USER);
        comboPooledDataSource.setPassword(PASSWORD);
        comboPooledDataSource.setMaxPoolSize(10);
        
        this.datasource = comboPooledDataSource;
    }
    public Connection recuperaConexion() {
    	try {
    		return this.datasource.getConnection();
    		
    	}catch(SQLException e) {
    		throw new RuntimeException(e);
    		
    	}
    	
    }
	
}
