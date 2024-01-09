package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Resizable_TextArea_Page extends BasePage {

    @FindBy(id = "resizable-text-area-res")
    private WebElement firstElement;

    public int getWidthOfResizableElement(){
        return firstElement.getSize().getWidth();
    }

    public int getHeightOfResizableElement(){
        return firstElement.getSize().getHeight();
    }

    public WebElement getFirstElement() {
        return firstElement;
    }

    public void sendToTextAtTheTextArea(String sentence){
        firstElement.sendKeys(sentence);
    }


}
