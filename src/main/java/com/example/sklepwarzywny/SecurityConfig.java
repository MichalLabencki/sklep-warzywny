package com.example.sklepwarzywny;

import com.example.sklepwarzywny.user.AuthorisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig<MyBasicAuthenticationEntryPoint> extends WebSecurityConfigurerAdapter {

    private AuthorisationService authorisationService;

    @Autowired
    public SecurityConfig(AuthorisationService authorisationService) {
        this.authorisationService = authorisationService;
    }
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user").password("{noop}password").roles("USER")
        .and().withUser("user2").password("{noop}12345").roles("USER","ADMIN");
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
                .authorizeRequests()
                .antMatchers("/registration", "/")
                .permitAll()
                .antMatchers("/products")
                .authenticated()
                .antMatchers("/cart")
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll().and().authenticationProvider(this.authorisationService);
                http.headers()
                .frameOptions()
                .disable();
    }
}