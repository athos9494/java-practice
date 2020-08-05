package club.banyuan.blog.config;

import club.banyuan.blog.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private LoginService loginService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(loginService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin/category/all").authenticated()
                .antMatchers("/admin/**").hasRole("超级管理员")
                .anyRequest().authenticated()
                .and().formLogin().loginPage("/")
                .successHandler(getAuthenticationSuccessHandler())
                .failureHandler(getAuthenticationFailureHandler())
                .loginProcessingUrl("/login")
                .usernameParameter("username").passwordParameter("password").permitAll()
                .and().logout().permitAll().and().csrf().disable().exceptionHandling()
                .accessDeniedHandler(getAccessDeniedHandler());
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/blogimg/**","/index.html","/static/**");
    }

    @Bean
    AuthenticationSuccessHandler getAuthenticationSuccessHandler() {
        return new AuthSuccessHandler();
    }

    @Bean
    AuthenticationFailureHandler getAuthenticationFailureHandler() {
        return new AuthFailureHandler();
    }

    @Bean
    AccessDeniedHandler getAccessDeniedHandler() {
        return new AuthAccessDeniedHandler();
    }


}
