package pages.Datepicker;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

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

	@FindBy(xpath = "/html[1]/body[1]/div[8]/div[2]/table[1]/tbody[1]/tr[1]/td[5]")
	private WebElement day;

	public String getValueOnTheDateField() {
		return dateField.getAttribute("value");
	}

	public boolean isDisplayedThreeMonths() {
		List<String> listOfMonthsOfNames = monthsList.stream().map(WebElement::getText).toList();
		return listOfMonthsOfNames.size() == 3;
	}

	public List<String> threeMonthsName() {
		List<String> listOfMonthsOfNames = monthsList.stream().map(WebElement::getText).toList();
		return listOfMonthsOfNames;
	}

	public WebElement getDateField() {
		return dateField;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getPrevButton() {
		return prevButton;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

}
