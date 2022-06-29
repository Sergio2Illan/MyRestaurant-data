/**
 * 
 */
package com.init7.myrestaurantdata.entity;

import java.time.LocalDateTime;

/**
 * @author sergioillanillan
 *
 */
public class Restaurante extends CommonEntity{
	
	private int idRestaurante;
	private String nombre;
	private String imagen;
	private String slogan;
	private Restaurante restaurante;
	private Menu menu;
	
	public Restaurante() {}

	public Restaurante(LocalDateTime fechaCreacion, LocalDateTime fechaModificacion, boolean estado) {
		super(fechaCreacion, fechaModificacion, estado);
		// TODO Auto-generated constructor stub
	}
	
	public Restaurante(LocalDateTime fechaCreacion, LocalDateTime fechaModificacion, boolean estado,int idRestaurante, String nombre, String imagen, String slogan, Restaurante restaurante,
			Menu menu) {
		super(fechaCreacion, fechaModificacion, estado);
		this.idRestaurante = idRestaurante;
		this.nombre = nombre;
		this.imagen = imagen;
		this.slogan = slogan;
		this.restaurante = restaurante;
		this.menu = menu;
	}

	public Restaurante(int idRestaurante, String nombre, String imagen, String slogan, Restaurante restaurante,
			Menu menu) {
		super();
		this.idRestaurante = idRestaurante;
		this.nombre = nombre;
		this.imagen = imagen;
		this.slogan = slogan;
		this.restaurante = restaurante;
		this.menu = menu;
	}
	
	
	
	
	

}
