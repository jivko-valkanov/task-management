package org.zhivko.taskManagement.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    public SecurityConfiguration() {
        //
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/styles/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers(HelperUrls.LOGIN_URL, HelperUrls.REGISTRATION_URL,
//                        HelperUrls.FORGOT_PASSWORD_URL, HelperUrls.API_GET_CITIES_BY_REGION_ID_WITH_ID, HelperUrls.API_GET_REGIONS_BY_COUNTRY_ID_WITH_ID,
//                        "/css/**","/js/**","/styles/**", "/rest/**")
//                .permitAll()
//                //.antMatchers(HelperUrls.CALENDAR_URL).access("hasRole('ADMIN') or hasRole('USER')")//.hasRole("ADMIN")
//                .anyRequest()./*permitAll()*/authenticated()
//                .and()
//                .formLogin()
//                .loginPage(HelperUrls.LOGIN_URL)
//                .permitAll()
//                .usernameParameter("_username")
//                .passwordParameter("_password")
//                .defaultSuccessUrl(HelperUrls.DASHBOARD_DEFAULT, true)
//                .and()
//                .logout()
//                .logoutRequestMatcher(new AntPathRequestMatcher(HelperUrls.LOGOUT_URL))
//                .logoutSuccessUrl(HelperUrls.LOGIN_URL_SUCCESS)
//                .clearAuthentication(true)
//                .invalidateHttpSession(true)
//                .deleteCookies("JSESSIONID", "remember-me")
//                .permitAll()
//                .and()
//                .csrf()
//                .csrfTokenRepository(csrfTokenRepository())
//                .and()
//                .rememberMe()
//                .key("test-key-asdafg-8883748")
//                .rememberMeParameter("_remember-me")
//                .rememberMeCookieName("remember-me-cookie")
//                .tokenValiditySeconds(24 * 60 * 60); // 1 day
        http.authorizeRequests()
                .antMatchers("auth/login","auth/registration")
                .permitAll()
                .anyRequest()
                .permitAll();
    }

    public CsrfTokenRepository csrfTokenRepository(){
        HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
        repository.setSessionAttributeName("_csrf");

        return repository;
    }

}
