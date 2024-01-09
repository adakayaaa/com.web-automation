package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;


public class Resizable_SynchronusResize_Page extends BasePage {

    @FindBy(id = "resizable-synchr-resize")
    private WebElement firstElement;

    @FindBy(css = "#resizable-synchr-resize > div.ui-icon")
    private WebElement resizeHandleForFirstElement;

    @FindBy(id = "also-synchr-resize")
    private WebElement secondElement;

    @FindBy(css = "#also-synchr-resize > div.ui-icon")
    private WebElement resizeHandleForSecondElement;


    public void resizeTheWebElement(int xOffset, int yOffset,WebElement webElement){
        actions.clickAndHold(webElement).moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public int getWidthOfResizableElement(WebElement webElement){
        return webElement.getSize().getWidth();
    }

    public int getHeightOfResizableElement(WebElement webElement){
        return webElement.getSize().getHeight();
    }

    public WebElement getFirstElement() {
        return firstElement;
    }

    public WebElement getResizeHandleForFirstElement() {
        return resizeHandleForFirstElement;
    }

    public WebElement getSecondElement() {
        return secondElement;
    }

    public WebElement getResizeHandleForSecondElement() {
        return resizeHandleForSecondElement;
    }

}
