package com.psja.MockitoJunitTest;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.psja.MockitoJunitTest.service.PowerMockService;

@RunWith( PowerMockRunner.class )
@PrepareForTest( PowerMockService.class )
@SpringBootTest
public class PowerMockInvokingConstructor {

	//PrepareForTest--->PowerMockService.class(it will be the class which contain method which is invoking new ArrayList)
	//
	
	@InjectMocks
	public PowerMockService powerMockService;
	@Mock
	public ArrayList<Integer> mockArrList;
	
	@Test
	public void testConstructorInvokation() throws Exception {
		
		when( mockArrList.size() ).thenReturn(10);
		PowerMockito.whenNew(ArrayList.class).withAnyArguments().thenReturn(mockArrList);
		Integer ret = powerMockService.getSize();
		assertThat(0, is(ret));
	}
	
}
