package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ProjectPages;
import pages.TestBase;

public class ProjectStepDefinition extends TestBase{

	ProjectPages projectPage;
	String actualBlueButtonName;
	String expectedBlueButtonName;
	String actualWhiteButtonName;
	String expectedWhiteButtonName;
	
	@Before
	public void openUrl() {
		initDriver();
		projectPage=PageFactory.initElements(driver, ProjectPages.class);
	}
	
	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists(){
		expectedBlueButtonName = "Set SkyBlue Background";
		actualBlueButtonName = driver.findElement(By.xpath("//button[text()='Set SkyBlue Background']")).getText();
		Assert.assertEquals(expectedBlueButtonName, actualBlueButtonName);
	}

	@When("^I click on the Set SkyBlue button$")
	public void i_click_on_the_Set_SkyBlue_button() {
		projectPage.clickOnSetSkyBlueBackgroundButton();
	}

	@Then("^The background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		Assert.assertTrue("SkyBlue Button is not enabled.", driver.findElement(By.xpath("//button[text()='Set SkyBlue Background']")).isEnabled());
	}

	//======================================================================================================
	
	@Given("^Set SkyWhite Background button exists$")
	public void set_SkyWhite_Background_button_exists() {
		expectedWhiteButtonName = "Set White Background";
		actualWhiteButtonName = driver.findElement(By.xpath("//button[text()='Set White Background']")).getText();
		Assert.assertEquals(expectedWhiteButtonName, actualWhiteButtonName);
	}

	@When("^I click on the Set White Backgroung button$")
	public void i_click_on_the_Set_White_Backgroung_button() {
		projectPage.clickOnSetSkyBlueBackgroundButton();
		projectPage.clickOnSetWhiteBackgroundButton();
	}

	@Then("^The background color will change to white$")
	public void the_background_color_will_change_to_white() {
		Assert.assertTrue("White Button is not enabled.", driver.findElement(By.xpath("//button[text()='Set White Background']")).isEnabled());
	}
	
	
	@After
	public void closeUrl() {
		tearDown();
	}
}
