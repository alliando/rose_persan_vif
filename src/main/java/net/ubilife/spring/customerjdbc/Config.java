package net.ubilife.spring.customerjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan
public class Config {
@Bean
public DataSource dataSource() {
 DriverManagerDataSource ds = new DriverManagerDataSource();
 ds.setDriverClassName("com.mysql.jdbc.Driver");
 ds.setUrl("jdbc:mysql://localhost:3306/speakisep");
 ds.setUsername("root");
 ds.setPassword(""); 
 return ds;
}
@Bean
public JdbcOperations jdbcTemplate(DataSource ds) {
return new JdbcTemplate(ds);
}


}
