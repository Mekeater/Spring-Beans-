package com.NoteConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 
public class MainApp {
	 public static void main(String[] args) {
		 
		 ApplicationContext context = new ClassPathXmlApplicationContext("noteBeans.xml");
		 //@Requiredע��
//		 Student student = (Student) context.getBean("student");
//		 System.out.println("Name : " + student.getName() );
//	     System.out.println("Age : " + student.getAge() );
		 
		 //@Autowiredע��
//		 TextEditor te = (TextEditor) context.getBean("textEditor");
//	     te.spellCheck();
		 
		 //@Qualifierע��
		 Profile profile = (Profile) context.getBean("profile");
	     profile.printAge();
	     profile.printName();
		 	
	 }
}
