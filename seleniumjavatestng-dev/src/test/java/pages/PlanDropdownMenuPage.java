package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static com.BaseClassWebDriver.driver;




public class PlanDropdownMenuPage {



   // @FindBy(xpath ="//a[@id='digital-header-nav-link-head-0']" )
   // WebElement PlanDropdownMenu;

    @FindBy(id = "digital-header-nav-link-head-0")
    WebElement PlanDropdownMenu;

    @FindBy(xpath ="//span[contains(text(),'Essentials')]" )
    WebElement PlanDropdownMenuEssentials;



    public void verify_plan_dropdown_menu_items_are_displayed() throws InterruptedException {
        String title = "T-Mobile & Sprint Merged to Create the Best Wireless Carrier";
        String GetTitle = driver.getTitle();
        Assert.assertEquals(title,GetTitle );

        Thread.sleep(5000);
        WebElement ele = driver. findElement(By.id("digital-header-nav-link-head-0"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();


        String [] ExpectedList = {"Magenta®","Magenta® Plus","Essentials","Unlimited Age 55+","Military & Veterans","First Responder"};
        for (int i=0; i<6; i++){
            String ActualList = driver.findElement(By.linkText(ExpectedList[i])).getText();
            Assert.assertEquals(ActualList,ExpectedList[i]);

        }






    }

}
