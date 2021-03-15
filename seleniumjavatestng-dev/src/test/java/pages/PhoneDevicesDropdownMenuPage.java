package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static com.BaseClassWebDriver.driver;


public class PhoneDevicesDropdownMenuPage {



   // @FindBy(xpath ="//a[@id='digital-header-nav-link-head-0']" )
   // WebElement PlanDropdownMenu;

    @FindBy(id = "digital-header-nav-link-head-1")
    WebElement PhoneDevices;





    public void verify_PhoneDevices_dropdown_menu_items_are_displayed() throws InterruptedException {
        String title = "T-Mobile & Sprint Merged to Create the Best Wireless Carrier";
        String GetTitle = driver.getTitle();
        Assert.assertEquals(title,GetTitle );

        Thread.sleep(5000);
        WebElement ele = driver. findElement(By.id("digital-header-nav-link-head-1"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();


        String [] ExpectedList = {"Cell phones","5G phones","Tablets & devices","Smartwatches","Accessories","Bring your own phone"};

        for (int i=0; i<6; i++){
            String ActualList = driver.findElement(By.linkText(ExpectedList[i])).getText();
            Assert.assertEquals(ActualList,ExpectedList[i]);
            System.out.println(ActualList);

        }






    }

}
