/**
 * 
 */
package com.init7.myrestaurantdata.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.init7.myrestaurantdata.connection.ConnectionFactory;
import com.init7.myrestaurantdata.dao.TipoRestauranteDAO;
import com.init7.myrestaurantdata.entity.TipoRestaurante;

/**
 * @author sergioillanillan
 *
 */
public class TipoRestauranteDAOImpl implements TipoRestauranteDAO{
	
	/*static { //Este bloque se ejecuta cuando se instancia la clase no antes
		try {
			
			
			ConnectionFactory.conectar();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.err.println("Error: ---> "+e.getMessage());
		}
	}*/

	@Override
	public int guardar(TipoRestaurante tipoRestaurante) throws SQLException, ClassNotFoundException {
		
			String sql = "INSERT INTO TIPO_RESTAURANTE (DESCRIPCION, FECHACREACION, ESTATUS) VALUES "
					+ "('"+tipoRestaurante.getDescripcion()+"', "+tipoRestaurante.getFechaCreacion()+"', "+tipoRestaurante.isEstado()+");";
		
			ConnectionFactory.conectar();
			
			int guardado = ConnectionFactory.executeSQL(sql);
		
		ConnectionFactory.getConnection().close();
		
		return guardado;
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
	public List<TipoRestaurante> consultar() throws ClassNotFoundException, SQLException {
		
		
		String sql = "SELECT * FROM tipo_restaurante ORDER BY descripcion";
		
		ConnectionFactory.conectar();
		
		ResultSet rs = ConnectionFactory.executeSelect(sql);
		
		List<TipoRestaurante> lista = new ArrayList<TipoRestaurante>();
		
		
		if(rs != null) {
			
			while(rs.next()) {
				TipoRestaurante  tp = new TipoRestaurante();
				tp.setIdTipoRestaurante(rs.getInt("idTipoDescripcion"));
				tp.setDescripcion(rs.getString("descripcion"));
				tp.setFechaCreacion(rs.getTimestamp("fechaCreacion").toLocalDateTime());
				tp.setEstado(rs.getBoolean("estatus"));
				
				
				lista.add(tp);
			}
			
		}
		
		ConnectionFactory.getConnection().close();
		
		return lista;
	}

	@Override
	public TipoRestaurante consultarPorId(int idTipoRestaurante) {
		// TODO Auto-generated method stub
		return null;
	}

}
