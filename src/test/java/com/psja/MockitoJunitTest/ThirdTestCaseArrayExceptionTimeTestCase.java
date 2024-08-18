package com.psja.MockitoJunitTest;

import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertArrayEquals;

@SpringBootTest
public class ThirdTestCaseArrayExceptionTimeTestCase {

	@Test
	public void testCaseArrayCompare() {
		int[] arr1 = {10, 1, 2, 4, 3};
		int[] arr2 = {2, 3, 10, 4, 1};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		assertArrayEquals(arr1, arr2);
	}

	//To check the exception is meet or not we need to do the expected in test
//	@Test(expected=NullPointerException.class)
//	public void testCaseException() {
//		ThirdTestCaseExceptionService thirdTestCaseExceptionService = new ThirdTestCaseExceptionService();
//		thirdTestCaseExceptionService.throwsCustomExceptionThird();
//	}
	
	@Test
	public void testTime() {
		
	}
}
