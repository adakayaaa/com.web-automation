package datepickerTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. Open the browser and navigate to the page
 * 2. Click on the Datepicker button
 * 3. Click on the display multiple months button
 * 4. Click on the date field 5. Verify that three months is displayed
 * 6. Click on the next button
 * 7. Verify the three months is sorted
 * 8. Verify that three months is displayed
 * 9. Click on the prev button 10.Verify that three months is displayed
 * 11.Click on First Day in February
 * 12.Verify that day is displayed on Date Field
 */

public class DisplayMultipleMonths_Test extends Hooks {

	Pages pages = new Pages();

	@Test
	void testDisplayMultipleMonths() {
		// 1. Open the browser and navigate to the page
		pages.getHomePage().clickOnWebAutomationLink();

		// 2. Click on the Datepicker button
		pages.getWebAutomationPage().clickOnDatepicker();

		// 3. Click on the display multiple months button
		pages.getWebAutomationPage().clickOnDisplayMultipleMonths();

		// 4. Click on the date field
		pages.getDisplayMultipleMonthsPage().getDateField().click();

		// 5. Verify that three months is displayed
		boolean isDisplayedThreeMonths = pages.getDisplayMultipleMonthsPage().isDisplayedThreeMonths();
		Assertions.assertTrue(isDisplayedThreeMonths, "The three months are not displayed!");

		// 6.Click on the next button
		pages.getDisplayMultipleMonthsPage().getNextButton().click();

		// 7.Verify the three months is sorted
		List<String> threeMonthsNameActual = pages.getDisplayMultipleMonthsPage().threeMonthsName();
		List<String> threeMonthsNameExpected = new ArrayList<>();
		threeMonthsNameExpected.add("February");
		threeMonthsNameExpected.add("March");
		threeMonthsNameExpected.add("April");
		for (int i = 0; i < threeMonthsNameActual.size(); i++) {
			Assertions.assertEquals(threeMonthsNameExpected.get(i), threeMonthsNameActual.get(i),
					"These months is not sorted!");
		}

		// 8.Verify that three months is displayed
		boolean isDisplayedThreeMonthsBeforeClickOnNextButton = pages.getDisplayMultipleMonthsPage()
			.isDisplayedThreeMonths();
		Assertions.assertTrue(isDisplayedThreeMonthsBeforeClickOnNextButton,
				"The three months are not displayed before click on next button!");

		// 9.Click on the prev button
		pages.getDisplayMultipleMonthsPage().getPrevButton().click();

		// 10.Verify that three months is displayed
		boolean isDisplayedThreeMonthsBeforeClickOnPrevButton = pages.getDisplayMultipleMonthsPage()
			.isDisplayedThreeMonths();
		Assertions.assertTrue(isDisplayedThreeMonthsBeforeClickOnPrevButton,
				"The three months are not displayed before click on prev button!");
		BrowserUtils.wait(1);

		// 11.Click on First Day in February
		pages.getDisplayMultipleMonthsPage().getDay().click();
		BrowserUtils.wait(1);

		// 12.Verify that day is displayed on Date Field
		String dayOnDateField = pages.getDisplayMultipleMonthsPage().getValueOnTheDateField();
		Assertions.assertEquals("02/01/2024", dayOnDateField, "These days are not same!");

	}

}
