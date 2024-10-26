package hK_TestRunner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import hK_StepDefinition.AbstractPageStepDefinition;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(

		//features = {"Feature/ToGet_Details_Using_CountryName_UsingAPI.feature"}
		//features = {"Feature/NopCommerce_Login.feature"}
		//features = {"Feature/DataTable_Example_SingleData.feature"}
		//features = {"Feature/WebOrder_Login_DataTable_All_TCs.feature"}
		//features = {"Feature/TestComplete_Order.feature"}
		//features = {"Feature/DataTable_Example_DirectInSteps.feature"}
		//features = {"Feature/TestComplete_Login.feature"}
		features = {"Feature/OrangeHRM_Login.feature"}
		//features = {"Feature/OrangeHRM_AddUser.feature"}
		//features = {"Feature/Spreecom_Login.feature"}
		//features = {"Feature/Spreecom_Login_DataDrivenTesting_AllCondition.feature"}
		//features = {"Feature/WebOrder_Login.feature"}
		//features = {"Feature/Create_Refresh_Token.feature"}
		//features = {"Feature/DataTable_Example_SingleData.feature"}
		//features = {"Feature/WebOrder_Login_DataTable_MultipleData.feature"}
		//features = {"Feature"}
		,glue= "hK_StepDefinition"
		,dryRun=false
		,monochrome=true
		,plugin  = {"pretty","html:CucumberReport/OrangeHRM.html"}
		//,plugin  = {"pretty","html:CucumberReport/Report.html","rerun:Rerun/failed_scenarios.txt"}
		//Execute all of them Except Sanity
		//,tags="not @smoke"
		// Execute Smoke and Sanity both test cases
		//,tags= "@smoke or @sanity"
		// Execute Smoke and Sanity , but both should be marked together in feature
		//,tags= "@smoke and @sanity"
		//,tags= "@smoke"
		
		)


public class TestRunner extends AbstractPageStepDefinition {
	// Global Variable
	static WebDriver driver = getDriver();
	
	//------------------------Below is Hook example----------
	@AfterClass
	public static void CloseBrowser() {
		driver.quit();	
	}

}
