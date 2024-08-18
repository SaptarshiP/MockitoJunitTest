package com.psja.MockitoJunitTest;

import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TenthHamcrestMatchers {

	@Test
	public void test() {
		
		List<String> dataList = Arrays.asList("Test", "PSJA");
		assertThat( dataList, hasSize(1) );
	}
	
}
