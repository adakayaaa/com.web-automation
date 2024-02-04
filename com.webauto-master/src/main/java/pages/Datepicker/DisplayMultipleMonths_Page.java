package pages.datePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class DisplayMultipleMonths_Page extends BasePage {

    @FindBy(id = "datepicker-multiple-months")
    private WebElement dateField;

    @FindBy(xpath = "//a[@class=\"ui-datepicker-prev ui-corner-all\"]")
    private WebElement prevButton;

    @FindBy(xpath = "//a[@class=\"ui-datepicker-next ui-corner-all\"]")
    private WebElement nextButton;

    @FindBy(xpath = "//span[@class=\"ui-datepicker-month\"]")
    private List<WebElement> monthsList;

    @FindBy(xpath = "//td[contains(@class,\"ui-datepicker-today\")]")
    private WebElement today;

    public boolean getValueOnTheDateField() {
        return !(dateField.getAttribute("value").isEmpty());
    }

    public boolean isDisplayedThreeMonths() {
        List<String> listOfMonthsOfNames = monthsList.stream().map(WebElement::getText).toList();
        return listOfMonthsOfNames.size() == 3;
    }

    public List<String> threeMonthsName() {
        List<String> listOfMonthsOfNames = monthsList.stream().map(WebElement::getText).toList();
        return listOfMonthsOfNames;
    }
    public String getThisMonthName() {
        return today.findElement(By.xpath("../../../..//div//div//span[@class='ui-datepicker-month']")).getText();
    }
    public List<String> getThreeMonthsExcepted() {
        List<java.lang.String> threeMonthsName = new ArrayList<>();
        List<java.lang.String> threeMonthsNameExpected = new ArrayList<>();

        threeMonthsName.add("January");
        threeMonthsName.add("February");
        threeMonthsName.add("March");
        threeMonthsName.add("April");
        threeMonthsName.add("May");
        threeMonthsName.add("June");
        threeMonthsName.add("July");
        threeMonthsName.add("August");
        threeMonthsName.add("September");
        threeMonthsName.add("October");
        threeMonthsName.add("November");
        threeMonthsName.add("December");

        for (int i = threeMonthsName.indexOf(getThisMonthName()); i < threeMonthsName.indexOf(getThisMonthName()) + 3; i++) {
            if (threeMonthsName.get(i).equals("November")) {
                threeMonthsNameExpected.add("November");
                threeMonthsNameExpected.add("December");
                threeMonthsNameExpected.add("January");
            } else if (threeMonthsName.get(i).equals("December")) {
                threeMonthsNameExpected.add("December");
                threeMonthsNameExpected.add("January");
                threeMonthsNameExpected.add("February");
            } else {
                threeMonthsNameExpected.add(threeMonthsName.get(i));
            }
        }
        return threeMonthsNameExpected;
    }

    public void clickOnDateField() {
        dateField.click();
    }

    public void clickOnPrevButton() {
        prevButton.click();
    }

    public void clickOnNextButton() {
        nextButton.click();
    }

    public void clickOnToday() {
        today.click();
    }





}
