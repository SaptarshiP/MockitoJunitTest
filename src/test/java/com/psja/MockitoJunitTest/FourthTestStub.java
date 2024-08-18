package com.psja.MockitoJunitTest;

import java.util.List;
import static org.junit.Assert.assertEquals;

import org.springframework.boot.test.context.SpringBootTest;

import com.psja.MockitoJunitTest.service.SecondTestingStub;
import com.psja.MockitoJunitTest.service.StubTestInterface;

import org.junit.jupiter.api.Test;

@SpringBootTest
public class FourthTestStub {

	@Test
	public void testIt() {
		StubTestInterface stInterface = new StubTestImpl();
		SecondTestingStub secondTestingStub = new SecondTestingStub(stInterface);
		List<String> returnList = secondTestingStub.operational("PSJA");
		assertEquals(3, returnList.size());
	}
	
}
