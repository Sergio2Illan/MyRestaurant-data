/**
 * 
 */
package com.init7.myrestaurantdata.entity;

import java.time.LocalDateTime;

/**
 * @author sergioillanillan
 *
 */
public class CommonEntity {
	
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaModificacion;
	private boolean estado;
	
	public CommonEntity() {
		// TODO Auto-generated constructor stub
	}

	public CommonEntity(LocalDateTime fechaCreacion, LocalDateTime fechaModificacion, boolean estado) {
		super();
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.estado = estado;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public LocalDateTime getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(LocalDateTime fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	

}
