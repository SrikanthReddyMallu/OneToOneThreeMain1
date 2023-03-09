package com.students;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class OneToOneThreeMainClass 
{
public static void main(String[] args) 
{
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
	College college = (College) applicationContext.getBean("mycollege");
	
	System.out.println("College id is="+college.getId());
	System.out.println("College name is="+college.getName());
	System.out.println("College website is="+college.getWebsite());
	System.out.println("Branch id is="+college.getBranch().getId());
	System.out.println("Branch name is="+college.getBranch().getName());
	System.out.println("Branch location is="+college.getBranch().getLocation());
	System.out.println("Branch courses is="+college.getBranch().getCourse());
	System.out.println("Student id is="+college.getStudent().getId());
	System.out.println("Student name is="+college.getStudent().getName());
	System.out.println("Student age is="+college.getStudent().getAge());
	System.out.println("Student subject marks is="+college.getStudent().getSubjectMarks());
}
}
