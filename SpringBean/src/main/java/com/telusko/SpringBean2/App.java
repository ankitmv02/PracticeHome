package com.telusko.SpringBean2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext apc=new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	//Motorola m=apc.getBean(Motorola.class);	//If Single Bean then use this
//    	Motorola m=apc.getBean("bean1",Motorola.class);	
//    	System.out.println("Model:"+m.getModel());
//    	System.out.println("Ram:"+m.getRam());
//    	System.out.println("Memory:"+m.getMemory());
//    	System.out.println("Processor:"+m.getProcessor());
//    	System.out.println("Camera:"+m.getCamera());
    	
    	Samsung s=apc.getBean("bean2",Samsung.class);
    	System.out.println("Model:"+s.getModel());
    	System.out.println("Ram:"+s.getRam());
    	System.out.println("Memory:"+s.getMemory());
    	System.out.println("Processor:"+s.getProcessor());
    	System.out.println("Camera:"+s.getCamera());
    	
    }
}
