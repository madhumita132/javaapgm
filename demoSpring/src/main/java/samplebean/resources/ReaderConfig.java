package samplebean.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
@Configuration
@PropertySource
({"classpath:properties/property1.properties","classpath:properties/property2.properties"})
public class ReaderConfig {
@Bean
public PropertySourcesPlaceholderConfigurer propertyConfigIn(){
	return new  PropertySourcesPlaceholderConfigurer();
}

}
