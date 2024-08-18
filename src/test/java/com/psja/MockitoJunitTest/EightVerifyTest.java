package com.psja.MockitoJunitTest;

import java.util.Arrays;

import org.springframework.boot.test.context.SpringBootTest;

import com.psja.MockitoJunitTest.service.SecondTestingStub;
import com.psja.MockitoJunitTest.service.StubTestInterface;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

@SpringBootTest
public class EightVerifyTest {

	@Test
	public void testingVerify() {
		//given
		StubTestInterface stubTestInterface = mock(StubTestInterface.class);
		given( stubTestInterface.getData() ).willReturn(Arrays.asList("Hello PSJA", "Hello World"));
		SecondTestingStub secondTestingStub = new SecondTestingStub(stubTestInterface);
		//when
		secondTestingStub.operational("PSJA");
		//then
		verify( stubTestInterface ).deleteData("Hello PSJA");
	}
	
	
	/*
	 * In the below test case verify is called to check that the method is called or not
	 * never() method tells that the method will not be called with this data
	 * */
	@Test
	public void testingVerifyShould() {
		
		//given
		StubTestInterface stubTestInterface = mock( StubTestInterface.class );
		given( stubTestInterface.getData() ).willReturn(Arrays.asList("Hello PSJA", "Hello World"));
		SecondTestingStub secondTestingStub = new SecondTestingStub(stubTestInterface);
		//when
		secondTestingStub.operational("PSJA");
		//then
		verify( stubTestInterface, never() ).deleteData("Hello PSJA");
	}
	
	
}
