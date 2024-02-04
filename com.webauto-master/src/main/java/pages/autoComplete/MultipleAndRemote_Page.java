package pages.autoComplete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;
import java.util.stream.Stream;

public class MultipleAndRemote_Page extends BasePage {

	@FindBy(id = "tags-multipleremotes")
	private WebElement birdNamesInputField;

	@FindBy(xpath = "//input[@id='tags-multipleremotes']/../span")
	private WebElement suggestionLoadingMessage;

	@FindBy(css = "#ui-id-43 > li > div")
	private List<WebElement> suggestionMenu;

	public void sendToBirdNames(String str) {
		birdNamesInputField.sendKeys(str);
	}

	public String getSuggestionLoadingMessage() {
		return suggestionLoadingMessage.getText();
	}

	public Stream<String> getBirdNamesOnSuggestionMenu() {
		return suggestionMenu.stream().map(WebElement::getText);
	}

	public boolean isDisplayedForSuggestionMenu() {
		return suggestionMenu.size() > 0;
	}

	public void clearTextField() {
		birdNamesInputField.clear();
	}

}
