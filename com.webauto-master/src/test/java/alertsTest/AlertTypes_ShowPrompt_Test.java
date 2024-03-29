package alertsTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

/*
 * 1. Open the browser and navigate to the page
 * 2. Click on the Alerts button
 * 3. Click on the Alert Types button
 * 4. Click on the Show Prompt button
 * 5. Verify that alert text is "Enter your name:"
 * 6. Enter input the alert "Ada Kaya"
 * 7. Confirm the first alert
 * 8. Verify that the input is displayed in alert area.
 * 9. Confirm the second alert
 */

public class AlertTypes_ShowPrompt_Test extends Hooks {

	Pages pages = new Pages();

	@Test
	void testShowPrompt() {
		// 1. Open the browser and navigate to the page
		pages.getHomePage().clickOnWebAutomationLink();

		BrowserUtils.scrollDownWithPageDown();

		// 2. Click on the Alerts button
		pages.getWebAutomationPage().clickOnAlertsLink();

		BrowserUtils.scrollUpWithPageUp();

		// 3. Click on the Alert Types button
		// 4. Click on the Show Prompt button
		pages.getAlertTypesPage().clickOnShowPromptButton();

		// 5. Verify that alert text is "Enter your name:"
		String expectedText = "Enter your name:";
		String actualText = pages.getAlertTypesPage().getTextOfTheAlert();
		Assertions.assertEquals(expectedText, actualText, "Wrong Text Prompted !");

		BrowserUtils.wait(1);

		// 6. Enter input the alert
		pages.getAlertTypesPage().enterInputIntoAlert("Ada Kaya");


		// 7. Confirm the first alert
		pages.getAlertTypesPage().confirmTheAlert();
		BrowserUtils.wait(1);

		// 8. Verify that the input is displayed in alert area.
		Assertions.assertTrue(pages.getAlertTypesPage().getTextOfTheAlert().contains("Ada Kaya"));

		// 9. Confirm the second alert
		pages.getAlertTypesPage().confirmTheAlert();

	}

}
