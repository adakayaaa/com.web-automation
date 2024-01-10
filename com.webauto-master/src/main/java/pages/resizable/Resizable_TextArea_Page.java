package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Resizable_TextArea_Page extends BasePage {

    @FindBy(id = "resizable-text-area-res")
    private WebElement firstElement;

    @FindBy(xpath = "(//div[@class=\"ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se\"])[10]")
    private WebElement resizeHandleForElement;


    public int getWidthOfResizableElement(){
        return firstElement.getSize().getWidth();
    }

    public int getHeightOfResizableElement(){
        return firstElement.getSize().getHeight();
    }
    public void resizeTheWebElement(int xOffset, int yOffset){
        actions.clickAndHold(resizeHandleForElement).moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void sendToTextAtTheTextArea(String sentence){
        firstElement.sendKeys(sentence);
    }

}
