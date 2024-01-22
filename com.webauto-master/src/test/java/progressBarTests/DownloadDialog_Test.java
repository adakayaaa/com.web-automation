package progressBarTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.JSUtils;
import utils.Pages;

/*
 * 1. Open the browser and navigate to the page
 * 2. Click on the Progress Bar button
 * 3. Click on the Download Dialog button
 * 4. Click on the Start Download button.
 * 5. Verify that download is started.
 * 6. Click on the Cancel Download button.
 * 7. Verify that download is cancelled.
 * 8. Click on the Start Download button again.
 * 9. Click on the Close button.
 * 10.Verify that download is closed.
 */

public class DownloadDialog_Test extends Hooks {

	Pages pages = new Pages();

	@Test
	void testDownloadDialog() throws InterruptedException {
		// 1. Open the browser and navigate to the page
		pages.getHomePage().clickOnWebAutomationLink();

		BrowserUtils.scrollDownWithPageDown();

		// 2. Click on the Progress Bar button
		pages.getWebAutomationPage().clickOnProgressBarLink();

		BrowserUtils.scrollUpWithPageUp();

		// 3. Click on the Download Dialog button
		pages.getWebAutomationPage().clickOnDownloadDialogLink();

		// 4. Click on the Start Download button.
		pages.getDownloadDialogPage().clickOnButton(pages.getDownloadDialogPage().getDownloadButton());

		// 5. Verify that download is started.
		boolean isDownloadStarted = pages.getDownloadDialogPage().isFileDownloadBarTitleDisplayed();
		Assertions.assertTrue(isDownloadStarted, "The download is not started!");

		JSUtils.executeJavaScript("window.scrollBy(0,100)");
		Thread.sleep(1000);

		// 6. Click on the Cancel Download button.
		pages.getDownloadDialogPage().clickOnButton(pages.getDownloadDialogPage().getCancelDownloadButton());

		// 7. Verify that download is cancelled.
		String startDownloadButtonText = pages.getDownloadDialogPage().getDownloadButtonText();
		Assertions.assertEquals(startDownloadButtonText, "Start Download", "The download is not cancelled!");

		// 8. Click on the Start Download button again.
		pages.getDownloadDialogPage().clickOnButton(pages.getDownloadDialogPage().getDownloadButton());

		// 9. Click on the Close button.
		pages.getDownloadDialogPage().clickOnButton(pages.getDownloadDialogPage().getCloseButton());

		// 10.Verify that download is closed.
		String startDownloadButtonText2 = pages.getDownloadDialogPage().getDownloadButtonText();
		Assertions.assertEquals(startDownloadButtonText2, "Start Download", "The download is not closed!");

	}

}
