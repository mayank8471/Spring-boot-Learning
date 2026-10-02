package in.mayank.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import in.mayank.filter.AppFilter;
import in.mayank.service.CustomerService;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {

	@Autowired
	private CustomerService service;
	
	@Autowired
	private AppFilter appFilter;

	@Bean
	public BCryptPasswordEncoder pwdEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public DaoAuthenticationProvider authProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider((UserDetailsService) service);

		authProvider.setPasswordEncoder(pwdEncoder());

		return authProvider;
	}

	@Bean
	public AuthenticationManager authManager(AuthenticationConfiguration config) {
		return config.getAuthenticationManager();
	}

	@Bean
	public SecurityFilterChain security(HttpSecurity http) {
		http.authorizeHttpRequests(
				(req) -> req.requestMatchers("/login", "/register").permitAll().anyRequest().authenticated());
		http.addFilterBefore(
				appFilter,
				UsernamePasswordAuthenticationFilter.class
				);
		return http.csrf((csrf) -> csrf.disable()).build();
	}
}
