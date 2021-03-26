package com.xworkz.cosmetic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		String springXml="cosmetic.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(springXml);
		Cosmetic cosmetic = applicationContext.getBean(Cosmetic.class);
		cosmetic.makesFacePresentable();
		cosmetic.enhanceTheBeauty();
		System.out.println(cosmetic.getBrand());
	  System.out.println(cosmetic.getPrice());
	  System.out.println("----------------------------------------------------------------");
	  Integer integer=applicationContext.getBean(Integer.class);
	  System.out.println(integer);
	  String string =applicationContext.getBean(String.class);
	  System.out.println(string);
	   Float objFloat = applicationContext.getBean(Float.class);
	   System.out.println(objFloat);
	   Double objDouble = applicationContext.getBean(Double.class);
	   System.out.println(objDouble);
	   Boolean objBoolean = applicationContext.getBean(Boolean.class);
	   System.out.println(objBoolean);
	   Long objLong = applicationContext.getBean(Long.class);
	   System.out.println(objLong);
	   Byte objByte = applicationContext.getBean(Byte.class);
	   System.out.println(objByte);
	   Short objShort = applicationContext.getBean(Short.class);
	   System.out.println(objShort);
	  
	  
	  
	  
	   
	  

	}

}
