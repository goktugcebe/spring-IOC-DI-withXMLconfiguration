package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        //1. load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        //2. retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        //check if they are the same
        boolean result= (theCoach==alphaCoach);

        //printout the results
        System.out.println("\nPointing to the same object: " + result);

        System.out.println("\nMemory location for the Coach: "+ theCoach);

        System.out.println("\nMemory location for the alphaCoach: "+ alphaCoach);

        //close the context
        context.close();
    }
}
