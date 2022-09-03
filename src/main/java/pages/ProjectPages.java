package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProjectPages {

	WebDriver driver;
	
	public ProjectPages(WebDriver driver) {
		driver=this.driver;
	}
	
	@FindBy(how = How.XPATH, using = "//button[text()='Set SkyBlue Background']") WebElement BLUE_BACKGROUND_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[text()='Set White Background']") WebElement WHITE_BACKGROUND_ELEMENT;

	public void clickOnSetSkyBlueBackgroundButton() {
		BLUE_BACKGROUND_ELEMENT.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSetWhiteBackgroundButton() {
		WHITE_BACKGROUND_ELEMENT.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
