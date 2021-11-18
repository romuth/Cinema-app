package cinema.app.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final PasswordEncoder encoder;
    private final UserDetailsService userDetailsService;

    public SecurityConfig(PasswordEncoder encoder, UserDetailsService userDetailsService) {
        this.encoder = encoder;
        this.userDetailsService = userDetailsService;
    }

    @Autowired
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(encoder);
    }

    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/register").permitAll()
                .antMatchers(HttpMethod.DELETE, "/movie-sessions/{id}").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/movie-sessions/{id}").hasRole("ADMIN")
                .antMatchers("/orders/**", "/shopping-carts/**").hasRole("USER")
                .antMatchers("/users/by-email").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET, "/cinema-halls", "/movies",
                        "/movie-sessions/**").hasAnyRole("USER", "ADMIN")
                .antMatchers(HttpMethod.POST, "/cinema-halls", "/movies",
                        "/movie-sessions").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .permitAll()
                .and()
                .httpBasic()
                .and()
                .csrf().disable();
    }
}
