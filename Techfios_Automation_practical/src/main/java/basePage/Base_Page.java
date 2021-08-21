package basePage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Base_Page {
	WebDriver driver;
	public void basePage(WebDriver driver) {
		this.driver = driver;
		
	}

	public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		String currentDirectory = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currentDirectory + "/screenshot/" + label + ".png"));

	}

}
