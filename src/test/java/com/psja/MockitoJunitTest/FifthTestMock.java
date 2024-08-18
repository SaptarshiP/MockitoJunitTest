package com.psja.MockitoJunitTest;

import org.springframework.boot.test.context.SpringBootTest;

import com.psja.MockitoJunitTest.service.SecondTestingStub;
import com.psja.MockitoJunitTest.service.StubTestInterface;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

@SpringBootTest
public class FifthTestMock {

	@Test
	public void testMock() {
		StubTestInterface mockTestInterface = mock( StubTestInterface.class );
		when( mockTestInterface.getData() ).thenReturn( Arrays.asList("TEST1 PSJA", "TEST2 PSJA", "HELLO PSJA") );
		SecondTestingStub secondTestingStub = new SecondTestingStub(mockTestInterface);
		List<String> retList = secondTestingStub.operational("HELLO");
		assertEquals( 1, retList.size() );
	}
	
	@Test
	public void testMock2() {
		StubTestInterface mockTestInterface2 = mock( StubTestInterface.class );
		when( mockTestInterface2.getData() ).thenReturn( Arrays.asList("TEST1 PSJA", "TEST2 PSJA", "HELLO PSJA") );
		SecondTestingStub secondTestingStub = new SecondTestingStub(mockTestInterface2);
		List<String> retList = secondTestingStub.operational("PSJA");
		String[] expectedData = {"TEST1 PSJA", "TEST2 PSJA", "HELLO PSJA2"};
		assertArrayEquals( expectedData, retList.toArray() );
	}
}
