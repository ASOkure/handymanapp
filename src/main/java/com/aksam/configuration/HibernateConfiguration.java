package com.aksam.configuration;

import java.beans.PropertyVetoException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableTransactionManagement
@ComponentScan({ "com.aksam" })
@PropertySource(value = { "classpath:persistence-mysql.properties" })
public class HibernateConfiguration {

	
	// set up variable to hold the properties
		@Autowired
		private Environment env;

		// set up a logger for diagnostics
		private Logger logger = Logger.getLogger(getClass().getName());
	

		
		 @Bean 
		 public DataSource myDataSource() {
			 
			  // create connection pool 
				  ComboPooledDataSource myDataSource = new ComboPooledDataSource();
			  
			  // set the jdbc driver
				  try {
			  myDataSource.setDriverClass("com.mysql.jdbc.Driver"); 
			  } 
			catch(PropertyVetoException exc) 
				  
				  { throw new RuntimeException(exc); }
			  
			  // for sanity's sake, let's log url and user ... just to make sure we are
			 // reading the data 
			 logger.info("jdbc.url=" + env.getProperty("jdbc.url"));
			 logger.info("jdbc.user=" + env.getProperty("jdbc.user"));
			// set database connection props
			  myDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
			  myDataSource.setUser(env.getProperty("jdbc.user"));
			  myDataSource.setPassword(env.getProperty("jdbc.password"));
			  
			  // set connection pool props 
			  myDataSource.setInitialPoolSize( getIntProperty("connection.pool.initialPoolSize"));
			  
			  myDataSource.setMinPoolSize( getIntProperty("connection.pool.minPoolSize"));
			 
			  myDataSource.setMaxPoolSize( getIntProperty("connection.pool.maxPoolSize"));
			  
			  myDataSource.setMaxIdleTime( getIntProperty("connection.pool.maxIdleTime"));
			  
			  return myDataSource; }
			 

			// need a helper method
			// read environment property and convert to int

			
			  private int getIntProperty(String propName) {
			  
			  String propVal = env.getProperty(propName);
			  
			  // now convert to int 
			  int intPropVal = Integer.parseInt(propVal);
			  
			  return intPropVal; }
			  
			  private Properties getHibernateProperties() {
			  
			  // set hibernate properties
				  Properties props = new Properties();
			  
			  props.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
			  props.setProperty("hibernate.show_sql",
			  env.getProperty("hibernate.show_sql"));
			  
			  return props; }
			  
			  @Bean 
			  public LocalSessionFactoryBean sessionFactory() {
			  
			  // create session factorys
				  LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
			  
			  
			  // set the properties 
			  sessionFactory.setDataSource(myDataSource());
			  //sessionFactory.setPackagesToScan(env.getProperty("hiberante.packagesToScan")) ;
			  sessionFactory.setPackagesToScan(new String[] {"com.aksam.entity"});
			  sessionFactory.setHibernateProperties(getHibernateProperties());
			  
			  return sessionFactory; }
			  
			  @Bean
			  @Autowired
			  public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
			  
			  // setup transaction manager based on session factory
			  HibernateTransactionManager txManager = new HibernateTransactionManager();
			  txManager.setSessionFactory(sessionFactory);
			  
			  return txManager; }
			 
}
	/* @Autowired
	    private Environment environment;

	    @Bean
	    public LocalSessionFactoryBean sessionFactory() {
	        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	        sessionFactory.setDataSource(dataSource());
	        sessionFactory.setPackagesToScan(new String[] { "com.aksam.model" });
	        sessionFactory.setHibernateProperties(hibernateProperties());
	        return sessionFactory;
	     }
		
	    @Bean
	    public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
	        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
	        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
	        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
	        return dataSource;
	    }
	    
	    private Properties hibernateProperties() {
	        Properties properties = new Properties();
	        properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
	        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
	        properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
	        return properties;        
	    }
	    
		@Bean
	    @Autowired
	    public HibernateTransactionManager transactionManager(SessionFactory s) {
	       HibernateTransactionManager txManager = new HibernateTransactionManager();
	       txManager.setSessionFactory(s);
	       return txManager;
	    }
	
}
*/