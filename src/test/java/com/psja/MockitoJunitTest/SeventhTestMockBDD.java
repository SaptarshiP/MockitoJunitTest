package com.psja.MockitoJunitTest;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.test.context.SpringBootTest;

import com.psja.MockitoJunitTest.service.SecondTestingStub;
import com.psja.MockitoJunitTest.service.StubTestInterface;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

@SpringBootTest
public class SeventhTestMockBDD {

	/*
	 * BDD works with given when then design pattern
	 * */
	@Test
	public void testBDD() {
		
		//given
		StubTestInterface stubTestInterface = mock( StubTestInterface.class );
		given(stubTestInterface.getData()).willReturn( Arrays.asList("HELLO PSJA", "HELLO PSJ2") );
		SecondTestingStub secondTestingStub = new SecondTestingStub( stubTestInterface );
		//when
		List<String> dataList = secondTestingStub.operational("PSJA");
		//then
		assertThat( dataList.size(), is(1) );
	}
	
}
