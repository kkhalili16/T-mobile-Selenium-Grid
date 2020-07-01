package TestCases;

import Base.TestBase;
import Util.TestUtil;
import org.testng.annotations.*;
import pages.HomePageFirefox;

public class HomePageTestFirefox extends TestBase {
    TestUtil testUtil;
    HomePageFirefox homePageFirefox;
    TestBase testBase = new TestBase();


    public HomePageTestFirefox() {
        super();
    }


    @BeforeMethod
    @Parameters("browserName")
    public void setUp(@Optional String browserName){
        testBase.getLocalDriver(browserName);
        testUtil = new TestUtil();
        homePageFirefox = new HomePageFirefox();


    }



    @Test
    public void HomePageURL(){

        homePageFirefox.validateHomePageURL();
    }


    @Test
    public void navigation_bar_universal() {

        homePageFirefox.valida_universal_menu_bar();

    }

    @Test
    public void navigation_bar() {

        homePageFirefox.validateNavigationBar();
    }

    @Test
    public void Right_navigation_bar() {

       homePageFirefox.right_nav_items();
    }


    @Test
    public void PlansDropDownF() throws InterruptedException {
        homePageFirefox.PlansDropDown();
    }


    @AfterMethod
    public void tearDown(){

        driver.quit();
       // driver.close();
    }







}
