/**
 * 
 */
package com.init7.myrestaurantdata.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.init7.myrestaurantdata.connection.ConnectionFactory;
import com.init7.myrestaurantdata.dao.TipoRestauranteDAO;
import com.init7.myrestaurantdata.entity.TipoRestaurante;

/**
 * @author sergioillanillan
 *
 */
public class TipoRestauranteDAOImpl implements TipoRestauranteDAO{
	
	static { //Este bloque se ejecuta cuando se instancia la clase no antes
		try {
			
			
			ConnectionFactory.conectar();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.err.println("Error: ---> "+e.getMessage());
		}
	}

	@Override
	public int guardar(TipoRestaurante tipoRestaurante) throws SQLException {
			String sql = "INSERT INTO TIPO_RESTAURANTE (DESCRIPCION, FECHACREACION, ESTATUS) VALUES "
					+ "('"+tipoRestaurante.getDescripcion()+"', "+tipoRestaurante.getFechaCreacion()+"', "+tipoRestaurante.isEstado()+");";
		return ConnectionFactory.executeSQL(sql);
	}

	@Override
	public int actualizar(TipoRestaurante tipoRestaurante) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(int idTipoRestaurante) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TipoRestaurante> consultar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoRestaurante consultarPorId(int idTipoRestaurante) {
		// TODO Auto-generated method stub
		return null;
	}

}
