/**
 * 
 */
package com.init7.myrestaurantdata.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	private static Statement statement;
	
	
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
		
		statement = connection.createStatement();
		
		return connection;
		
	}
	
	
	public static int executeSQL(String query) throws SQLException {
		System.out.println("QUERY  -----> "+query);
		int result = statement.executeUpdate(query);
		
		
		return result;
	}
	
	
	public static ResultSet executeSelect(String query) throws SQLException {
		System.out.println("QUERY  -----> "+query);
		
		return statement.executeQuery(query);
	}
	
	public static Connection getConnection() { 
		return connection;
	}
	
	
	public static void  closeConnection () throws SQLException {
		
		connection.close();
		
	}
	
}
