package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		//bean container also bean factory can be used
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		Logger logger = (Logger)context.getBean("logger");
		logger.writeConsole("Hello there");
		logger.writeFile("File Write");
		((FileSystemXmlApplicationContext)context).close();
	}

}
