package testNGPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

public class AddCategory {

static WebDriver driver ;


Random rnd = new Random();
int randomNum = rnd.nextInt(999);

	@FindBy(how = How.NAME, using = "categorydata") WebElement inputCategory;
	@FindBy(how = How.CSS, using = "input[value='Add category']") WebElement clickAddCategory;

	
	@FindBy(xpath = "//*[@name='categorydata']")
	WebElement categoryData;
	@FindBy(xpath = "//*[@value='Add category']")
	WebElement addCategoryButton;
	@FindBy(xpath = "//body")
	WebElement errortext;

	
	


	public void clickToAddCategory()  {
		
		inputCategory.sendKeys("TestSubject"+ randomNum);
	clickAddCategory.click();
		
		categoryData.sendKeys("TestSubject456");
	addCategoryButton.click();
	

	
		
	SoftAssert soft = new SoftAssert();
	String actualText = errortext.getText();
System.out.println("actualText " + actualText);
soft.assertEquals( actualText,"The category you want to add already exists: TestSubject456.\n"
		+ "\n"
		+ "Do you want to update its colour to TestSubject456?\n"
		+ "\n"
		+ "Yes or Nevermind");
	
	
	List<String> actualListOfmonth = new ArrayList<String>();

for(int i = 1; i< 13; i++) {
	String actual =driver.findElement(By.xpath("//*[@name='due_month']/option[i]")).getText();
	actualListOfmonth.add(actual);


}

List<String> expectedListOfmonth = new ArrayList<String>();

expectedListOfmonth.add("Jan");
expectedListOfmonth.add("Feb");


soft.assertTrue(actualListOfmonth.equals(expectedListOfmonth));

//for cucumber
//String actualButton = changeToSkyblue.getText();

//String expButton = "Set SkyBlue Background";

//soft.assertEquals( actualButton,expButton, actualButton + " does not match with " + expButton);

//changeToSkyblue.click();

//String actualColor = errortext.getAttribute("style");
//String expColor = "background-color: skyblue;";


//System.out.println("background color " + errortext.getAttribute("style"));

//soft.assertEquals( actualColor,expColor, actualColor + " does not match with " + expColor);

	soft.assertAll();
		

	
		
	}


}