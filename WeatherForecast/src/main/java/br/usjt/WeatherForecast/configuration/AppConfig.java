package br.usjt.WeatherForecast.configuration;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.usjt.WeatherForecast.interceptor.LoginInterceptor;

public class AppConfig implements WebMvcConfigurer {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(
		new LoginInterceptor()).
		addPathPatterns("/**").
		excludePathPatterns("/login", "/", "/fazerLogin");
	}
}
