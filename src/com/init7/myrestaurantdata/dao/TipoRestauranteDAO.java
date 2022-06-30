/**
 * 
 */
package com.init7.myrestaurantdata.dao;

import java.sql.SQLException;
import java.util.List;

import com.init7.myrestaurantdata.entity.TipoRestaurante;

/**
 * @author sergioillanillan
 *
 */
public interface TipoRestauranteDAO {
	
	
	/**
	 * 
	 * @param tipoRestaurante
	 * @return 1o mas esta todo correcto, 0 se produjo un error
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	int guardar(TipoRestaurante tipoRestaurante) throws SQLException, ClassNotFoundException;
	
	
	
	/**
	 * 
	 * @param tipoRestaurante
	 * @return 1o mas esta todo correcto, 0 se produjo un error
	 */
	int actualizar(TipoRestaurante tipoRestaurante);
	
	
	/**
	 * 
	 * @param idTipoRestaurante
	 * @return 1o mas esta todo correcto, 0 se produjo un error
	 */
	int eliminar(int idTipoRestaurante);
	
	
	
	/**
	 * 
	 * @return lista de tipos de restaurante o null que no hay
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	List<TipoRestaurante> consultar() throws ClassNotFoundException, SQLException;
	
	
	/**
	 * 
	 * @param idTipoRestaurante
	 * @return TipoRestaurante o null
	 */
	TipoRestaurante consultarPorId(int idTipoRestaurante);

}
