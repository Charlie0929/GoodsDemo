package org.cskj.boot.goods.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

//解决跨域问题
@Configuration
public class CorsConfig {

	private CorsConfiguration buildconConfiguration() {
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.addAllowedHeader("*");
		configuration.addAllowedOrigin("*");
		configuration.addAllowedMethod("*");
		return configuration;
	}
	
	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", buildconConfiguration());
		return new CorsFilter(source);
	}
	
}
