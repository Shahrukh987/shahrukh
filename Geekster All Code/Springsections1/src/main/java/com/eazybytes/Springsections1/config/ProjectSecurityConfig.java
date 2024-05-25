package com.eazybytes.Springsections1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity)throws Exception
	{
		httpSecurity.authorizeHttpRequests()
		.requestMatchers("/myAccount","/myBalences","/myLoans","/myCards").authenticated()
		.requestMatchers("/myContacts","/notices").permitAll()
		.and().formLogin()
		.and().httpBasic();
		
		return httpSecurity.build();
		
	}
	
}
