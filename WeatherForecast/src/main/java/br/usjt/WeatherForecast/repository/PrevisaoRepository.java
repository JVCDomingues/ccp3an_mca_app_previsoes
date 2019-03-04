package br.usjt.WeatherForecast.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.WeatherForecast.model.Previsao;

public interface PrevisaoRepository extends JpaRepository<Previsao, Long> {

}
