package com.pluralsight.conferencedemo.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class PersistenceConfiguration {
// 	@Bean
// 	public DataSource dataSource() {
// 		DataSourceBuilder builder = DataSourceBuilder.create();
// 		builder.url("jdbc:mysql://localhost:3306/conference_demo");
// 		builder.username("root");
// 		builder.password("Troy1894!");
// 		System.out.println("eriseld method");
// 		return builder.build();
// 	}

}
