/**
 * 
 */
package com.init7.myrestaurantdata.entity;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author sergioillanillan
 *
 */
public class TipoRestaurante extends CommonEntity{
	
	private int idTipoRestaurante;
	private String descripcion;
	private List<Restaurante> listadoRestaurantes;
	
	
	public TipoRestaurante() {}


	public TipoRestaurante(LocalDateTime fechaCreacion, LocalDateTime fechaModificacion, boolean estado) {
		super(fechaCreacion, fechaModificacion, estado);
		// TODO Auto-generated constructor stub
	}


	public TipoRestaurante(LocalDateTime fechaCreacion, LocalDateTime fechaModificacion, boolean estado, int idTipoRestaurante, String descripcion, List<Restaurante> listadoRestaurantes) {
		super(fechaCreacion, fechaModificacion, estado);
		this.idTipoRestaurante = idTipoRestaurante;
		this.descripcion = descripcion;
		this.listadoRestaurantes = listadoRestaurantes;
	}


	public TipoRestaurante(int idTipoRestaurante, String descripcion, List<Restaurante> listadoRestaurantes) {
		super();
		this.idTipoRestaurante = idTipoRestaurante;
		this.descripcion = descripcion;
		this.listadoRestaurantes = listadoRestaurantes;
	}


	public int getIdTipoRestaurante() {
		return idTipoRestaurante;
	}


	public void setIdTipoRestaurante(int idTipoRestaurante) {
		this.idTipoRestaurante = idTipoRestaurante;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public List<Restaurante> getListadoRestaurantes() {
		return listadoRestaurantes;
	}


	public void setListadoRestaurantes(List<Restaurante> listadoRestaurantes) {
		this.listadoRestaurantes = listadoRestaurantes;
	}
	
	
	
	
	
	
	

}
