package com.qa.SiegeRankedAPI.EntitiesTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.SiegeRankedAPI.Entities.Match;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MatchTest {

	private static final Match MATCH = new Match(null, false);
	private static final int INT = 1;
	private static final String STRING = new String();

	@Test
	public void getIdTest() {
		assertEquals(STRING, MATCH.getMatchId());
	}
}
