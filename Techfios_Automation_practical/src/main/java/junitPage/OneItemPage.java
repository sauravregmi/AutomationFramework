package junitPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class OneItemPage {
	WebDriver driver;
	
	public OneItemPage(WebDriver driver) {
		this.driver = driver;
		
	}
	@FindBys(@FindBy(how = How.NAME, using = "todo[0]" )) List<WebElement>OneItem;
	
	@FindBy(how = How.NAME, using = "submit")
	WebElement Remove;

	public void clickOneItem() {
		for (int i =0 ; i < OneItem.size();i++)
		
		 OneItem.get(i).click();;
	
	}
	
public void removeSelectedItem() {
	
		Remove.click();
		
		
	
}


}



