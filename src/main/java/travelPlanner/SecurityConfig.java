//package travelPlanner;
//
//import javax.sql.DataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	private DataSource dataSource;
//	
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//			.csrf().disable()
//			.formLogin()
//				.loginPage("/login")
//				
//			.and()
//			.authorizeRequests()
//			.antMatchers("/auth/**").permitAll()
//            .antMatchers("/test/**").permitAll()
//            .anyRequest().authenticated()
//			.and()
//			.logout()
//				.logoutUrl("/logout");
//			
//	}
//	
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth
//			.inMemoryAuthentication().withUser("admin@gmail.com").password("1234567");
//		
//		auth
//			.jdbcAuthentication()
//			.dataSource(dataSource)
//			.usersByUsernameQuery("SELECT emailId, password FROM users WHERE emailId=?");
//	}
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {return new BCryptPasswordEncoder();}
//	
//}
