package viettel.one.startup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;

/**
 * Spring MongoDB configuration file
 * 
 */
@Configuration
public class SpringMongoConfig{

	public @Bean
	MongoTemplate mongoTemplate() throws Exception {
		
		MongoTemplate mongoTemplate = new MongoTemplate(new MongoClient("123.30.186.62"), "mydb");
		return mongoTemplate;
		
	}
		
}