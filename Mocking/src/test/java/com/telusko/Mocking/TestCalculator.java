package com.telusko.Mocking;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import junit.framework.TestCase;

public class TestCalculator extends TestCase {
	
	
	CalculatorService cs= Mockito.mock(CalculatorService.class);
	Calculator c=new Calculator(cs);
	
	@Test
	public void testPerform() {
		
		when(cs.add(2, 3)).thenReturn(5); 		//imp line given by mockito
		assertEquals(10,c.perform(2, 3));
		verify(cs).add(2, 3);				//It is used to verify ..service method is called or not
	}
}
