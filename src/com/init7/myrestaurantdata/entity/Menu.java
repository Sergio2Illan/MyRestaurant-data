/**
 * 
 */
package com.init7.myrestaurantdata.entity;

import java.time.LocalDateTime;

/**
 * @author sergioillanillan
 *
 */
public class Menu extends CommonEntity {
	
	
	private int idMenu;
	private String clave;
	private String descripcion;
	
	public Menu() {}

	public Menu(int idMenu, String clave, String descripcion) {
		super();
		this.idMenu = idMenu;
		this.clave = clave;
		this.descripcion = descripcion;
	}

	
	public Menu(LocalDateTime fechaCreacion, LocalDateTime fechaModificacion, boolean estado, int idMenu, String clave, String descripcion) {
		super(fechaCreacion, fechaModificacion, estado);
		this.idMenu = idMenu;
		this.clave = clave;
		this.descripcion = descripcion;
	}
	
	public Menu(LocalDateTime fechaCreacion, LocalDateTime fechaModificacion, boolean estado) {
		super(fechaCreacion, fechaModificacion, estado);
		// TODO Auto-generated constructor stub
	}

	public int getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
	
	
	

}
