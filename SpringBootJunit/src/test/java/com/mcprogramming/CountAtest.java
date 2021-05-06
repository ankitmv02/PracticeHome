package com.mcprogramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountAtest {

	@Test
	void test() {
		JunitTesting test=new JunitTesting();
		int output=test.count("WalliwAar");
		assertEquals(3, output);
	}

}
