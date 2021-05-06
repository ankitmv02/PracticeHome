package com.telusko.SpringBean2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig 
{
	@Bean
	public Motorola bean1() 		//Here bean1 is the Bean name
	{
		Motorola mo=new Motorola();
		mo.setModel("Moto 5G");
		mo.setRam("8Gb");
		mo.setProcessor("Snapdragon 750");
		mo.setCamera("64MP");
		mo.setMemory("128Gb");
		return mo;
	}
	
	@Bean
	public Samsung bean2()
	{
		Samsung sa=new Samsung();
		sa.setModel("M31");
		sa.setCamera("48MP");
		sa.setMemory("128Gb");
		sa.setProcessor("Snapdragon 732");
		sa.setRam("8Gb");
		return sa;
	}
}
