package com.psja.MockitoJunitTest;

import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import static org.junit.Assert.*;

@SpringBootTest
public class SecondBeforeAfterTestCase {

	@BeforeAll
	public static void beforeAllTestCase() {
		System.out.println("Before all test case");
	}
	
	@BeforeEach
	public void beforeTestCase() {
		System.out.println("Before Test Case");
	}
	
	@Test
	public void firstTestCase() {
		System.out.println("In the first test case");
	}
	
	@Test
	public void secondTestCase() {
		System.out.println("In the second test case");
	}
	
	@AfterEach
	public void afterTestCase() {
		System.out.println("In the after test case");
	}
	
	@AfterAll
	public static void afterAllTestCase() {
		System.out.println("In after all test case");
	}
	
}
