package com.psja.MockitoJunitTest;

import java.util.List;
import java.util.Arrays;

import com.psja.MockitoJunitTest.service.StubTestInterface;


/*
 * It is a stub implementation of the test case 
 * where we have to create the whole process
 * */
public class StubTestImpl implements StubTestInterface{

	@Override
	public List<String> getData(){
		return Arrays.asList("TEST1 PSJA", "TEST2 PSJA", "HELLO WORLD");
	}

	@Override
	public void deleteData(String str) {
		// TODO Auto-generated method stub
		
	}
	
}
