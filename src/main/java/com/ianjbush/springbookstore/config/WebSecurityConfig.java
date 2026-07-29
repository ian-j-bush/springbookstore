package com.ianjbush.springbookstore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) {
        http.authorizeHttpRequests(auth -> auth
                .requestMatchers(HttpMethod.GET, "/", "/css/**", "/book", "/book/**",
                        "/author", "/author/**", "/feedback").permitAll()
                        .requestMatchers("/register", "/login").permitAll()
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.POST, "/book/*/reviews").authenticated()
                        .requestMatchers("/profile/**").authenticated()
                        .anyRequest().authenticated())
                .formLogin(form -> form
                        .loginPage("/login")
                        .defaultSuccessUrl("/", false)
                        .permitAll()
                ).logout(logout -> logout.logoutSuccessUrl("/").permitAll());
        return http.build();
    }
}
