package com.psja.MockitoJunitTest;

import java.util.Arrays;

import org.junit.runner.RunWith;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.when;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;
import org.springframework.boot.test.context.SpringBootTest;

import com.psja.MockitoJunitTest.service.PowerMockService;
import com.psja.MockitoJunitTest.service.PowerMockServiceDependency;

@RunWith(PowerMockRunner.class)
@SpringBootTest
public class PowerMockPrivateMethodTest {

	@InjectMocks
	private PowerMockService powerMockService;
	
	@Mock
	private PowerMockServiceDependency powerMockServiceDependency;
	
	@Test
	public void test() throws Exception {
		when( powerMockServiceDependency.getStaticValue() ).thenReturn(Arrays.asList(1,2,3));
		Double ret = Whitebox.invokeMethod( powerMockService, "checkPrivateMethod" );
		assertEquals( Double.valueOf( 6 ), ret );
	}
	
	
}
