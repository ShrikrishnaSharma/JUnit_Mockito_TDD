package com.tm.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({
	TestCalculation.class,
	TestMessages.class
})
public class TestMultipleClasses {

}
