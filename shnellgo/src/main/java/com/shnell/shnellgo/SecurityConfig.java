package com.shnell.shnellgo;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter{
	
	@Autowired
	DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(new BCryptPasswordEncoder())		
		.usersByUsernameQuery("select name,password,enabled from user_details where name=?")
		.authoritiesByUsernameQuery("select name, role from user_details where name=?");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		

		
		
		http.authorizeRequests().antMatchers("/login" , "/createuser" , "/registeruser").permitAll()
		.antMatchers( "/allflights" ,"/").authenticated()
		.anyRequest().fullyAuthenticated().and().formLogin().loginPage("/login")
		.usernameParameter("username").passwordParameter("password")
		.defaultSuccessUrl("/allflights" , true)
		.failureUrl("/login")
		.permitAll().and()
//		.exceptionHandling()
//		.accessDeniedPage("/accessDenied")
//		.and()
		.logout().logoutUrl("/logout").logoutSuccessUrl("/login").permitAll().deleteCookies("JSESSIONID");
		
		http.csrf().disable();
	}
	
	@Bean
	public PasswordEncoder encoder() {
	    return new BCryptPasswordEncoder();
	}
}
