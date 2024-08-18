package com.psja.MockitoJunitTest;

import java.util.Arrays;

import org.springframework.boot.test.context.SpringBootTest;

import com.psja.MockitoJunitTest.service.SecondTestingStub;
import com.psja.MockitoJunitTest.service.StubTestInterface;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

@SpringBootTest
public class NineParameterTest {

	//Declare Argument Captor
	//Define Argument captor on specific method call
	//Capture the argument
	
	@Test
	public void testParameterCheck() {
		//given
		//ArgumentCaptor is created to capture a string argument
		ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class); 
		StubTestInterface stubTestInterface = mock(StubTestInterface.class);
		
		//when
		when( stubTestInterface.getData() ).thenReturn(Arrays.asList("Hello PSJA","Hello World"));
		SecondTestingStub secondTestingStub = new SecondTestingStub(stubTestInterface);
		secondTestingStub.operational("PSJA");
		//then
		//The capturing process is started
		then( stubTestInterface ).should().deleteData( argumentCaptor.capture() );
		//The data from capture process is check
		assertThat( argumentCaptor.getAllValues().size(), is(2) );
		
	}
}
