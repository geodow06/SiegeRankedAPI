package com.qa.SiegeRankedAPI.EntitiesTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.SiegeRankedAPI.Entities.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MapTest {

	private static final Map MAP = new Map(null, null, 0, 0, 0);
	private static final int INT = 1;
	private static final String STRING = new String();
	private static final Long LONG = 1L;

	@Test
	public void getMapIdTest() {
		assertEquals(LONG, MAP.getMapId());
	}

	@Test
	public void getNameTest() {
		assertEquals(STRING, MAP.getName());
	}
}
