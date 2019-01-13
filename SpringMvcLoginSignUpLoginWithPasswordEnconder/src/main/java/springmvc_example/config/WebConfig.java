package springmvc_example.config;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan({ "springmvc_example" })
public class WebConfig extends WebMvcConfigurerAdapter {

	@Autowired
	DataSource datasource;

	@Bean
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return new NamedParameterJdbcTemplate(datasource);
	}
    @Bean
	public DataSource getDatasource() {
    	DriverManagerDataSource ds = new DriverManagerDataSource();
    	ds.setDriverClassName("com.mysql.jdbc.Driver");
    	ds.setUrl("jdbc:mysql://localhost/springmvc");
    	ds.setUsername("root");
    	ds.setPassword("fraga");
    	
    	
    	
		return ds;
	}
    public InternalResourceViewResolver viewResolver() {
    	 	InternalResourceViewResolver  viewResolver = new InternalResourceViewResolver();
    	 	viewResolver.setViewClass(JstlView.class);
    	 	viewResolver.setPrefix("/WEB-INF/jsp");
    	 	viewResolver.setSuffix(".jsp");
    	 	
    	 	return viewResolver;
    }
    
    public ResourceBundleMessageSource messageSource() {
    	ResourceBundleMessageSource rb = new ResourceBundleMessageSource();
    	rb.setBasenames(new String[] {"validation"});
    	
    	
    	return rb;
    	
    }
    

}
