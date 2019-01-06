package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="/home/thato/Documents/SpringMVCprojects/freeCrmBddFramework/src/main/java/Feature"
					,glue= {"stepDefination"}
					,format = {"pretty","html:test-output"}
					,dryRun=true
					,monochrome=true
					)


public class TestRunner 
{
/*  public static void main(String [ ] args) {
		// TODO Auto-generated method stub
		WebDriver driver; 
		System.setProperty("webdriver.chrome.driver","/home/thato/Documents/Selenium_cucumber/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/");
	}
*/
}
