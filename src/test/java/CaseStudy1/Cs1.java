package CaseStudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cs1 {
	WebDriver driver=null;	
	@Given("^Home page is opened$")
	public void home_page_is_opened() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\B_D\\@files\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignUp")).click();
	    
	}

	@When("^User Enters details$")
	public void user_Enters_details() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("ayush123456789");
		driver.findElement(By.name("firstName")).sendKeys("Ayush");
		driver.findElement(By.name("lastName")).sendKeys("rajput");
		driver.findElement(By.name("password")).sendKeys("pass12345");
		driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys("pass12345");
		driver.findElement(By.xpath("//input[@type='radio'][@value='Male']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("a@gmail.com");
		driver.findElement(By.name("mobileNumber")).sendKeys("9876543210");
		driver.findElement(By.name("dob")).sendKeys("05/08/1997");
		driver.findElement(By.name("address")).sendKeys("Bangalore");
		Select pc=new Select(driver.findElement(By.name("securityQuestion")));
		pc.selectByIndex(2);
		driver.findElement(By.name("answer")).sendKeys("blue");   
	}

	@And("^User clicks on Register button$")
	public void user_clicks_on_Register_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	    
	}
	@Then("^User goes to homepage$")
	public void user_goes_to_homepage() throws Throwable {
		driver.findElement(By.xpath("/html/body/header/div/b/a")).click();	 
	}
}