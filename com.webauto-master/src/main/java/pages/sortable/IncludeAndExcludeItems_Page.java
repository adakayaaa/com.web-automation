package pages.sortable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class IncludeAndExcludeItems_Page extends BasePage {
    @FindBy(xpath = "//ul[@id=\"sortable-inc-exc-1\"]/li")
    private List<WebElement> listOfPartOne;

    @FindBy(xpath = "//ul[@id=\"sortable-inc-exc-2\"]/li")
    private List<WebElement> listOfPartTwo;

    public String getElementsOrderOnTheUpperBox(int index){
       return listOfPartOne.get(index-1).getText();
    }
    public String getElementsOrderOnTheBelowBox(int index){
        return listOfPartTwo.get(index-1).getText();
    }
    public void moveUpperBoxElementByOffSets(String firstElementName,String secondElementName){
        List<String> stringOfElements = listOfPartOne.stream().map(WebElement::getText).toList();
        WebElement first= listOfPartOne.get(stringOfElements.indexOf(firstElementName));
        WebElement second=listOfPartOne.get(stringOfElements.indexOf(secondElementName));

        int xOffSet= second.getLocation().getX()+second.getSize().getWidth()/2-first.getLocation().getX();
        int yOffSet= second.getLocation().getY()+second.getSize().getHeight()/2-first.getLocation().getY();

        actions.moveToElement(first).clickAndHold().moveByOffset(xOffSet,yOffSet).release().perform();
    }


    public void moveBelowBoxElementByOffSets(String firstElementName,String secondElementName){
        List<String> stringOfElements = listOfPartTwo.stream().map(WebElement::getText).toList();
        WebElement first= listOfPartTwo.get(stringOfElements.indexOf(firstElementName));
        WebElement second=listOfPartTwo.get(stringOfElements.indexOf(secondElementName));

        int xOffSet= second.getLocation().getX()+second.getSize().getWidth()/2-first.getLocation().getX();
        int yOffSet= second.getLocation().getY()+second.getSize().getHeight()/2-first.getLocation().getY();

        actions.moveToElement(first).clickAndHold().moveByOffset(xOffSet,yOffSet).release().perform();
    }


    public int getDroppableElementYForUpperBox(int index) {
        return listOfPartOne.get(index-1).getLocation().getY();
    }


    public int getDroppableElementYForBelowBox(int index) {
        return listOfPartTwo.get(index-1).getLocation().getY();
    }

    public List<WebElement> getListOfPartOne() {
        return listOfPartOne;
    }

    public List<WebElement> getListOfPartTwo() {
        return listOfPartTwo;
    }


}
