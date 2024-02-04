package pages.sortable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class DisplayAsGrid_Page extends BasePage {
    @FindBy(xpath = "//ul[@id=\"sortable-disp-as-grid\"]/li")
    private List<WebElement> listOfNumbers;

    public void clickAndDragItem(int index,int xOffSet,int yOffSet){
       actions.moveToElement( listOfNumbers.get(index-1)).clickAndHold().moveByOffset(xOffSet,yOffSet).release().perform();
    }

    public List<Integer> getTextNumbers(){
        List<Integer> list= new ArrayList<>();
        for (int i = 0; i < listOfNumbers.size(); i++) {
            list.add(Integer.parseInt(listOfNumbers.get(i).getText()));
        }
        return list;
    }

}
