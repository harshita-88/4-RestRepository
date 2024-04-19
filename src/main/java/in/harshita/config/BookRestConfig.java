package in.harshita.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import in.harshita.entity.Book;

@Configuration
public class BookRestConfig implements RepositoryRestConfigurer{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		HttpMethod[] unsupported = {HttpMethod.PUT, HttpMethod.DELETE};
		
		config.getExposureConfiguration()
			.forDomainType(Book.class)
			.withItemExposure((metadata,http)-> http.disable(unsupported))
			.withCollectionExposure((metadata, http)->http.disable(unsupported));
		
	}
	
	

}
