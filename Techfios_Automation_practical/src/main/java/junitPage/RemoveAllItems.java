package junitPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveAllItems {
WebDriver driver;
	
	public void removeAllItems(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@FindBy(how = How.NAME, using = "allbox") WebElement Toggle_BOX;
	@FindBy(how = How.CSS, using = "input[value='Remove']" )
	WebElement Remove;
	
	
	

		
	
	public void removeAllToggleItem() {

		for (int i =0; i<2; i++) {
			Toggle_BOX.click();
		Remove.click();
		
	}
	}
}
