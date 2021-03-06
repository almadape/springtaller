package py.edu.facitec.springtaller.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.config.annotation.*;

import py.edu.facitec.springtaller.controller.HomeController;
//Activa el componente mvc de Spring para trabajar con Servlet
	@EnableWebMvc
	
	// Carga las clases necesarias para iniciar la aplicacion
	
	@ComponentScan(basePackageClasses={HomeController.class})
	public class AppWebConfiguration extends WebMvcConfigurationSupport{
		//Gestiona como un nuevo componente de la aplicacion
		@Bean
		public InternalResourceViewResolver internalResourceViewResolver(){
			
			InternalResourceViewResolver resolver= new InternalResourceViewResolver();
			
			resolver.setPrefix("/WEB-INF/views/");
			resolver.setSuffix(".jsp");
			return resolver;
			
		}
		
	}

	
