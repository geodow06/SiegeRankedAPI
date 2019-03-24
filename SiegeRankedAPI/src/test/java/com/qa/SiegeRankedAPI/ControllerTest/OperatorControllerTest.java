package com.qa.SiegeRankedAPI.ControllerTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.SiegeRankedAPI.Controller.OperatorController;
import com.qa.SiegeRankedAPI.Entities.Operator;
import com.qa.SiegeRankedAPI.Service.OperatorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OperatorControllerTest {

	private static final Operator OP = new Operator();
	private static final List<Operator> OPLIST = new ArrayList<>();
	private static final String STRING = new String();

	@InjectMocks
	private OperatorController con;

	@Mock
	private OperatorService svc;

	@Test
	public void createOperatorTest() {
		Mockito.when(svc.createOperator(OP)).thenReturn(true);
		assertEquals(true, con.createOperator(OP));
	}

	@Test
	public void getOperatorTest() {
		Mockito.when(svc.getOperator("")).thenReturn(OP);
		assertEquals(OP, con.getOperator(""));
	}

	@Test
	public void getAllOperatorsTest() {
		Mockito.when(svc.getAllOperators()).thenReturn(OPLIST);
		assertEquals(OPLIST, con.getAllOperators());
	}

//	@Test
//	public void updateKDTest() {
//		Mockito.when(svc.updateKD(STRING)).thenReturn(STRING);
//		assertEquals(OPLIST, con.updateKD(STRING));
//	}
//
//	@Test
//	public void addKillTest() {
//		Mockito.when(svc.addKill(STRING)).thenReturn(OP);
//		assertEquals(OP, con.addKill(STRING));
//	}
//
//	@Test
//	public void addDeathTest() {
//		Mockito.when(svc.addDeath(STRING)).thenReturn(OP);
//		assertEquals(OP, con.addDeath(STRING));
//	}

//	@Test
//	public void addRoundTest() {
//		Mockito.when(svc.addRound(STRING)).thenReturn(OP);
//		assertEquals(OP, con.addRound(STRING));
//	}

	@Test
	public void delateOperatorTest() {
		Mockito.when(svc.deleteOperator(STRING)).thenReturn(true);
		assertEquals(true, con.deleteOperator(STRING));
	}

}
