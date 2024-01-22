package pages.selectable;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Selectable_Seriliaze_Page extends BasePage {

	@FindBy(css = "#selectable-serialize > li")
	private List<WebElement> itemList;

	@FindBy(id = "feedback-serialize")
	private WebElement feedbackArea;

	@FindBy(id = "select-result")
	private WebElement selectResult;

	public void clickOnElementByIndex(int index) {
		itemList.get(index - 1).click();
	}

	public void clickOnElementsWithCtrl(int index1, int index2) {
		actions.keyDown(Keys.CONTROL)
			.click(itemList.get(index1 - 1))
			.click(itemList.get(index2 - 1))
			.keyUp(Keys.CONTROL)
			.build()
			.perform();
	}

	public void clickOnElementsWithDraggingMouse(int index1, int index2, int index3) {
		actions.clickAndHold(itemList.get(index1 - 1))
			.moveToElement(itemList.get(index2 - 1))
			.moveToElement(itemList.get(index3 - 1))
			.release()
			.build()
			.perform();
	}

	public boolean isTheItemSelectedByIndex(int index) {
		boolean isSelected = itemList.get(index - 1).getAttribute("class").contains("ui-selected");
		return isSelected;
	}

	public boolean isTheFeedBackAreaDisplayed() {
		boolean isDisplayed = feedbackArea.isDisplayed();
		return isDisplayed;
	}

	public WebElement getSelectResult() {
		return selectResult;
	}

}
