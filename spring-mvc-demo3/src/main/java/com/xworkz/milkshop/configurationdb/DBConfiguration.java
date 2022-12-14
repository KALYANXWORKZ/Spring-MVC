package com.xworkz.milkshop.configurationdb;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DBConfiguration {

	public DBConfiguration() {
		System.out.println("created dbConfiguration" + this.getClass().getSimpleName());
	}
	
	@Bean
 public  LocalContainerEntityManagerFactoryBean bean(DataSource dataSource) {
	   LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
	   
	   factoryBean.setPackagesToScan("com.xworkz");
	   factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
       
	   factoryBean.setDataSource(dataSource);
	   
	   HashMap<String,Object> hashMap = new HashMap<String,Object>();
	   hashMap.put("hibernate.show_sql", true);
	   factoryBean.setJpaPropertyMap(hashMap);
 
	   return factoryBean;
 }
 @Bean
 public DataSource dataSource() {
	 DriverManagerDataSource source = new DriverManagerDataSource();
	 source.setDriverClassName("com.mysql.cj.jdbc.Driver");
	 source.setUrl("jdbc:mysql://localhost:3306/xworkzbtm");
	 source.setUsername("root");
	 source.setPassword("1BE18CV411");
	 
	 return source;
 }
}

    