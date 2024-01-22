package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ConstrainMovement_Page extends BasePage {

	@FindBy(id = "draggable5")
	private WebElement firstElement;

	@FindBy(id = "draggable6")
	private WebElement secondElement;

	@FindBy(id = "draggable7")
	private WebElement thirdElement;

	@FindBy(id = "draggable8")
	private WebElement forthElement;

	@FindBy(id = "containment-wrapper")
	private WebElement bigBoxElement;

	@FindBy(xpath = "//div[@id=\"containment-wrapper\"]/div[2]")
	private WebElement smallBoxElement;

	public void dragAndDrop() {
		actions.dragAndDropBy(firstElement, 10, 10).perform();
	}

	public void dragAndDropByOffSets(int xOffset, int yOffset, WebElement webElement) {
		actions.dragAndDropBy(webElement, xOffset, yOffset).perform();
	}

	public int getLocationOfDraggableX(WebElement webElement) {
		return webElement.getLocation().getX();
	}

	public int getLocationOfDraggableY(WebElement webElement) {
		return webElement.getLocation().getY();
	}

	public WebElement getFirstElement() {
		return firstElement;
	}

	public WebElement getSecondElement() {
		return secondElement;
	}

	public WebElement getThirdElement() {
		return thirdElement;
	}

	public WebElement getForthElement() {
		return forthElement;
	}

	public WebElement getBigBoxElement() {
		return bigBoxElement;
	}

	public WebElement getSmallBoxElement() {
		return smallBoxElement;
	}

}
