package com.psja.MockitoJunitTest.service;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import com.psja.MockitoJunitTest.util.UtilityClass;

public class PowerMockService {

	public PowerMockServiceDependency powerMockServiceDependency;
	
	public PowerMockService( PowerMockServiceDependency powerMockServiceDependency ) {
		this.powerMockServiceDependency = powerMockServiceDependency;
	}
	
	public Integer getSize() {
		ArrayList<Integer> list = new ArrayList<>();
		return list.size();
	}
	
	private Double checkPrivateMethod() {
		List<Integer> arrList = this.powerMockServiceDependency.getStaticValue();
		Integer sum = 0;
		for ( Integer data: arrList ) {
			sum = sum + data;
		}
		return sum.doubleValue();
	}
	
	public Long checkStaticMethod() {
		List<Integer> arrList = powerMockServiceDependency.getStaticValue();
		Integer sum = 0;
		for ( Integer data: arrList )
			sum = sum + data;
		return UtilityClass.testIt( sum );
	}
	
}
