package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="/home/thato/Documents/SpringMVCprojects/freeCrmBddFramework1/src/main/java/Feature"
,glue= {"stepDefination"}
,format = {"pretty","html:test-output","json:json-output/cucumber.json","junit:junit_xml/cucumber.xml"}
,monochrome=true
,strict=true
,dryRun=true
)

public class TestRunner {

}
