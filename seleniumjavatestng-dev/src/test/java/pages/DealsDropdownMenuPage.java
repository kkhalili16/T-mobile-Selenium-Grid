package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static com.BaseClassWebDriver.driver;


public class DealsDropdownMenuPage {




    @FindBy(id = "digital-header-nav-link-head-2")
    WebElement DealsDropdownMenu;




    public void verify_Deals_dropdown_menu_items_are_displayed() throws InterruptedException {
        String title = "T-Mobile & Sprint Merged to Create the Best Wireless Carrier";
        String GetTitle = driver.getTitle();
        Assert.assertEquals(title,GetTitle );

        Thread.sleep(5000);
        WebElement ele = driver. findElement(By.id("digital-header-nav-link-head-2"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();


        String [] ExpectedList = {"See all deals","Apple","Samsung","LG","OnePlus"};
        for (int i=0; i<5; i++){
            String ActualList = driver.findElement(By.linkText(ExpectedList[i])).getText();
            Assert.assertEquals(ActualList,ExpectedList[i]);
            System.out.println(ActualList);

        }






    }

}
