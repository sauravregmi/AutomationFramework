package cucumberTestStep;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumberPage.BackgroundColor;
import util.BrowserFactory;

public class BackgroundStepDef {
	WebDriver driver; 
	BackgroundColor backgroundColor;
	
	@Given("^\"([^\"]*)\" button exits$")
	public void button_exits(String arg1)  {
		driver = BrowserFactory.init();
	    
	}

	@Then("^\"([^\"]*)\" after user clicks on the button$")
	public void after_user_clicks_on_the_button(String arg1) {
		backgroundColor.SkyBlueBackgound();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue(){
	 backgroundColor.SkyBlueColorValidation();
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white()  {
     backgroundColor.WhiteColorValidation();;
	}


}
