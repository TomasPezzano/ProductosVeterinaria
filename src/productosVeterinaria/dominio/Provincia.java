package productosVeterinaria.dominio;

import java.util.HashSet;
import java.util.Objects;

public class Provincia {
	private Integer codigoProvincia;
	private String nombreProvincia;
	private Double valorImpuesto;
	private HashSet<Proovedor> listaDeProovedores = new HashSet<Proovedor>();
	
	public Provincia() {
		
	}
	
	public Provincia(Integer codigoProvincia, String nombreProvincia, Double valorImpuesto) {
		this.codigoProvincia = codigoProvincia;
		this.nombreProvincia = nombreProvincia;
		this.valorImpuesto = valorImpuesto;
		this.listaDeProovedores = new HashSet<Proovedor>();
	}

	public Integer getCodigoProvincia() {
		return codigoProvincia;
	}

	public void setCodigoProvincia(Integer codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
	}

	public String getNombreProvincia() {
		return nombreProvincia;
	}

	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}

	public Double getValorImpuesto() {
		return valorImpuesto;
	}

	public void setValorImpuesto(Double valorImpuesto) {
		this.valorImpuesto = valorImpuesto;
	}
	
	public void agregarProovedores(Proovedor proovedor) {
		
		if(proovedor.validarCuit()) {
			this.listaDeProovedores.add(proovedor);
		}
	}

	public HashSet<Proovedor> getListaDeProovedores() {
		return listaDeProovedores;
	}

	public void setListaDeProovedores(HashSet<Proovedor> listaDeProovedores) {
		this.listaDeProovedores = listaDeProovedores;
	}
	
	public Boolean validarCodigoProvincia() {
		if(this.codigoProvincia > 0 && this.codigoProvincia < 24) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoProvincia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provincia other = (Provincia) obj;
		return Objects.equals(codigoProvincia, other.codigoProvincia);
	}
	
	
	
}
