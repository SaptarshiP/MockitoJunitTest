package com.psja.MockitoJunitTest.service;

import java.util.List;
import java.util.ArrayList;

public class SecondTestingStub {

	public StubTestInterface stubTestInterface;
	
	public SecondTestingStub( StubTestInterface stubTestInterface ) {
		this.stubTestInterface = stubTestInterface;
	}
	
	public List<String> operational( String str ) {
		
		List<String> dataList = this.stubTestInterface.getData();
		List<String> returnList = new ArrayList<>();
		for ( String data:dataList ) {
			if ( data.contains(str) ) {
				returnList.add(data);
				this.stubTestInterface.deleteData( data );
			}
		}
		return returnList;
	}
}
