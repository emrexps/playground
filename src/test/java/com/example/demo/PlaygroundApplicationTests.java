package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PlaygroundApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void simpleTest(){
	String context="Hello";
	assertEquals(context, "Hello");
	}
}
