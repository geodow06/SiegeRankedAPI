package com.qa.SiegeRankedAPI.EntitiesTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.SiegeRankedAPI.Entities.Round;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RoundTest {

	private static final Round RND = new Round(null, null, 0, 0, false);
	private static final int INT = 1;
	private static final String STRING = new String();

	@Test
	public void getIdTest() {
		assertEquals(STRING, RND.getRoundId()); 
		
	} 
	
	

}
