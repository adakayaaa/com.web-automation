package pages.spinner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SpinnerOverflow_Page extends BasePage {
    @FindBy(id="spinner-overflow")
    private WebElement spinnerField;

    @FindBy(xpath = "(//a[@role=\"button\"])[12]")
    private WebElement upButton;

    @FindBy(xpath = "(//a[@role=\"button\"])[13]")
    private WebElement downButton;

    public String getValueOnSpinnerField(){
        return spinnerField.getAttribute("aria-valuenow");
    }

    public void clickOnUpButton(int count){
        for (int i = 0; i < count; i++) {
            upButton.click();
        }
    }

    public void clickOnDownButton(int count){
        for (int i = 0; i < count; i++) {
            downButton.click();
        }
    }


}
