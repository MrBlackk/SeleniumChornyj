package core;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Arrays;

/**
 * Created by chv on 12.11.2014.
 */
public class WebDriverFactory {

    static {
        try {
            //System.setProperty("webdriver.ie.driver", WebDriverFactory.class.getClassLoader().getResource("drivers/windows/IEDriverServer.exe").getPath());
            System.setProperty("webdriver.ie.driver", WebDriverFactory.class.getClassLoader().getResource("drivers/windows/iedriver.exe").getPath());
            System.setProperty("webdriver.chrome.driver", WebDriverFactory.class.getClassLoader().getResource("drivers/windows/chromedriver.exe").getPath());
        }
        catch (Exception e){
            System.out.println("Cannot launch InternetExplorer or Chrome driver \n" + e.getMessage());
        }
    }

    public static WebDriver getWebDriver(BrowserTypes browserType){

        switch (browserType){
            case FIRE_FOX:
                ProfilesIni profile = new ProfilesIni();
                FirefoxProfile ffprofile = profile.getProfile("SELENIUM");

                return new FirefoxDriver(ffprofile);
            case CHROME:
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setExperimentalOption("excludeSwitches", Arrays.asList("ignore-certificate-errors"));

                return new ChromeDriver(chromeOptions);
            case IE:
                //DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
                //capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
                return new InternetExplorerDriver();
            default:
                throw new IllegalArgumentException("Browser is not supported " + browserType);
        }
    }
}
