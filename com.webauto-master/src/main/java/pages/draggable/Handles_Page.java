package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;


public class Handles_Page extends BasePage {
    @FindBy(id = "draggable13")
    private WebElement bigBoxForFirstElement;

    @FindBy(xpath = "//p[contains(text(),'I can be dragged only by this handle')]")
    private WebElement firstElement;

    @FindBy(id = "draggable14")
    private WebElement bigBoxForSecondElement;

    @FindBy(xpath ="//p[contains(text(),\"…but you can't drag me by this handle.\")]" )
    private WebElement secondElement;

    @FindBy(xpath = "//p[contains(text(),'You can drag me around…')]")
    private WebElement withoutTheSecondElementInSecondBigBox;

    public void dragAndDrop() {
        actions.dragAndDropBy(firstElement, 10, 10).perform();
    }

    public void dragAndDropByOffSets(int xOffset, int yOffset, WebElement webElement) {
        actions.dragAndDropBy(webElement, xOffset, yOffset).perform();
    }

    public int getLocationOfDraggableX(WebElement webElement) {
        return webElement.getLocation().getX();
    }

    public int getLocationOfDraggableY(WebElement webElement) {
        return webElement.getLocation().getY();
    }

    public WebElement getBigBoxForFirstElement() {
        return bigBoxForFirstElement;
    }

    public WebElement getFirstElement() {
        return firstElement;
    }

    public WebElement getBigBoxForSecondElement() {
        return bigBoxForSecondElement;
    }

    public WebElement getSecondElement() {
        return secondElement;
    }

    public WebElement getWithoutTheSecondElementInSecondBigBox() {
        return withoutTheSecondElementInSecondBigBox;
    }
}
