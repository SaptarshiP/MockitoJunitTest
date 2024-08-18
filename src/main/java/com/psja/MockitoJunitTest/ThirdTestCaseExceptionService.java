package com.psja.MockitoJunitTest;

public class ThirdTestCaseExceptionService {

	
	public void throwsCustomExceptionThird() {
		throw new CustomExceptionThird(new Exception("Custom Third Exception"));
	}
}
