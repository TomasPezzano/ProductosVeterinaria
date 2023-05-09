package productosVeterinaria.dominio;

import java.util.HashSet;

public class PaisDeProcedencia {
	private String nombre;
	private Integer codigoPais;
	private HashSet<Provincia> provincias = new HashSet<>();

	
	public PaisDeProcedencia(String nombre, Integer codigoPais) {
		this.nombre = nombre;
		this.codigoPais = codigoPais;
		this.provincias = new HashSet<Provincia>();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getCodigoPais() {
		return codigoPais;
	}


	public void setCodigoPais(Integer codigoPais) {
		this.codigoPais = codigoPais;
	}


	public HashSet<Provincia> getProvincias() {
		return provincias;
	}


	public void setProvincias(HashSet<Provincia> provincias) {
		this.provincias = provincias;
	}
	
	public void agregarProvincia(Provincia provincia) {
		provincias.add(provincia);
	}
	
	
}
