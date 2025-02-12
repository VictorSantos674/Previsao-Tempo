package com.previsaotempo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeRequests()
                .antMatchers("/previsao/**").permitAll() // Permite acesso sem autenticação
                .antMatchers("/historico/**").authenticated() // Exige autenticação
                .antMatchers("/alertas/**").hasRole("ADMIN") // Exige papel de ADMIN
            .and()
            .httpBasic(); // Usa autenticação básica (pode ser substituída por JWT)
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}