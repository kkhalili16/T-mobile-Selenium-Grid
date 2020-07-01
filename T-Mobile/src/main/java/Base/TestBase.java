package Base;

import Util.TestUtil;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import org.testng.annotations.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;



public class TestBase {

    //public static WebDriver driver;
    public static Properties prop;
    public static WebDriver driver = null;


    public TestBase() {


        try {


            prop = new Properties();
            FileInputStream ip = new FileInputStream("/Users/ahmadkhalili/Desktop/T-Mobile/src/main/java/config/config.properties");
            prop.load(ip);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public WebDriver getLocalDriver(@Optional String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/ahmadkhalili/Desktop/T-Mobile/seleniumgrid/chromedriver");
            driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("firefox")) {


            System.setProperty("webdriver.gecko.driver", "/Users/ahmadkhalili/Desktop/T-Mobile/seleniumgrid/geckodriver");

            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();

        } else if (browserName.equalsIgnoreCase("InternetExplore")) {
            driver = new InternetExplorerDriver();
        }

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

            driver.get(prop.getProperty("url"));
            return driver;

    }
}

        //  String browserName = prop.getProperty("browser");

        // if (browser.equals("chrome")) {
            /*
            System.out.println("Browser is Chrome");
            ChromeOptions cap = new ChromeOptions();
            cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
                    UnexpectedAlertBehaviour.IGNORE);

            driver = new RemoteWebDriver(new URL("http://10.0.1.10:4444/wd/hub"), cap);
            */


        // System.setProperty("webdriver.chrome.driver", "/Users/ahmadkhalili/Desktop/chromedriver");
        // driver = new ChromeDriver();


        //  } else if (browser.equals("firefox")) {
        /*
            System.out.println("Browser is Firefox");
            DesiredCapabilities cap;
            cap = DesiredCapabilities.firefox();
            cap.setBrowserName("firefox");
            cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
                    UnexpectedAlertBehaviour.IGNORE);

            driver = new RemoteWebDriver(new URL("http://10.0.1.10:4444/wd/hub"), cap);

            */


        //  System.setProperty("webdriver.gecko.driver", "/Users/ahmadkhalili/Desktop/T-Mobile/seleniumgrid/geckodriver");
        //  driver = new FirefoxDriver();


        //  } else if (browser.equals("safari")) {
        //      System.out.println("Browser is Safari");

            /*
            SafariOptions cap = new SafariOptions();
            driver = new RemoteWebDriver(new URL("http://10.0.1.10:4444/wd/hub"), cap);
            */

        // driver = new SafariDriver();


        //     }








