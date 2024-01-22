package pages.Datepicker;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

import java.util.List;

public class SelectDateRange extends BasePage {

	@FindBy(id = "from-selectDateRange")
	private WebElement fromField;

	@FindBy(id = "to-selectDateRange")
	private WebElement toField;

	@FindBy(xpath = "//select[@class=\"ui-datepicker-month\"]")
	private WebElement selectMonth;

	@FindBy(xpath = "//span[@class=\"ui-datepicker-month\"]")
	private List<WebElement> monthTitle;

	@FindBy(xpath = "//a[@title=\"Next\"]")
	private WebElement nextButton;

	@FindBy(xpath = "//a[@title=\"Prev\"]")
	private WebElement prevButton;

	@FindBy(xpath = "(//a[@data-date=\"3\"])")
	private List<WebElement> day3th;

	@FindBy(xpath = "//a[@data-date=\"1\"]")
	private List<WebElement> day1th;

	public String getValueOnTheDateField(WebElement webElement) {
		return webElement.getAttribute("value");
	}

	public void selectMonth(int month) {
		Select monthDropdown = new Select(selectMonth);
		monthDropdown.selectByIndex(month);
	}

	public boolean isDisplayedThreeMonths() {
		List<String> listOfMonthsOfNames = monthTitle.stream().map(WebElement::getText).toList();
		return listOfMonthsOfNames.size() == 2;
	}

	public List<String> threeMonthsName() {
		List<String> listOfMonthsOfNames = monthTitle.stream().map(WebElement::getText).toList();
		return listOfMonthsOfNames;
	}

	public void clickOnButton(WebElement element) {
		element.click();
	}

	public void clickOnThirdDay(int countOfMonth) {
		day3th.get(countOfMonth - 1).click();

	}

	public void clickOnFirstDay(int countOfTheMonth) {
		day1th.get(countOfTheMonth - 1).click();
	}

	public boolean isSelectedTheUnselectableDay(String month) {
		Select monthDropdown = new Select(selectMonth);
		if (monthDropdown.equals(month)) {
			return false;
		}
		return true;
	}

	public WebElement getFromField() {
		return fromField;
	}

	public WebElement getToField() {
		return toField;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getPrevButton() {
		return prevButton;
	}

}
