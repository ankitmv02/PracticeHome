package com.telusko.SpringBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.telusko.SpringBean2.Samsung;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext apc=new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	//Motorola m=apc.getBean(Motorola.class);	//If Single Bean then use this
    	Motorola m=apc.getBean("bean1",Motorola.class);	
    	System.out.println("Model:"+m.getModel());
    	System.out.println("Ram:"+m.getRam());
    	System.out.println("Memory:"+m.getMemory());
    	System.out.println("Processor:"+m.getProcessor());
    	System.out.println("Camera:"+m.getCamera());
    	
    }
}
