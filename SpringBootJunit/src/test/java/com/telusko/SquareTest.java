package com.telusko;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void test() {
		Testing t=new Testing();
		int output=t.square(5);
		assertEquals(25, output);
	}

}
