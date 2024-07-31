package com.devexample.Manager;

import com.devexample.Manager.bean.JavaCourse;
import com.devexample.Manager.bean.PythonCourse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.devexample.Manager.bean.CourseStatus;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*
       JavaCourse java=new JavaCourse();
       java.startLearn();
       PythonCourse python=new PythonCourse();
       python.startLearn();
       */
    	
      ApplicationContext context=new ClassPathXmlApplicationContext("./Resources/bean.xml");
      CourseStatus status=context.getBean(PythonCourse.class);  
      /*
       CourseStatus cs=new JavaCourse();
       cs.startLearn();
       cs.stopLearn();
       CourseStatus cs1 =new PythonCourse();
       cs1.startLearn();
       cs1.stopLearn();
       */
      status.startLearn();
      System.out.println("Done");
    }
}
