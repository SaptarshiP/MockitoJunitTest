package com.psja.MockitoJunitTest;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;

import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.psja.MockitoJunitTest.service.PowerMockService;
import com.psja.MockitoJunitTest.service.PowerMockServiceDependency;
import com.psja.MockitoJunitTest.util.UtilityClass;

@RunWith(PowerMockRunner.class)
@SpringBootTest
@PrepareForTest( UtilityClass.class )
public class PowerMockStaticMethod {

	//when we have to use mockito and power mock we have to use specific runner
	
	
	@Mock
	public PowerMockServiceDependency powerMockServiceDependency;
	@InjectMocks
	public PowerMockService powerMockService;
	
	@Test
	public void testStaticMethod() {
		when( powerMockServiceDependency.getStaticValue() ).thenReturn( Arrays.asList(1,2,3) );
		PowerMockito.mockStatic(UtilityClass.class);
		when( UtilityClass.testIt(6) ).thenReturn(Long.valueOf( 6 ));
		powerMockService.checkStaticMethod();
	}
}
