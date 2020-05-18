package com.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src\\test\\resources"},dryRun = false,glue= {"com.step_def"},
tags= {"@smoke"}
,plugin = {"json:C:\\Users\\ravis\\eclipse-workspace\\May_18\\Report\\abc.json","html:C:\\Users\\ravis\\eclipse-workspace\\May_18\\Report"})

public class runner1 extends AbstractTestNGCucumberTests {
@DataProvider
public Object[][] Scenarios()
{
	return super.scenarios();
	
}

}