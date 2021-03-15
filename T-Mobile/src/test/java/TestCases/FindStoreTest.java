package TestCases;

import Base.TestBase;
import Util.TestUtil;
import org.testng.annotations.*;
import pages.FindStorePage;
import pages.HomePage;

public class FindStoreTest extends TestBase {

    TestUtil testUtil;
    HomePage homepage;
    FindStorePage findstorepage;
    TestBase testBase;


    public FindStoreTest() {
        super();
    }


    @BeforeMethod
    @Parameters("browserName")
    public void setUp2(String browserName, String AllBrowsers){
        testBase = new TestBase();
        testBase.getLocalDriver(browserName);
        findstorepage = new FindStorePage();
        testUtil = new TestUtil();
        homepage = new HomePage();


    }

    @Test
    public void validateFindStoreLink(){
        findstorepage.validateFindStoreLink();

    }

    @Test
    public void validateFindStoreUrl(){
        findstorepage.validateFindStoreUrl();
    }










    @AfterMethod
    public void tearDown(){

        try {
            driver.wait(15000);
        }
        catch (Exception e){
            driver.quit();
        }


    }


}

