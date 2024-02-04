package datepickerTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
 * 1. Open the browser and navigate to the page
 * 2. Click on the Datepicker button
 * 3. Click on the display multiple months button
 * 4. Click on the date field
 * 5. Verify that three months is displayed
 * 6. Click on the next button
 * 7. Verify that three months is displayed
 * 8. Click on the prev button
 * 9. Verify that three months is displayed
 * 10.Verify the three months is sorted
 * 11.Click on today
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
		pages.getDisplayMultipleMonthsPage().clickOnDateField();

		// 5. Verify that three months is displayed
		boolean isDisplayedThreeMonths = pages.getDisplayMultipleMonthsPage().isDisplayedThreeMonths();
		Assertions.assertTrue(isDisplayedThreeMonths, "The three months are not displayed!");

		BrowserUtils.wait(1);

		// 6.Click on the next button
		pages.getDisplayMultipleMonthsPage().clickOnNextButton();

		// 7.Verify that three months is displayed
		boolean isDisplayedThreeMonthsBeforeClickOnNextButton = pages.getDisplayMultipleMonthsPage()
				.isDisplayedThreeMonths();
		Assertions.assertTrue(isDisplayedThreeMonthsBeforeClickOnNextButton,
				"The three months are not displayed before click on next button!");

		// 8.Click on the prev button
		pages.getDisplayMultipleMonthsPage().clickOnPrevButton();

		// 9.Verify that three months is displayed
		boolean isDisplayedThreeMonthsBeforeClickOnPrevButton = pages.getDisplayMultipleMonthsPage()
				.isDisplayedThreeMonths();
		Assertions.assertTrue(isDisplayedThreeMonthsBeforeClickOnPrevButton,
				"The three months are not displayed before click on prev button!");
		BrowserUtils.wait(1);

		//10. Verify the three months is sorted
		for (int i = 0; i < pages.getDisplayMultipleMonthsPage().threeMonthsName().size(); i++) {
			Assertions.assertEquals(pages.getDisplayMultipleMonthsPage().getThreeMonthsExcepted().get(i),pages.getDisplayMultipleMonthsPage().threeMonthsName().get(i),"The months are not sorted!");
		}
		// 11.Click on today
		pages.getDisplayMultipleMonthsPage().clickOnToday();

		// 12.Verify that day is displayed on Date Field
		Assertions.assertTrue(pages.getDisplayMultipleMonthsPage().getValueOnTheDateField(),"The day is not selected!");

	}

}
