/**
 * 
 */
package com.init7.myrestaurantdata.principal;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;

import com.init7.myrestaurantdata.connection.ConnectionFactory;
import com.init7.myrestaurantdata.dao.impl.TipoRestauranteDAOImpl;
import com.init7.myrestaurantdata.entity.TipoRestaurante;

/**
 * @author sergioillanillan
 *Clase principal para probar la conexion con la BBDD.
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*try {
			
			
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
		}*/
		
		
		 TipoRestaurante restaurant = new TipoRestaurante();
		 restaurant.setDescripcion("El restaurante mas molón");
		 restaurant.setFechaCreacion(LocalDateTime.now());
		 restaurant.setEstado(true);
		 
		 
		 TipoRestauranteDAOImpl impl = new TipoRestauranteDAOImpl();
		 try {
			int resultado = impl.guardar(restaurant);
			
			if(resultado > 0) {
				System.out.println("Se ha guaradado el dato en la BBDD de forma correcta.");
			}else {
				System.err.println("NO se ha podido guardar en la BBDD.");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("ERROR ---> "+e.getMessage());
		}

	}

}
