package com.homsdev.demo.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.homsdev.demo.config.conditions.MongoDBDatabaseTypeCondition;
import com.homsdev.demo.config.conditions.MySQLDatabaseTypeCondition;
import com.homsdev.demo.dao.JdbcUserDAO;
import com.homsdev.demo.dao.MongoUserDAO;
import com.homsdev.demo.dao.UserDAO;

@Configuration
public class AppConfig {

	@Bean
	@Profile("DEV")
	public DataSource devDataSource() {
		return null;
	}

	@Bean
	@Profile("PROD")
	public DataSource prodDataSource() {
		return null;
	}

	@Bean
	@Conditional(MySQLDatabaseTypeCondition.class)
	public UserDAO jdbcUserDAO() {
		return new JdbcUserDAO();
	}

	@Bean
	@Conditional(MongoDBDatabaseTypeCondition.class)
	public UserDAO mongoUserDAO() {
		return new MongoUserDAO();
	}
}
