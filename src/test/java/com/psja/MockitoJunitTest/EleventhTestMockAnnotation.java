package com.psja.MockitoJunitTest;

import java.util.Arrays;

import org.junit.runner.RunWith;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.psja.MockitoJunitTest.service.SecondTestingStub;
import com.psja.MockitoJunitTest.service.StubTestInterface;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class EleventhTestMockAnnotation {
		
	@Mock
	public StubTestInterface stubTestInterface;
	
	@InjectMocks
	public SecondTestingStub secondTestingStub;
	
	@Captor
	public ArgumentCaptor<String> argumentCaptor; 
	
	@Test
	public void testWithRunWith() {
		//when
		when( stubTestInterface.getData() ).thenReturn(Arrays.asList("Hello PSJA", "Hello World"));
		secondTestingStub.operational("PSJA");
		//then 
		then( stubTestInterface ).should().deleteData("Hello PSJA");
	}
	
	@Test
	public void testWithRunCaptor() {
		
		//when
		when( stubTestInterface.getData() ).thenReturn( Arrays.asList("Hello PSJA", "Hello World") );
		secondTestingStub.operational("PSJA");
		//then
		then( stubTestInterface ).should().deleteData( argumentCaptor.capture() );
		String[] st = {"Hello PSJA"};
		assertArrayEquals(argumentCaptor.getAllValues().toArray(), st );
	}
	
}
