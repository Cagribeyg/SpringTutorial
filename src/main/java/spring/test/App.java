package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		//bean container also bean factory can be used
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		Person person = (Person)context.getBean("person");
		Address address2 = (Address)context.getBean("address");
		
		FruitBasket fb =(FruitBasket)context.getBean("basket");
		
		Jungle jungle = (Jungle)context.getBean("jungle");
		System.out.println(jungle);
		System.out.println("hello there");
		((FileSystemXmlApplicationContext)context).close();
	}

}
