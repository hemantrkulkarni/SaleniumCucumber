package StepDefinition;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;



import cucumber.api.java.en.Given;

public class StepDefinition {
	
	@Given("^Open the IE and launch the application$")
	 public void user_already_on_login_page(){
//	 System.setProperty("webdriver.chrome.driver","/Users/naveenkhunteta/Downloads/chromedriver");
//	 ChromeDriver driver = new ChromeDriver();
//	 driver.get("https://www.freecrm.com/index.html");
		System.out.print("done");
	 }
	

	
	@Given("^step2$")
	 public void test2(){
		System.out.print("test2 done");
	 }
	
	
	
	@Given("^test3$")
	 public void test3(){
		System.out.print("test3 done");
	 }

}
