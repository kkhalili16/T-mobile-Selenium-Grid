package test;
import com.BaseClassWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.DealsDropdownMenuPage;


public class DealsDropdownMenu extends BaseClassWebDriver {

    @DataProvider(name = "test1data")
    public Object[][] getData(){
        String excelPath =  projectPath+"/excel/data.xlsx";
        Object data[][] = testData(excelPath, "Sheet1");
        return data;
    }



    @Test()
    public void DealsDropdownHover() throws InterruptedException {
        String TmobileURL  = excel.getCellDataString(1, 4);
        driver.get(TmobileURL);
        Thread.sleep(5000);

        DealsDropdownMenuPage Deals = new DealsDropdownMenuPage();
        Deals.verify_Deals_dropdown_menu_items_are_displayed();



    }



}
