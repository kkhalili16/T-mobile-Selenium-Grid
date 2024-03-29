package TestCases;

import Base.TestBase;
import Util.TestUtil;
import org.testng.annotations.*;
import pages.HomePage;

public class HomePageTest extends TestBase {
    TestUtil testUtil;
    HomePage homepage;
    TestBase testBase = new TestBase();


    public HomePageTest() {
        super();
    }


    @BeforeMethod
    @Parameters("browserName")
    public void setUp(@Optional String browserName){
        testBase.getLocalDriver(browserName);
        testUtil = new TestUtil();
        homepage = new HomePage();


    }



    @Test
    public void HomePageURL(){

        homepage.validateHomePageURL();
    }


    @Test
    public void navigation_bar_universal() {

        homepage.valida_universal_menu_bar();

    }

    @Test
    public void navigation_bar() {

        homepage.validateNavigationBar();
    }

    @Test
    public void Right_navigation_bar() {

       homepage.right_nav_items();
    }


    @Test
    public void PlansDropDown() throws InterruptedException {
        homepage.PlansDropDown();
    }



    @AfterMethod
    public void tearDown(){

        driver.quit();
        //driver.close();
    }





}
