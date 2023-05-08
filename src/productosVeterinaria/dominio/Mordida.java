package productosVeterinaria.dominio;

public class Mordida {
	private Integer id_mordida;
	private String mordida;
	
	
	public Mordida(Integer id_mordida, String mordida) {
		this.id_mordida = id_mordida;
		this.mordida = mordida;
	}


	public Integer getId_mordida() {
		return id_mordida;
	}


	public void setId_mordida(Integer id_mordida) {
		this.id_mordida = id_mordida;
	}


	public String getMordida() {
		return mordida;
	}


	public void setMordida(String mordida) {
		this.mordida = mordida;
	}
	
	
}
