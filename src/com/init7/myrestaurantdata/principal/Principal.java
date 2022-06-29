/**
 * 
 */
package com.init7.myrestaurantdata.principal;

import java.sql.Connection;
import java.sql.SQLException;

import com.init7.myrestaurantdata.connection.ConnectionFactory;

/**
 * @author sergioillanillan
 *Clase principal para probar la conexion con la BBDD.
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			
			
			Connection conexionGenerada = ConnectionFactory.conectar();
			
			if(conexionGenerada != null) {
				System.out.println("Se ha establecido la conexion con la BBDD de forma correcta.");
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Error: ---> "+e.getLocalizedMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Error: ---> "+e.getLocalizedMessage());
		}

	}

}
