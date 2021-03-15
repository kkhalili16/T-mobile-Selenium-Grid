package test;
import com.BaseClass;
import com.BaseClassWebDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.PlanDropdownMenuPage;


public class PlanDropdownMenu extends BaseClass {
WebDriver driver;
    @DataProvider(name = "test1data")
    public Object[][] getData(){
        String excelPath =  projectPath+"/excel/data.xlsx";
        Object data[][] = testData(excelPath, "Sheet1");
        return data;
    }



    @Test()
    public void PlanDropdownHover() throws InterruptedException {
        String TmobileURL  = excel.getCellDataString(1, 4);
        driver.get(TmobileURL);
        Thread.sleep(5000);
        PlanDropdownMenuPage plan = new PlanDropdownMenuPage();
        plan.verify_plan_dropdown_menu_items_are_displayed();


    }



}
