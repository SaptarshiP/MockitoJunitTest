package com.psja.MockitoJunitTest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Test;

@SpringBootTest
public class SixthTestingListMocking {

	@Test
	public void testFirst() {
		 List list = mock(List.class);
		 when(list.get(0)).thenReturn("Test PSJA");
		 assertThat( list.get(0), is("Test PSJA") );
	}
	
	@Test
	public void listAnyTest() {
		List list = mock(List.class);
		when( list.get(anyInt()) ).thenReturn("TEST PSJA ANY");
		assertThat( list.get(0), is("TEST PSJA ANY") );
		assertThat( list.get(2), is("TEST PSJA ANY") );
	}
	
	@Test
	public void checkNullValue() {
		List list = mock(List.class);
		when( list.get(0) ).thenReturn( "TEST PSJA NULL CHECK" );
		assertThat( list.get(0), is("TEST PSJA NULL CHECK") );
		assertEquals(null, list.get(1) );
	}
}
