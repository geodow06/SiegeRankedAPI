package com.qa.SiegeRankedAPI.ControllerTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@SuiteClasses({ OperatorControllerTest.class, RoundControllerTest.class, MatchControllerTest.class,
		MapControllerTest.class })
public class ControllerSuiteTest {

}
