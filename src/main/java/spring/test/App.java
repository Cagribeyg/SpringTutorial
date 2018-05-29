package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		//bean container also bean factory can be used
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		Person person = (Person)context.getBean("person");
		person.speak();
		
		
		
		Address address = (Address)context.getBean("address");
		System.out.println(address);
		
		System.out.println(person);
		((FileSystemXmlApplicationContext)context).close();
	}

}
