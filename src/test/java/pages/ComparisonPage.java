package pages;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Log4Test;

import java.util.List;

/**
 * Created by chv on 12.11.2014.
 */
public class ComparisonPage extends GeneralPage{

    @Override
    public boolean isOpened(String URL) {
        return webDriver.getCurrentUrl().contains(URL); // changed "equals" to "contains"
    }

    public boolean isCompareGoodsTextPresent(){
        Log4Test.info("Verify that the page contains \"Сравнение товаров\" title");
        return elementIsLocated(getLocator("comparisonPageTitle")).getText().equals("Сравнение товаров");
    }

    public boolean isMacBookPresent(String notebookName){
        List<WebElement> listOfCompared = elementsAreLocated(getLocator("elementsInComparison"));
        for (int i=0;i<listOfCompared.size();i++){
            if (listOfCompared.get(i).getText().contains(notebookName)){
                Log4Test.info("Verify that the page \"Сравнение товаров\" contains " + listOfCompared.get(i).getText());
                return true;
            }
        }
        return false;
    }

}
