package hK_StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRM_StepDefinition extends AbstractPageStepDefinition {

	WebDriver driver = getDriver();
	
	@Given("user has launched the chrome browser")
	public void user_has_launched_the_chrome_browser() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@When("user enter the valid url")
	public void user_enter_the_valid_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enter the valid username and password")
	public void user_enter_the_valid_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//button[@type ='submit']")).click();

	}

	@Then("user should navigate to dashboard")
	public void user_should_navigate_to_dashboard() {
		boolean displayed = driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();
		System.out.println(" User in dashboard "+displayed);
	}

	@Then("user should see admin tab")
	public void user_should_see_admin_tab() {
driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		
	}

	
	
}
