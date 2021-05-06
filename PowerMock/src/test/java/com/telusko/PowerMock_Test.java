package com.telusko;

import static org.junit.jupiter.api.Assertions.*;
import org.aspectj.apache.bcel.classfile.Utility;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static junit.framework.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Utility.class)
class PowerMock_Test {

	@Test
	public void TestStaticMethod_WithPowerMockito() {
		
		String call= "Hey There I am using PowerMockito with Mockito";
		String callexpectation="Call Expectation for You";
		
		PowerMockito.mockStatic(Utility.class);
		/* PowerMockito.when(Utility.staticMethod(call)).thenReturn(callexpectation); */
		
	}
}
