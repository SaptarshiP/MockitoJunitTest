package com.psja.MockitoJunitTest;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.spy;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TwelveTestSpy {

	@Test
	public void testArrayListSpy() {
		List<String> spyArrayList = spy( ArrayList.class );
		spyArrayList.add("Hello PSJA");
		assertEquals( 1, spyArrayList.size() );
	}
	
	@Test
	public void testArrayListSpyStub() {
		List<String> spyArrayList = spy( ArrayList.class );
		given( spyArrayList.size() ).willReturn(5);
	}
}
