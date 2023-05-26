package com;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.event.EventListener;

import com.entity.Card;
import com.entity.User;
import com.mapper.UserMapper;
import com.service.CardService;
import com.service.UserService;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import javax.sql.DataSource;

@SpringBootApplication
public class SpWebAppStep1Application {

	@Autowired
	private DataSource dataSource;

	@Autowired
	CardService cardService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserMapper userMapper;
	
	public static void main(String[] args) {
		SpringApplication.run(SpWebAppStep1Application.class, args);
	}

	@Bean
	@Order(1) // Order to ensure execution sequence
	@DependsOn("entityManagerFactory") // Dependency on entity manager factory bean
	public DataSourceInitializer dataSourceInitializer() {
		DataSourceInitializer initializer = new DataSourceInitializer();
		initializer.setDataSource(dataSource);
		initializer.setDatabasePopulator(databasePopulator());
		return initializer;
	}

	private ResourceDatabasePopulator databasePopulator() {
		ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
		populator.addScript(new ClassPathResource("data-import.sql")); // Path to your data script
		return populator;
	}

}
