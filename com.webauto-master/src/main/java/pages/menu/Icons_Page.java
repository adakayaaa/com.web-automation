package pages.menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

public class Icons_Page extends BasePage {

	@FindBy(id = "ui-id-72")
	private WebElement saveButton;

	@FindBy(id = "ui-id-73")
	private WebElement zoomInButton;

	@FindBy(id = "ui-id-74")
	private WebElement zoomOutButton;

	@FindBy(id = "ui-id-76")
	private WebElement playbackButton;

	@FindBy(xpath = "//*[@id=\"menu-w-icons\"]/li[5]/ul")
	private WebElement playbackMenu;

	@FindBy(id = "ui-id-77")
	private WebElement prevButton;

	@FindBy(id = "ui-id-78")
	private WebElement stopButton;

	@FindBy(id = "ui-id-79")
	private WebElement playButton;

	@FindBy(id = "ui-id-80")
	private WebElement nextButton;

	@FindBy(id = "ui-id-81")
	private WebElement learnMoreAboutThisMenuButton;

	public void moveToItem(WebElement webElement) {
		BrowserUtils.moveToElement(webElement);
	}

	public boolean isDisplayedActiveMessage(WebElement webElement) {
		String message = webElement.getAttribute("class");
		return message.contains("active");

	}

	public boolean isDisplayedPlaybackItems() {
		return playbackMenu.isDisplayed();
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getZoomInButton() {
		return zoomInButton;
	}

	public WebElement getZoomOutButton() {
		return zoomOutButton;
	}

	public WebElement getPlaybackButton() {
		return playbackButton;
	}

	public WebElement getPrevButton() {
		return prevButton;
	}

	public WebElement getStopButton() {
		return stopButton;
	}

	public WebElement getPlayButton() {
		return playButton;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getLearnMoreAboutThisMenuButton() {
		return learnMoreAboutThisMenuButton;
	}

}
