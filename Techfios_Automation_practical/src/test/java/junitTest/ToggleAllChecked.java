package junitTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junitPage.OneItemPage;
import junitPage.RemoveAllItems;
import junitPage.ToggleAll;
import util.BrowserFactory;

public class ToggleAllChecked {
	WebDriver driver;
	
@Test
	public void navigateToWebpage() {
		
     driver = BrowserFactory.init();
     
     ToggleAll toggleAll = PageFactory.initElements(driver, ToggleAll.class);
     
     toggleAll.clickToggle_BOX();
     toggleAll.validatingAllToggleBoxChecked();
  
	}
	@Test
	public void clickOneItemList() {
		
	     driver = BrowserFactory.init();
	     
	     OneItemPage oneItem = PageFactory.initElements(driver, OneItemPage.class);
	     
	     oneItem.clickOneItem();
	     oneItem.removeSelectedItem();
	    
	  
	}
	@Test
	public void removeAllToggleItem() {
		
     driver = BrowserFactory.init();
     RemoveAllItems removeAllItems = PageFactory.initElements(driver, RemoveAllItems.class);
     
    
   removeAllItems.removeAllToggleItem() ;
	}
}
