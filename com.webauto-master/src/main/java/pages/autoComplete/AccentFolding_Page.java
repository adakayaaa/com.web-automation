package pages.autoComplete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;
import java.util.stream.Stream;

public class AccentFolding_Page extends BasePage {

	@FindBy(id = "developer-accentFolding")
	private WebElement developerInputField;

	@FindBy(css = "#ui-id-40 > li >div")
	private List<WebElement> suggestionMenu;

	public void sendToKeys(String str) {
		developerInputField.sendKeys(str);
	}

	public void clearDeveloperInputField() {
		developerInputField.clear();
	}

	public Stream<String> getDeveloperNameOnSuggestionMenu() {
		return suggestionMenu.stream().map(WebElement::getText);
	}

	public boolean isDisplayedForSuggestionMenu() {
		return suggestionMenu.size() > 0;
	}

}
