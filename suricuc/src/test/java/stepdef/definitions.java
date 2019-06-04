package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.*;

public class definitions {
	WebDriver driver;
	@Given("signin page")
	public void signin_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\selenium folder\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.partialLinkText("SignIn")).click();
	}

	@When("username is given as {string}")
	public void username_is_given_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("userName")).sendKeys(string);
	}

	@When("password is given as {string}")
	public void password_is_given_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("password")).sendKeys(string);
		
	}

	@Then("login")
	public void login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("Login")).click();
	}
	@Given("search headphones")
	public void search_headphones() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		signin_page();
		username_is_given_as("lalitha");
		password_is_given_as("Password123");
		login();
		
		driver.findElement(By .id("myInput")).sendKeys("Headphone");
		Actions a =new Actions(driver);
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	@When("payment")
	public void payment() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("User moves to cart without adding item to the cart");
	}

	@Then("testme app doesnt show cart icon")
	public void testme_app_doesnt_show_cart_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("testme app doesnt show cart icon ");
	}

	

}
