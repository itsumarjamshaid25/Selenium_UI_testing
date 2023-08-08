package StepsDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/vertexSpecial.feature",glue= {"StepsDefinitions"} ,monochrome=true,
plugin={"pretty","html:target/HtmlReports"},
tags="@file_uploading_by_robot_class"
		)


//@CucumberOptions(features="src/test/resources/Features/Spectrum.feature",glue= {"StepsDefinitions"} ,monochrome=true,
//		plugin={"pretty","html:target/HtmlReports"},
//		tags=" @iframe"
//)


public class TestRunner {
	

}
