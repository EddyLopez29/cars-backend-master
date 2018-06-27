package com.dev.AdminCar.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;


@Test(groups = "db")
@ContextConfiguration(locations= {"classpath:context.xml"})
@TestExecutionListeners({
    DependencyInjectionTestExecutionListener.class,
    DbUnitTestExecutionListener.class
})
public class carRepositoryTest extends AbstractTransactionalTestNGSpringContextTests{

	@Autowired(required =  true)
	private CarRepository carRepository;
	
	private static final String dbUnit = "classpath:cars.xml";
	
	@Test
	@DatabaseSetup(dbUnit)
	public void test() {
		assertThat("hola").isEqualTo("hola");
	
	}

}
