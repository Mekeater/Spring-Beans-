package com.tutorialspoint;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
	public static void main(String[] args) {
		
		/*Spring BeanFactory����*/
/*		XmlBeanFactory factory =new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		HelloWorld obj=(HelloWorld)factory.getBean("testid");
		obj.getMessage();*/
		
		/*Spring ApplicationContext����*/
		/*ClassPathXmlApplicationContext������Ե�xml·������*/
//	    ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//	    HelloWorld obj = (HelloWorld) context.getBean("testid");
//	    obj.getMessage();
//	    obj.getTestStr();
		/*FileSystemXmlApplicationContext����ȥ�ı�����������xml·��*/
//		ApplicationContext context=new FileSystemXmlApplicationContext("E:\\ztesoft\\myprogram\\HelloSpring\\bin\\Beans.xml");
//		HelloWorld obj=(HelloWorld) context.getBean("testid");
//		obj.getTestStr();
		
		/*Spring Bean ������*/
		
		//1��singleton ������
//		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
//		HelloWorld objA=(HelloWorld)context.getBean("testid1");
//		objA.setMyString("I am sunhaoyu ");
//		System.out.println(objA.getMyString());
		
		/*���ݻ�����bean�У����ӡ������һ����*/
//		HelloWorld objB = (HelloWorld) context.getBean("testid1");
//		System.out.println(objB.getMyString());
		
		//2��prototype ������(���ݲ��Ỻ�棬���õ����ݲ��ᱣ��)
		
		/*Spring Bean��������*/
//		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
//		HelloWorld obj=(HelloWorld)context.getBean("testid");
//		obj.getMessage();
//		context.registerShutdownHook();
		
		/*Spring Bean���ô�����,bean��ʼ��֮ǰ��֮�����*/
//		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
//		HelloWorld obj=(HelloWorld)context.getBean("testid");
//		obj.getMessage();
//		context.registerShutdownHook();
		
		/*Bean ����̳�*/
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
