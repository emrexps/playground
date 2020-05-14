package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@SpringBootTest
class PlaygroundApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
    public void testMethod() {
			String context="Hello";
			assertEquals(context, "Hello");
	   
    }

	@Test
	void simpleTest(){
	String context="Hello";
	assertEquals(context, "Hello");
	}
}
