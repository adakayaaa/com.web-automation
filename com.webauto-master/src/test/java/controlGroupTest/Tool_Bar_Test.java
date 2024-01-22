package controlGroupTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Driver;
import utils.Pages;

import java.util.Set;
/*
 * 1. Open the browser and navigate to the page
 * 2. Click on the Control Group button
 * 3. Click on the ToolBar button
 * 4. Select 150% on the zoom
 * 5. Select green on the highlight
 * 6. Select purple on the color
 * 7. Verify that selects are displayed on the text area
 * 8. Click on the bold button
 * 9. Verify that the bold font-weight is displayed on the text area
 * 10.Click on  italic button
 * 11.Verify that the italic font-style is displayed on the text area
 * 12.Click on the underline button
 * 13.Verify that the underline is displayed on the text area
 * 14.Click on the print button
 * 15.Verify that new tab is open.
 */
public class Tool_Bar_Test extends Hooks {

	Pages pages = new Pages();

	@Test
	void testToolBar() {

		//1. Open the browser and navigate to the page
		pages.getHomePage().clickOnWebAutomationLink();

		//2. Click on the Control Group button
		pages.getWebAutomationPage().clickOnControlGroupLink();

		//3. Click on the ToolBar button
		pages.getWebAutomationPage().clickOnToolBarLink();

		//4. Select 150% on the zoom
		//5. Select green on the highlight
		//6. Select purple on the color

		String[] stylesOfText = { "150%", "Green", "Purple" };
		pages.getToolBarPage().selectTheDropDownElement(stylesOfText);

		BrowserUtils.wait(2);

		//7. Verify that selects are displayed on the text area
		boolean isCorrectStyleOfTextArea = true;
		if (!((pages.getToolBarPage().getTextOfTextArea().contains("zoom: 150%"))
				&& (pages.getToolBarPage().getTextOfTextArea().contains("color: purple"))
				&& (pages.getToolBarPage().getTextOfTextArea().contains("background-color: green")))) {
			isCorrectStyleOfTextArea = false;
		}
		Assertions.assertTrue(isCorrectStyleOfTextArea, "The style of text area is wrong!");

		BrowserUtils.wait(1);

		//8. Click on the bold button
		pages.getToolBarPage().getBold().click();

		//9. Verify that the bold font-weight is displayed on the text area
		boolean actualForBold = pages.getToolBarPage().getTextOfTextArea().contains("font-weight: bold");
		Assertions.assertTrue(actualForBold, "Bold button is not clickable!");

		//10.Click on  italic button
		pages.getToolBarPage().getItalic().click();

		//11.Verify that the italic font-style is displayed on the text area
		boolean actualForItalic = pages.getToolBarPage().getTextOfTextArea().contains("font-style: italic");
		Assertions.assertTrue(actualForItalic, "Italic button is not clickable!");

		//12.Click on the underline button
		pages.getToolBarPage().getUnderline().click();

		//13.Verify that the underline is displayed on the text area
		boolean actualForUnderline = pages.getToolBarPage().getTextOfTextArea().contains("text-decoration: underline");
		Assertions.assertTrue(actualForUnderline, "Underline button is not clickable!");

		// TODO

		//14.Click on the print button
		//15.Verify that new tab is open.

		// String mainWindowHandle=Driver.getDriver().getWindowHandle();
		// pages.getToolBarPage().getPrint().click();
		// Set<String> windowHandles = Driver.getDriver().getWindowHandles();
		//
		// for (String windowHandle : windowHandles) {
		// if (!windowHandle.equals(mainWindowHandle)) {
		// Driver.getDriver().switchTo().window(windowHandle);
		// break;
		// }
		// }
		//
		// Assertions.assertEquals("Yazdır",pages.getToolBarPage().getTabPrintText(),"The
		// print button is not working!");
		// pages.getToolBarPage().getCancelPrint().click();
		// Driver.getDriver().switchTo().window(mainWindowHandle);

	}

}
