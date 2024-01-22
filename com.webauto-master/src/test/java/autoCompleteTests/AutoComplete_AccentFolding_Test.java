package autoCompleteTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Pages;

/*
 * 1. Open the browser and navigate to the page
 * 2. Click on the auto complete button
 * 3.Click on the accept folding button
 * 4. Enter "Jo" in the text field
 * 5. Verify that the suggestion menu is displayed
 * 6. Verify that the suggestion menu equals "John" and "Jörn"
 * 7. Clear the text field
 * 8. Enter "Jö" in the text field
 * 9. Verify that the suggestion is just "Jörn"
 */

public class AutoComplete_AccentFolding_Test extends Hooks {

	Pages pages = new Pages();

	@Test
	void testAccentFolding() throws InterruptedException {
		// 1. Open the browser and navigate to the page
		pages.getHomePage().clickOnWebAutomationLink();

		// 2. Click on the auto complete button
		pages.getWebAutomationPage().clickOnAutoCompleteLink();

		// 3. Click on the accept folding button
		pages.getWebAutomationPage().clickOnAccentFoldingLink();

		// 4. Enter "Jo" in the text field
		pages.getAccentFoldingPage().sendToKeys("Jo");

		// 5. Verify that the suggestion menu is displayed
		boolean isDisplayed = pages.getAccentFoldingPage().isDisplayedForSuggestionMenu();
		Assertions.assertTrue(isDisplayed, "The suggestion menu is not displayed");

		Thread.sleep(2000);

		// 6. Verify that the suggestion menu contains "John" and "Jörn"
		boolean check = true;
		for (String s : pages.getAccentFoldingPage().getDeveloperNameOnSuggestionMenu()) {
			if (!(s.startsWith("John") || s.startsWith("Jörn"))) {
				check = false;
				break;
			}
		}
		Assertions.assertTrue(check, "The suggestion menu doesn't contain John and Jörn");

		// 7. Clear the text field
		pages.getAccentFoldingPage().clearDeveloperInputField();

		// 8. Enter "Jö" in the text field
		pages.getAccentFoldingPage().sendToKeys("Jö");
		Thread.sleep(2000);

		// 9. Verify that the suggestion is just "Jörn"
		boolean check2 = true;
		for (String s : pages.getAccentFoldingPage().getDeveloperNameOnSuggestionMenu()) {
			if (!s.contains("Jörn")) {
				System.out.println(s);
				check2 = false;
				break;
			}
		}
		Assertions.assertTrue(check2, "The suggestion menu doesn't just contains Jörn");

	}

}
