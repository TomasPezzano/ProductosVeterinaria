package productosVeterinaria.dominio;

import java.util.HashSet;

public class Proovedor {
	private Long cuit;
	private String razonSocial;
	private String direccion;
	private HashSet<Telefono> listaDeTelefonos = new HashSet<Telefono>();
	
	public Proovedor() {
		
	}

	public Proovedor(Long cuit, String razonSocial, String direccion) {
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.direccion = direccion;
		this.listaDeTelefonos = new HashSet<Telefono>();
	}

	public Long getCuit() {
		return cuit;
	}

	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public HashSet<Telefono> getListaDeTelefonos() {
		return listaDeTelefonos;
	}

	public void setListaDeTelefonos(HashSet<Telefono> listaDeTelefonos) {
		this.listaDeTelefonos = listaDeTelefonos;
	}
	
	
	
}
