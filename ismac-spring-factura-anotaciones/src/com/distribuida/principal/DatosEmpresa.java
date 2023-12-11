package com.distribuida.principal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatosEmpresa { 
	
	
	
	@Value (value="${empresa}")
	private String empresa;
	@Value (value="${direccion}")
	private String dirrecion;
	@Value (value="${telefono}")
	private String telefono;
	@Value (value="${correo}")
	private String correo;
	
	
	public DatosEmpresa(){
		
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	public String getDirrecion() {
		return dirrecion;
	}


	public void setDirrecion(String dirrecion) {
		this.dirrecion = dirrecion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	@Override
	public String toString() {
		return "DatosEmpresa [empresa=" + empresa + ", dirrecion=" + dirrecion + ", telefono=" + telefono + ", correo="
				+ correo + "]";
	}

}
