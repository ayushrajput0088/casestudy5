package CaseStudy4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cs4 {
	WebDriver driver=null;
	@Given("^USer register to TestMeApp$")
	public void user_register_to_TestMeApp() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\B_D\\@files\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();

	    
	}

	@When("^User for a product like headpjone$")
	public void user_for_a_product_like_headpjone() throws Throwable {
		WebElement search=driver.findElement(By.name("products"));
		Actions act1=new Actions(driver);
		act1.sendKeys(search,"head").perform();
		Thread.sleep(5000);
		act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    
	}

	@When("^Try to proceed to payment w/o adding item in cart$")
	public void try_to_proceed_to_payment_w_o_adding_item_in_cart() throws Throwable {
		try
		{
			driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a"));
		}
		catch(Exception e)
		{
			System.out.println("noitem found in cart");
		}
	   
	}

	@Then("^deosnt displays item in cart$")
	public void deosnt_displays_item_in_cart() throws Throwable {
	    driver.close();
	}
	

}
