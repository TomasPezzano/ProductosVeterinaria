package productosVeterinaria.dominio;

import java.util.HashSet;

public class Veterinaria {
	private String nombreVeterinaria;
	private HashSet<Proovedor> listaDeProovedores = new HashSet<Proovedor>();
	
	public Veterinaria() {
		
	}

	public Veterinaria(String nombreVeterinaria) {
		this.nombreVeterinaria = nombreVeterinaria;
		this.listaDeProovedores = new HashSet<Proovedor>();
	}

	public String getNombreVeterinaria() {
		return nombreVeterinaria;
	}

	public void setNombreVeterinaria(String nombreVeterinaria) {
		this.nombreVeterinaria = nombreVeterinaria;
	}

	public HashSet<Proovedor> getListaDeProovedores() {
		return listaDeProovedores;
	}

	public void setListaDeProovedores(HashSet<Proovedor> listaDeProovedores) {
		this.listaDeProovedores = listaDeProovedores;
	}
	
	
}
