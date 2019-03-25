package br.usjt.WeatherForecast.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.WeatherForecast.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Usuario findOneByUsernameAndSenha (String username, String senha);
}
