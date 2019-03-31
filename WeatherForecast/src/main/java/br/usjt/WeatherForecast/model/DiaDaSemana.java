package br.usjt.WeatherForecast.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DiaSemana")
public class DiaDaSemana {
	@Id
	@GeneratedValue
	private String diaSemana;

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	
}
