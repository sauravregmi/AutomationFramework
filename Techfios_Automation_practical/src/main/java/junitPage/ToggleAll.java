package junitPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ToggleAll {
	WebDriver driver;
	
	public void ToggleALL(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@FindBy(how = How.NAME, using = "allbox") WebElement Toggle_BOX;
	
	
	public void clickToggle_BOX() {
		Toggle_BOX.click();
	}
	
	public void validatingAllToggleBoxChecked() {
	
		for (int i =0; i<2; i++) {
			Toggle_BOX.click();
			//System.out.println(Toggle_BOX.isSelected());
		}
	
	}

}
