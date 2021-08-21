package testNGTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import basePage.Base_Page;
import testNGPage.AddCategory;
import util.BrowserFactory;
@Test
public class CategoryField {
	WebDriver driver;
	public void addCategoryTest() throws IOException {
		
	     driver = BrowserFactory.init();
	     
	   AddCategory  addCategory = PageFactory.initElements(driver, AddCategory.class);
	   Base_Page basePage= PageFactory.initElements(driver, Base_Page.class);
	     
        addCategory.clickToAddCategory();
        basePage.takeScreenshotAtEndOfTest(driver);
}
	
	
}