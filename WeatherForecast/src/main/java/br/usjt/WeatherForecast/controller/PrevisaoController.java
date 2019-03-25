package br.usjt.WeatherForecast.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.WeatherForecast.model.Previsao;
import br.usjt.WeatherForecast.repository.PrevisaoRepository;
import br.usjt.WeatherForecast.service.PrevisaoService;

@Controller
public class PrevisaoController {
	@Autowired
	private PrevisaoRepository prev;
	
	@Autowired
	private PrevisaoService previsaoService;
	
	@Autowired
	public PrevisaoController(PrevisaoRepository prev) {
		this.prev = prev;
	}
	
	@GetMapping("/previsoes")
	public ModelAndView retorna() {
		ModelAndView mv = new ModelAndView("lista_previsao");
		mv.addObject(new Previsao());
		List<Previsao> previsoes = previsaoService.listarTodos();
		mv.addObject("previsoes", previsoes);
		return mv;
	}
	
	@PostMapping("/previsoes")
	public String salvar(Previsao previsao) {
		previsaoService.salvar(previsao);
		return "redirect:/previsoes";
	}
	
}
