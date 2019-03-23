package com.qa.SiegeRankedAPI.EntitiesTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.SiegeRankedAPI.Entities.Operator;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OperatorTest {

	private static final Operator OP = new Operator("name", "ctu");
	private static final int INT = 1;
	private static final String STRING = new String();

	@Test
	public void getNameTest() {
		assertEquals("name", OP.getName());
	}

	@Test
	public void setNameTest() {
		Operator op = new Operator();
		op.setName(STRING);
		assertEquals(STRING, op.getName());
	}

	@Test
	public void getCTUTest() {
		assertEquals("ctu", OP.getCTU());
	}

	@Test
	public void setCTUTest() {
		Operator op = new Operator();
		op.setCTU(STRING);
		assertEquals(STRING, op.getCTU());
	}

	@Test
	public void getKillsTest() {
		assertEquals(1, OP.getKills());
	}

	@Test
	public void setKillsTest() {
		Operator op = new Operator();
		op.setKills(INT);
		assertEquals(INT, op.getKills());
	}

	@Test
	public void getDeathsTest() {
		assertEquals(1, OP.getDeaths());
	}

	@Test
	public void setDeathsTest() {
		Operator op = new Operator();
		op.setDeaths(INT);
		assertEquals(INT, op.getDeaths());
	}

	@Test
	public void getKDTest() {
		assertEquals(1, OP.getKd());
	}

	@Test
	public void setKDTest() {
		Operator op = new Operator();
		op.setKd(INT);
		assertEquals(INT, op.getKd());
	}

	@Test
	public void getRoundsTest() {
		assertEquals(1, OP.getRounds());
	}

	@Test
	public void setRoundsTest() {
		Operator op = new Operator();
		op.setRounds(INT);
		assertEquals(INT, op.getRounds());
	}
}
