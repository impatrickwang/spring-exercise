package edu.patrick.coding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Container {
	
	private final static Logger logger = LoggerFactory.getLogger(Container.class);

	public static void main(String[] args) {
		initializeClassPathContext();
		initializeFileSystemContext();
	}
	
	public static ApplicationContext initializeFileSystemContext() {
		ApplicationContext context = new FileSystemXmlApplicationContext("file-system-config.xml");
		int beanCount = context.getBeanDefinitionCount();
		logger.info("File system application context contains {} bean definitions.", beanCount);
		
		return context;
	}
	
	public static ApplicationContext initializeClassPathContext() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("class-path-config.xml");
		int beanCount = context.getBeanDefinitionCount();
		logger.info("Class path application context contains {} bean definitions.", beanCount);
		
		return context;
	}
	
	
}
