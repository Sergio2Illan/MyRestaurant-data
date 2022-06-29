/**
 * 
 */
package com.init7.myrestaurantdata.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author sergioillanillan
 *
 *Clase encargada de  de realizar la configuracion de la conexion y ahbilitacion  de las transacciones con la BBDD.
 */
public class ConnectionFactory {

	
	
	/**
	 * Se encarga de mantener la conexion con la BBDD
	 */
	private static  Connection connection;
	
	
	/**
	 * Permite conectarse con la BBDD
	 * 
	 * @return Objeto connection | null.
	 * @throws ClassNotFoundException al no cargar el driver connection.
	 * @throws SQLException error al no abrir bien la conexion con la BBDD.
	 */
	public static Connection conectar() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/Restaurante";
		String user = "root";
		String password = "Superman33";
		
		
		connection = DriverManager.getConnection(url, user, password);
		
		return connection;
		
	}
	
	
	public static void  closeConnection () throws SQLException {
		
		connection.close();
		
	}
	
}
