package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static com.BaseClassWebDriver.driver;


public class EssentialsPlanPage {


    @FindBy(xpath = "//a[@id='digital-header-nav-link-head-0']")
    WebElement PlanDropdownMenu;

    WebElement EssentialsPlan = driver.findElement(By.xpath("//a[contains(.,'Essentials')]"));

    @FindBy(xpath = "//tbody/tr[5]/td[1]/div[1]/span[1]/span[1]/i[1]")
           WebElement includekUnlimitedTalkAndText1;

    @FindBy(xpath = "//tbody/tr[6]/td[1]/div[1]/span[1]/span[1]/i[1]")
    WebElement includeUnlimited4GLTE2;

    @FindBy(xpath = "//body[1]/div[6]/div[2]/section[1]/plans-component[1]/div[2]/table[1]/tbody[2]/tr[7]/td[1]/div[1]/span[1]/span[1]/i[1]")
    WebElement include5GAccess3;

    @FindBy(xpath = "//body[1]/div[6]/div[2]/section[1]/plans-component[1]/div[2]/table[1]/tbody[2]/tr[8]/td[1]/div[1]/span[1]/span[1]/i[1]")
    WebElement includeBestInWirelessScamProtection4;

    @FindBy(xpath = "//tbody/tr[9]/td[1]/div[1]/span[2]")
    WebElement notIncludedNetflixOnUs5;

    @FindBy(xpath = "//tbody/tr[10]/td[1]/div[1]/span[2]")
    WebElement notIncludedTaxesAndFeesIncluded6;

    @FindBy(xpath = "//tbody/tr[11]/td[1]/div[1]/span[1]/span[1]/i[1]")
    WebElement includeMobileHotspotData7;

    @FindBy(xpath = "//tbody/tr[12]/td[1]/div[1]/span[1]/span[1]/i[1]")
    WebElement includeTMobileTuesdays8;

    @FindBy(xpath = "//tbody/tr[13]/td[1]/div[1]/span[1]/span[1]/i[1]")
    WebElement includeDedicatedCustomerCareTeam9;



    public void Essentials_plan() throws InterruptedException {
        String title = "T-Mobile & Sprint Merged to Create the Best Wireless Carrier";
        String GetTitle = driver.getTitle();
        Assert.assertEquals(title, GetTitle);

        Thread.sleep(5000);
        WebElement ele = driver.findElement(By.xpath("//a[@id='digital-header-nav-link-head-0']"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
        EssentialsPlan.click();

        String [] ExpectedList = {"Unlimited talk & text","Unlimited 4G LTE data on our network",
                "5G access at no extra cost","Best-in-wireless scam protection","Netflix on us",
                "Taxes & fees included.","Mobile hotspot data","T-Mobile Tuesdays","Dedicated customer care team"};


        WebElement[] elems = {includekUnlimitedTalkAndText1, includeUnlimited4GLTE2, include5GAccess3,
                includeBestInWirelessScamProtection4, notIncludedNetflixOnUs5,
                notIncludedTaxesAndFeesIncluded6, includeMobileHotspotData7,
                includeTMobileTuesdays8, includeDedicatedCustomerCareTeam9};
/*
            for(int i=0; i<9; i++) {

                WebElement element = driver.findElement(By.xpath("//span[contains(text(),'"+ExpectedList[i]+"')]"));

                Assert.assertEquals(element.getText(), ExpectedList[i]);

                System.out.println(i + " :" + element.getText());
            }
*/
                for(int j=0; j<9; j++) {
                    elems[j].isDisplayed();
                }

            }


    }
