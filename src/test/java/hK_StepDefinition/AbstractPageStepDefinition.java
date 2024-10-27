package hK_StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbstractPageStepDefinition {

	protected static WebDriver driver;

	protected static WebDriver getDriver() {
		if (driver == null)
		{
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	
}
