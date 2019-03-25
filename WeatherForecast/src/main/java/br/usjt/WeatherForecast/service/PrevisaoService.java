package br.usjt.WeatherForecast.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.WeatherForecast.model.Previsao;
import br.usjt.WeatherForecast.repository.PrevisaoRepository;

@Service
public class PrevisaoService {
	@Autowired
	private PrevisaoRepository prev;
	
	public void salvar(Previsao previsao) {
		prev.save(previsao);
	}
	
	public List<Previsao> listarTodos() {
		return prev.findAll();
	}
}
