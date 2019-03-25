package br.usjt.WeatherForecast.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.WeatherForecast.model.Usuario;
import br.usjt.WeatherForecast.repository.UsuarioRepository;

@Service
public class LoginService {
	@Autowired
	UsuarioRepository usuarioRepo;
	
	public boolean logar (Usuario usuario) {
		return usuarioRepo.findOneByUsernameAndSenha(usuario.getUsername(),
		usuario.getSenha()) != null;
	}
}
