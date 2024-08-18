package com.psja.MockitoJunitTest.service;

import java.util.Arrays;
import java.util.List;

public class PowerMockServiceDependency {

	public List<Integer> getStaticValue(){
		return Arrays.asList(1,1,1);
	}
	
}
