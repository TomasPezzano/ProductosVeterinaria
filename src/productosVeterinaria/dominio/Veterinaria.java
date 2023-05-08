package productosVeterinaria.dominio;

import java.util.HashSet;

public class Veterinaria {
	private String nombreVeterinaria;
	
	
	public Veterinaria() {
		
	}

	public Veterinaria(String nombreVeterinaria) {
		this.nombreVeterinaria = nombreVeterinaria;
	
	}

	public String getNombreVeterinaria() {
		return nombreVeterinaria;
	}

	public void setNombreVeterinaria(String nombreVeterinaria) {
		this.nombreVeterinaria = nombreVeterinaria;
	}

	
}
