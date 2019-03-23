package com.qa.SiegeRankedAPI;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.SiegeRankedAPI.ControllerTest.ControllerSuiteTest;
import com.qa.SiegeRankedAPI.EntitiesTest.EntitiesSuiteTest;
import com.qa.SiegeRankedAPI.ServiceTest.ServiceSuiteTest;

@RunWith(SpringRunner.class)
@SpringBootTest
@SuiteClasses({ ServiceSuiteTest.class, EntitiesSuiteTest.class, ControllerSuiteTest.class })
public class SiegeRankedApiApplicationTests {

}
