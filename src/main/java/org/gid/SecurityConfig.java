package org.gid;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled=true)
public class SecurityConfig  extends WebSecurityConfigurerAdapter{
	@Autowired
	
	public void globalConfig(AuthenticationManagerBuilder auth/*,DataSource dataSource*/) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("1234").roles("ADMIN","RESPONSABLE");
		auth.inMemoryAuthentication().withUser("collab0").password("80").roles("COLLABORATEUR");
		auth.inMemoryAuthentication().withUser("collab1").password("81").roles("COLLABORATEUR");
		auth.inMemoryAuthentication().withUser("collab5").password("85").roles("COLLABORATEUR");
		auth.inMemoryAuthentication().withUser("collab4").password("84").roles("COLLABORATEUR");
		auth.inMemoryAuthentication().withUser("collab3").password("83").roles("COLLABORATEUR");
		auth.inMemoryAuthentication().withUser("collab2").password("82").roles("COLLABORATEUR");
		auth.inMemoryAuthentication().withUser("collab7").password("70").roles("COLLABORATEUR");
		
		/*auth.jdbcAuthentication()
		.dataSource(dataSource)
	      .usersByUsernameQuery("select username as principal,password as credentials,true from users where username = ?")
		 .authoritiesByUsernameQuery(" select user_username as principal,roles_role as role from users_roles where user_username = ?")
		 .rolePrefix("ROL_");

		   		 		*/
		   		 		
	}
	
   @Override
    protected void configure(HttpSecurity http) throws Exception{
	
	
        http   
               .csrf().disable()
                 .authorizeRequests()
               /*  .antMatchers("/css/**","/js/**","/images/**").permitAll()*/
             .anyRequest()
                        .authenticated()
                          .and()
                           .formLogin()
                             .loginPage("/login")
                              .permitAll()
                                  .defaultSuccessUrl("/index.html")
                                  
                                  .failureForwardUrl("/login")
                                  .permitAll()
                                  .and()
                                .logout()
                                .invalidateHttpSession(true)
                                .logoutUrl("/logout")
                                .permitAll();
                                  
                                    

	
}
}