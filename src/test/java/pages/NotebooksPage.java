package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ui_tests.TestData;
import utilities.Log4Test;

import java.util.List;

/**
 * Created by chv on 12.11.2014.
 */
public class NotebooksPage extends GeneralPage{

    //Verify that tab "Ноутбуки, планшеты и компьютеры" is active
    public boolean isTabActive(){
        return elementIsLocated(getLocator("notebooksTabActive")).isDisplayed();
    }

    //Verify that all 9 manufactures are present in correct order
    public boolean verifyManufacturers(){
        Log4Test.info("Verify that all 9 manufactures are present");
        List<WebElement> listOfManufacturers =  elementsAreLocated(getLocator("allManufacturers"));
        List<String> listOfManufacturersVerify = TestData.MANUFACTURERS_LIST;

        for (int i=0;i<listOfManufacturers.size();i++){
            if (!listOfManufacturers.get(i).getText().equals(listOfManufacturersVerify.get(i))){
                return false;
            }
        }
        return true;
    }

    public void findAppleManufacturerAndClick(){
        Log4Test.info("Find and click 'Apple' manufacturer");
        List<WebElement> listOfManufacturers =  elementsAreLocated(getLocator("allManufacturers"));

        for (int i=0;i<listOfManufacturers.size();i++){
            if (listOfManufacturers.get(i).getText().equals("Apple")){
                listOfManufacturers.get(i).click();
                break;
            }
        }
    }

}
