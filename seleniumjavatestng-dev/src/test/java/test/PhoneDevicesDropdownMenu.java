package test;
import com.BaseClass;
import com.BaseClassWebDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.PhoneDevicesDropdownMenuPage;


public class PhoneDevicesDropdownMenu extends BaseClass {
WebDriver driver;
    @DataProvider(name = "test1data")
    public Object[][] getData(){
        String excelPath =  projectPath+"/excel/data.xlsx";
        Object data[][] = testData(excelPath, "Sheet1");
        return data;
    }



    @Test()
    public void PhoneDevicesDropdownHover() throws InterruptedException {
        String TmobileURL  = excel.getCellDataString(1, 4);
        driver.get(TmobileURL);
        Thread.sleep(5000);
        PhoneDevicesDropdownMenuPage PhoneDevices = new PhoneDevicesDropdownMenuPage();
        PhoneDevices.verify_PhoneDevices_dropdown_menu_items_are_displayed();



    }



}
