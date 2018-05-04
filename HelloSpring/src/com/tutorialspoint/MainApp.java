package com.tutorialspoint;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
	public static void main(String[] args) {
		
		/*Spring BeanFactory容器*/
/*		XmlBeanFactory factory =new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		HelloWorld obj=(HelloWorld)factory.getBean("testid");
		obj.getMessage();*/
		
		/*Spring ApplicationContext容器*/
		/*ClassPathXmlApplicationContext传入相对的xml路径即可*/
//	    ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//	    HelloWorld obj = (HelloWorld) context.getBean("testid");
//	    obj.getMessage();
//	    obj.getTestStr();
		/*FileSystemXmlApplicationContext传进去的必须是完整的xml路径*/
//		ApplicationContext context=new FileSystemXmlApplicationContext("E:\\ztesoft\\myprogram\\HelloSpring\\bin\\Beans.xml");
//		HelloWorld obj=(HelloWorld) context.getBean("testid");
//		obj.getTestStr();
		
		/*Spring Bean 作用域*/
		
		//1、singleton 作用域
//		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
//		HelloWorld objA=(HelloWorld)context.getBean("testid1");
//		objA.setMyString("I am sunhaoyu ");
//		System.out.println(objA.getMyString());
		
		/*数据缓存在bean中，则打印数据是一样的*/
//		HelloWorld objB = (HelloWorld) context.getBean("testid1");
//		System.out.println(objB.getMyString());
		
		//2、prototype 作用域(数据不会缓存，设置的数据不会保存)
		
		/*Spring Bean生命周期*/
//		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
//		HelloWorld obj=(HelloWorld)context.getBean("testid");
//		obj.getMessage();
//		context.registerShutdownHook();
		
		/*Spring Bean后置处理器,bean初始化之前和之后调用*/
//		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
//		HelloWorld obj=(HelloWorld)context.getBean("testid");
//		obj.getMessage();
//		context.registerShutdownHook();
		
		/*Bean 定义继承*/
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
//		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
//		System.out.println(objA.getMessage1());
//		System.out.println(objA.getMessage2());
	    
	    HelloIndia objB = (HelloIndia)context.getBean("helloIndia");
	    System.out.println(objB.getMessage1());
	    System.out.println(objB.getMessage2());
	    System.out.println(objB.getMessage3());
		
		
	   }
}
