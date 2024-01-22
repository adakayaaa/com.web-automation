package autoCompleteTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Pages;

/*
 * 1. Open the browser and navigate to the page
 * 2. Click on the auto complete button
 * 3.Click on the multiple and remote button
 * 4. Enter "s" in the text field
 * 5. Verify that the suggestion menu is not displayed
 * 6. Clear the text field
 * 7. Enter "sp" in the text field
 * 8. Verify that "Loading suggestions..." message is displayed
 * 9. Verify that the suggestion menu is displayed
 * 10.Verify that the suggestions in the menu starts with sp(suggestions can be more than one)
 */
public class AutoComplete_MultipleAndRemote_Test extends Hooks {

	Pages pages = new Pages();

	@Test
	void testMultipleAndRemote() {
		// 1. Open the browser and navigate to the page
		pages.getHomePage().clickOnWebAutomationLink();

		// 2.click on the auto complete button
		pages.getWebAutomationPage().clickOnAutoCompleteLink();

		// 3. click on the multiple and remote button
		pages.getWebAutomationPage().clickOnMultipleAndRemoteLink();

		// 4. Enter "s" in the text field
		pages.getMultipleAndRemotePage().sendToBirdNames("s");

		// 5. Verify that the suggestion menu is not displayed
		boolean isDisplayed = pages.getMultipleAndRemotePage().isDisplayedForSuggestionMenu();
		Assertions.assertFalse(isDisplayed, "The suggestion menu shouldn't displayed");

		// 6. Clear the text field
		pages.getMultipleAndRemotePage().clearTextField();

		// 7. Enter "sp" in the text field
		pages.getMultipleAndRemotePage().sendToBirdNames("sp");

		// 8. Verify that "Loading suggestions..." message is displayed
		String loadingMessage = pages.getMultipleAndRemotePage().getSuggestionLoadingMessage();
		Assertions.assertEquals("Loading suggestions...", loadingMessage, "The loading message is not displayed");

		// 9. Verify that the suggestion menu is displayed
		boolean isDisplayed2 = pages.getMultipleAndRemotePage().isDisplayedForSuggestionMenu();
		Assertions.assertTrue(isDisplayed2, "The suggestion menu should displayed");

		// 10.Verify that the suggestions in the menu starts with sp(suggestions can be
		// more than one)
		boolean check = true;
		for (String s : pages.getMultipleAndRemotePage().getBirdNamesOnSuggestionMenu()) {
			s = s.toLowerCase();
			if (!s.startsWith("sp")) {
				check = false;
				break;
			}
		}
		Assertions.assertTrue(check, "The suggestions are not starting with sp");

	}

}
