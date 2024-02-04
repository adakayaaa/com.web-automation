package pages.accordion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class CollapseContent_Page extends BasePage {
    @FindBy(id = "ui-id-9")
    private WebElement firstSection;

    @FindBy(id="ui-id-11")
    private WebElement secondSection;

    @FindBy(id="ui-id-13")
    private WebElement thirdSection;

    @FindBy(id="ui-id-15")
    private WebElement forthSection;

    public void clickOnFirstSection() {
       firstSection.click();
    }
    public void clickOnSecondSection() {
        secondSection.click();
    }

    public void clickOnThirdSection() {
        thirdSection.click();
    }

    public void clickOnForthSection() {
       forthSection.click();
    }

    public boolean isOpenTheFirstSection() {
        if (firstSection.getAttribute("aria-selected") == "false") {
            return false;
        }
        return true;
    }

    public boolean isCloseTheFirstSection() {
        if (firstSection.getAttribute("aria-selected") == "true") {
            return false;
        }
        return true;
    }

    public boolean isOpenTheSecondSection() {
        if (secondSection.getAttribute("aria-selected") == "false") {
            return false;
        }
        return true;
    }

}
