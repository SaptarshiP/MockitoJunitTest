package com.psja.MockitoJunitTest;

import org.springframework.boot.test.context.SpringBootTest;

import com.psja.MockitoJunitTest.service.FirstTestingService;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

@SpringBootTest
public class FirstTestingServiceTestCase {

	FirstTestingService firstTestingService = new FirstTestingService();
	
	
	/*assertEquals is used to check the expected data and origial data is equal or not*/
	@Test
	public void firstTestCase() {
		
		assertEquals("CD",firstTestingService.return1("AACD"));
	}
	
	//to check the value return from the invoked method is true or not we use asserTrue
	//ABCDAB=>true
	@Test
	public void secondTestCasePositiveTestCaseForSameFrontAndLastCharacter() {
		
		assertTrue( firstTestingService.checkFirstTwoCharacterAndLastTwoCharacter("ABCDAB") );
		
	}
	
	//to check the value return from the invoked method is false or not we use asserFalse
	@Test
	public void thirdTestCaseNegativeTestCaseForSameFrontAndLastCharacter() {
		
		assertFalse( firstTestingService.checkFirstTwoCharacterAndLastTwoCharacter("ABCD") );
	}
	
	
	
	
}
