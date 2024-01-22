package datepickerTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Pages;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. Open the browser and navigate to the page
 * 2. Click on the Datepicker button
 * 3. Click on the select date range button
 * 4. Click on the "from" field
 * 5. Verify that three months is displayed
 * 6. Select the February on dropdown
 * 7. Verify that the months(March,April) is displayed.
 * 8. Click on the first day in February.
 * 9. Verify that day is displayed on From Field.
 * 10.Click on the "to" field
 * 11.Verify the "January" can not selectable on the dropdown.
 * 12.Click on the next button
 * 13.Click on the third day on May.
 * 14.Verify that day is displayed on "To" Field.
 */

public class SelectDateRange_Test extends Hooks {

	Pages pages = new Pages();

	@Test
	void testSelectDateRange() {

		// 1. Open the browser and navigate to the page
		pages.getHomePage().clickOnWebAutomationLink();

		// 2. Click on the Datepicker button
		pages.getWebAutomationPage().clickOnDatepicker();

		// 3. Click on the select date range button
		pages.getWebAutomationPage().clickOnSelectDateRange();

		// 4. Click on the "from" field
		pages.getSelectDateRange().clickOnButton(pages.getSelectDateRange().getFromField());

		// 5. Verify that three months is displayed
		boolean isDisplayedThreeMonths = pages.getSelectDateRange().isDisplayedThreeMonths();
		Assertions.assertTrue(isDisplayedThreeMonths, "The three months is not displayed!");

		// 6. Select the February on dropdown
		pages.getSelectDateRange().selectMonth(1);

		// 7. Verify the months(March,April) is displayed.
		List<String> threeMonthsActual = pages.getSelectDateRange().threeMonthsName();
		List<String> threeMonthsExpected = new ArrayList<>();
		threeMonthsExpected.add("March");
		threeMonthsExpected.add("April");

		for (int i = 0; i < threeMonthsActual.size(); i++) {
			Assertions.assertEquals(threeMonthsExpected.get(i), threeMonthsActual.get(i), "Next months are not true!");
		}

		// 8. Click on the first day in February.
		pages.getSelectDateRange().clickOnFirstDay(1);

		// 9. Verify that day is displayed on "From" Field.
		String actual = pages.getSelectDateRange().getValueOnTheDateField(pages.getSelectDateRange().getFromField());
		String expected = "02/01/2024";
		Assertions.assertEquals(expected, actual, "The day is not true!");

		// 10.Click on the "to" field
		pages.getSelectDateRange().clickOnButton(pages.getSelectDateRange().getToField());

		// 11.Verify the "January" can not selectable on the dropdown.
		boolean isSelectedToUnselectableMonth = pages.getSelectDateRange().isSelectedTheUnselectableDay("Jan");
		Assertions.assertTrue(isSelectedToUnselectableMonth, "The months can be selected!");

		// 12.Click on the next button
		pages.getSelectDateRange().clickOnButton(pages.getSelectDateRange().getNextButton());

		// 13.Click on the third day on May.
		pages.getSelectDateRange().clickOnThirdDay(3);

		// 14.Verify that day is displayed on "To" Field.
		String actual2 = pages.getSelectDateRange().getValueOnTheDateField(pages.getSelectDateRange().getToField());
		String expected2 = "05/03/2024";
		Assertions.assertEquals(expected2, actual2, "The day is not true!");

	}

}
