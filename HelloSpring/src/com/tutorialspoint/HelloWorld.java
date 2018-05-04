package com.tutorialspoint;

import java.security.PublicKey;

public class HelloWorld {
	   private String message;
	   public void setMessage(String msg){
	      this.message  = msg;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	   
	   //编写Spring Bean的生命周期提示方法
	   public  void init() {
		   //初始化回调方法(Bean中定义init-method参数)
		   System.out.println("Bean is going through init.");
	}
	   public void destroy() {
		   //销毁回调方法(Bean中定义destroy-method参数)
		   System.out.println("Bean will destroy now.");
	}
	   
	   private String myString;
	   public String getMyString() {
		   return myString;
	   }
	   public void setMyString(String myString) {
		   this.myString = myString;
	   }
	   
	   //继承实例
	   private String message1;
	   private String message2;
	public String getMessage1() {
		return message1;
	}
	public String getMessage2() {
		return message2;
	}
	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	   
	   
}
