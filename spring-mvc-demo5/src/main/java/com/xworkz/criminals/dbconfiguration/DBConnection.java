package com.xworkz.criminals.dbconfiguration;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DBConnection {

	public DBConnection() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean factoryBean(DataSource dataSource) {

		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setPackagesToScan("com.xworkz");
		bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		bean.setDataSource(dataSource);

		Map<String, Object> jpaProperties = new HashMap<String, Object>();
		jpaProperties.put("hibernate.show_sql", true);
		bean.setJpaPropertyMap(jpaProperties);
		return bean;

	}

	@Bean
	public DataSource dataSource() {
		System.out.println("calling dataSource");
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/xworkzbtm");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("1BE18CV411");
		return driverManagerDataSource;
	}
}
