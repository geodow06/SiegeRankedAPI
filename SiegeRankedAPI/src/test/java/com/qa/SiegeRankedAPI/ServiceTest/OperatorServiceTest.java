package com.qa.SiegeRankedAPI.ServiceTest;

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

import com.qa.SiegeRankedAPI.Entities.Operator;
import com.qa.SiegeRankedAPI.Repository.OperatorRepository;
import com.qa.SiegeRankedAPI.Service.OperatorService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OperatorServiceTest {

	private static final Operator OP = new Operator();
	private static final List<Operator> OPLIST = new ArrayList<>();

	@InjectMocks
	private OperatorService svc;

	@Mock
	private OperatorRepository repo;

	@Test
	public void createOperatorTest() {
		//Mockito.when(repo.existsById(1L)).thenReturn(true); 
		assertEquals(false,svc.createOperator(OP));
	}

	@Test
	public void getOperatorTest() {
		Mockito.when(repo.findByName("name")).thenReturn(OP);
		assertEquals(OP, svc.getOperator("name"));
	}

	@Test
	public void getAllOperatorsTest() {
		Mockito.when(repo.findAll()).thenReturn(OPLIST);
		assertEquals(OPLIST, svc.getAllOperators());
	}

	@Test
	public void updateKDTest() {

	}

	@Test
	public void addKillTest() {

	}

	@Test
	public void addDeathTest() {

	}

	@Test
	public void addRoundTest() {
//		assertEquals(OP,svc.addRound("name"));
	}

	@Test
	public void deleteOperatorTest() {
		Mockito.when(repo.existsByName(" ")).thenReturn(true);
		assertEquals(true, svc.deleteOperator(" "));
	}
}
