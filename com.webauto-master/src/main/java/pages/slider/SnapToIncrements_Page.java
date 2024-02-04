package pages.slider;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SnapToIncrements_Page extends BasePage {

    @FindBy(id = "amount-snap-to-increments")
    private WebElement donationAmountField;

    @FindBy(xpath = "//div[@id=\"slider-snap-to-increments\"]/span")
    private WebElement sliderTab;

    public int getDonationAmount(){
        String amount=donationAmountField.getAttribute("value");
        int donationAmount=Integer.parseInt(amount.substring(1));
        return donationAmount;
    }

    public void moveToSliderTab(int xOffSet){
        actions.moveToElement(sliderTab).clickAndHold().moveByOffset(xOffSet,0).release().perform();
    }


}
