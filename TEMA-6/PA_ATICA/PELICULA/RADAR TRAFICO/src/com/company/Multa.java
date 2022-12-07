package com.company;

import java.util.Objects;

public class Multa {
	private String matricula;
	private float importeAPagar;
	private int idRadar;

	public Multa(String matricula, float importeAPagar, int idRadar){
		this.matricula= matricula;
		this.importeAPagar= importeAPagar;
		this.idRadar=idRadar;
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public float getImporteAPagar() {
		return importeAPagar;
	}
	public void setImporteAPagar(float importeAPagar) {
		this.importeAPagar = importeAPagar;
	}
	public int getIdRadar() {
		return idRadar;
	}
	public void setIdRadar(int idRadar) {
		this.idRadar = idRadar;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Multa multa = (Multa) o;
		return Float.compare(multa.importeAPagar, importeAPagar) == 0 &&
				idRadar == multa.idRadar &&
				matricula.equals(multa.matricula);
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula, importeAPagar, idRadar);
	}
}
