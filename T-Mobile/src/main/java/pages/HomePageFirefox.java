package pages;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class HomePageFirefox extends TestBase {
    //Web elements for validateNavigationBar().....
    @FindBy(id = "digital-header-nav-link-head-0")
    WebElement Plans;

    @FindBy(id = "digital-header-nav-link-head-1")
    WebElement Phones_devices;

    @FindBy(id = "digital-header-nav-link-head-2")
    WebElement Deals;

    @FindBy(id = "digital-header-nav-link-head-3")
    WebElement Coverage;

    @FindBy(id = "digital-header-nav-link-head-4")
    WebElement Benefits_more;

    // //Web elements for right_nav_items()......
    @FindBy(xpath = "//span[contains(text(),'Find a store')]")
    WebElement FindStore;

    @FindBy(xpath = "//span[@class='d-inline show-on-sm-modal'][contains(text(),'Contact & support')]")
    WebElement ContactSupport;

    @FindBy(xpath = "//span[contains(text(),'Cart')]")
    WebElement Cart;

    @FindBy(xpath = "//span[@class='d-inline show-on-sm-modal ng-tns-c0-0 ng-star-inserted']")
    WebElement Search;

    @FindBy(xpath = "//button[@id='user-links-dropdown']")
    WebElement My_account;




    public HomePageFirefox() {
        PageFactory.initElements(driver, this);
    }


    public void validateHomePageURL() {
        String home_url = driver.getCurrentUrl();
        Assert.assertEquals(home_url, prop.getProperty("url"));
        System.out.println(home_url);

    }

    public void valida_universal_menu_bar() {
        String[] expected_universal = {"WIRELESS", "BUSINESS", "PREPAID", "TV", "BANKING"};
        for (int i = 0; i < 5; i++) {
            String actual_universal = driver.findElement(By.xpath("//a[@id='universal-menu-" + i + "']")).getText();

            Assert.assertEquals(actual_universal, expected_universal[i]);
            //    if (browser_Page.equals("safari")){
            //      String[] expected_universal_S = {" Wireless ", " Business ", " Prepaid ", " TV ", " Banking "};

            //     Assert.assertEquals(actual_universal, expected_universal_S[i]);
        }
    }

    // }
    public void validateNavigationBar() {


        String A = Plans.getText();
        String B = Phones_devices.getText();
        String C = Deals.getText();
        String D = Coverage.getText();
        String E = Benefits_more.getText();
        String[] actualNav = {A, B, C, D, E};
        String[] nav = {"Plans", "Phones & devices", "Deals", "Coverage", "Benefits & more"};
        for (int i = 0; i < 5; i++) {



            Assert.assertEquals(actualNav[i], nav[i]);
            //    if (browser_Page.equals("safari")){
            //       String[] nav_S = {" Plans ", " Phones & devices ", " Deals ", " Coverage ", " Benefits & more "};

            //     Assert.assertEquals(actualNav[i], nav_S[i]);
        }

    }


    //  }


    public void right_nav_items() {
        String A = FindStore.getText();
        String B = ContactSupport.getText();
        String C = Cart.getText();
        String D = Search.getText();
        String E = My_account.getText();
        String[] actualRightNav = {A, B, C, D, E};
        String[] RightNav = {"Find a store", "Contact & support", "Cart", "Search", "My account"};
        for (int i = 0; i < 5; i++) {


            Assert.assertEquals(actualRightNav[i], RightNav[i]);
            //       System.out.println(actualRightNav[i]+ " || " + RightNav[i]);
            //     String browser_Page;
            //    if (browser_Page.equals("safari")){
            //      String[] RightNav_S = {"Find a store", "Contact & support", "Cart", " Search ", " My account "};

            //     Assert.assertEquals(actualRightNav[i], RightNav_S[i]);
        }


    }


    public void PlansDropDown() throws InterruptedException {
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


