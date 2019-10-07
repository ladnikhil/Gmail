 package com.ust.ustspringmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class OrmConfig {
	
	@Bean                       // it is a bean method so
	public LocalEntityManagerFactoryBean ormConfiguration() {
		
		LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();  // it automatically return object of entity manager factory
		bean.setPersistenceUnitName("employee-unit");//setting persistence unit
		return bean;
		
	}

}
