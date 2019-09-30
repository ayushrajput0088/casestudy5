package CaseStudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cs2 {
	WebDriver driver=null;		
	@Given("^home page is opened$")
	public void home_page_is_opened() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\B_D\\@files\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
	    
	}

	@When("^user enters details$")
	public void user_enters_details(String userName) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(userName);

		driver.findElement(By.name("password")).sendKeys("Password123");

	}

	@And("^user clicks on register button$")
	public void user_clicks_on_register_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	    
	}

	@Then("^user goes to homepage$")
	public void user_goes_to_homepage() throws Throwable {
		driver.findElement(By.xpath("/html/body/header/div/b/a")).click();
	    
	}


}
