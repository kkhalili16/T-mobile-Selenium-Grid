package test;
import com.BaseClassWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.EssentialsPlanPage;


public class EssentialsPlan extends BaseClassWebDriver {

    @DataProvider(name = "test1data")
    public Object[][] getData(){
        String excelPath =  projectPath+"/excel/data.xlsx";
        Object data[][] = testData(excelPath, "Sheet1");
        return data;
    }



    @Test()
    public void verify_Essentials_plan_the_items_list_that_included_or_not_included() throws InterruptedException {
        String TmobileURL  = excel.getCellDataString(1, 4);
        driver.get(TmobileURL);
        Thread.sleep(5000);
        EssentialsPlanPage Essentials = new EssentialsPlanPage();
        Essentials.Essentials_plan();


    }



}
