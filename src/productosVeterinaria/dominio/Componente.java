package productosVeterinaria.dominio;

public class Componente {
	private String pais;
	private String f_vencimiento;
	private Boolean analizado;
	private Integer cod_componente;
	private String descripcion;
	
	public Componente(String pais, String f_vencimiento, Boolean analizado, Integer cod_componente, String descripcion) {
		this.pais = pais;
		this.f_vencimiento = f_vencimiento;
		this.analizado = analizado;
		this.cod_componente = cod_componente;
		this.descripcion = descripcion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getF_vencimiento() {
		return f_vencimiento;
	}

	public void setF_vencimiento(String f_vencimiento) {
		this.f_vencimiento = f_vencimiento;
	}

	public Boolean getAnalizado() {
		return analizado;
	}

	public void setAnalizado(Boolean analizado) {
		this.analizado = analizado;
	}

	public Integer getCod_componente() {
		return cod_componente;
	}

	public void setCod_componente(Integer cod_componente) {
		this.cod_componente = cod_componente;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
