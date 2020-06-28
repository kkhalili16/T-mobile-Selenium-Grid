package pages;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.FindsByXPath;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class HomePage extends TestBase {

    @FindBy(id = "digital-header-nav-link-head-0")
    WebElement Plans;

    @FindBy(id = "digital-header-nav-link-head-1")
    WebElement Phones_devices ;

    @FindBy(id = "digital-header-nav-link-head-2")
    WebElement Deals;

    @FindBy(id = "digital-header-nav-link-head-3")
    WebElement Coverage;

    @FindBy(id = "digital-header-nav-link-head-4")
    WebElement  Benefits_more ;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void validateHomePageURL(){
        String home_url = driver.getCurrentUrl();
        Assert.assertEquals(home_url, prop.getProperty("url"));
        System.out.println(home_url);
    }

    public void valida_universal_menu_bar(){
        String [] expected_universal = {"WIRELESS", "BUSINESS", "PREPAID", "TV", "BANKING"};
            for(int i=0; i<5; i++){
                String actual_universal = driver.findElement(By.xpath("//a[@id='universal-menu-" + i + "']")).getText();
                Assert.assertEquals(actual_universal, expected_universal[i]);
            }
    }
    public void validateNavigationBar(){

        String A = Plans.getText();
        String B = Phones_devices.getText();
        String C = Deals.getText();
        String D = Coverage.getText();
        String E = Benefits_more.getText();
        String[] actualNav = {A,B,C,D,E};
        String[] nav = {"Planss", "Phones & devices", "Deals", "Coverage", "Benefits & more"};
        for(int i=0; i<5; i++) {
            Assert.assertEquals(actualNav[i], nav[i]);
        }


            /*
            WebElement ele = driver. findElement(By.id("digital-header-nav-link-head-0"));
            Actions action = new Actions(driver);
            action.moveToElement(ele).perform();
            */
    }


}
