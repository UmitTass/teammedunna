package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigReader;
import utilities.Driver;

public class Hooks {
    @Before(order=1, value = "@NewApplicant")
    public void navigateToRegistration(){

Driver.getDriver().get(ConfigReader.getProperty("registration_page_url"));
    }

    @Before(order=3, value="@UIregistration")
    public void beforeRegistration(){ Driver.getDriver().get("https://medunna.com/account/register");}


    @After(order=3, value = "@UIregistration")
    public void tearDown(Scenario scenario){
        System.out.println();

        if (scenario.isFailed()) {
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png","screenshots");
        }

    }

}
