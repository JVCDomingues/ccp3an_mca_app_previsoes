package br.usjt.WeatherForecast.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.WeatherForecast.model.Previsao;
import br.usjt.WeatherForecast.repository.PrevisaoRepository;

@Controller
public class PrevisaoController {
	@Autowired
	private PrevisaoRepository prev;
	
	@GetMapping("/previsoes")
	public ModelAndView retorna() {
		ModelAndView mv = new ModelAndView("lista_previsao");
		List<Previsao> previsoes = prev.findAll();
		mv.addObject("previsoes", previsoes);
		return mv;
	}
	
}
