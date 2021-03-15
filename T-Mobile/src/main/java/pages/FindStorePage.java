package pages;

import Base.TestBase;
import org.openqa.selenium.support.PageFactory;


public class FindStorePage extends TestBase {


    public FindStorePage() {PageFactory.initElements(driver, this);}



public void validateFindStoreLink(){

        driver.getTitle();



}

    public void validateFindStoreUrl(){

        driver.getCurrentUrl();


    }





}
