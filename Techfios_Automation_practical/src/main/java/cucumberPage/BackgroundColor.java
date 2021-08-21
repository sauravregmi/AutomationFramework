package cucumberPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

public class BackgroundColor {
	WebDriver driver;
	
	public BackgroundColor(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how =How.XPATH, using = "//*[@name='colour']/following-sibling::button[1]")
	WebElement changeToSkyblue;
	@FindBy(how =How.XPATH, using = "//*[@name='colour']/following-sibling::button[2]")
	WebElement changeToWhite;
	@FindBy(xpath = "//body")
	WebElement errortext;
	
	
	public void SkyBlueBackgound(){
		changeToSkyblue.click();
		
	}
	public void WhiteBackgound(){
		changeToWhite.click();
		
	}
	public void SkyBlueColorValidation() {
		SoftAssert soft = new SoftAssert();
		String actualText = errortext.getText();
		String actualButton = changeToSkyblue.getText();
		

		String expButton = "Set SkyBlue Background";

		soft.assertEquals( actualButton,expButton, actualButton + " does not match with " + expButton);

		changeToSkyblue.click();

		String actualColor = errortext.getAttribute("style");
		String expColor = "background-color: skyblue;";


		System.out.println("background color " + errortext.getAttribute("style"));

		soft.assertEquals( actualColor,expColor, actualColor + " does not match with " + expColor);

			soft.assertAll();
	}
	public void WhiteColorValidation() {
		SoftAssert soft = new SoftAssert();
		String actualText = errortext.getText();
		String actualButton1 = changeToWhite.getText();

		String expButton = "Set SkyWhite Background";

		soft.assertEquals( actualButton1,expButton, actualButton1 + " does not match with " + expButton);

		changeToSkyblue.click();

		String actualColor = errortext.getAttribute("style");
		String expColor = "background-color: white;";


		System.out.println("background color " + errortext.getAttribute("style"));

		soft.assertEquals( actualColor,expColor, actualColor + " does not match with " + expColor);

			soft.assertAll();
	}
}
