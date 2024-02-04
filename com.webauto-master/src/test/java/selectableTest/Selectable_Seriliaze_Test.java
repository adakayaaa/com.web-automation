package selectableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.JSUtils;
import utils.Pages;

/*
 * 1. Open the browser and navigate to the page
 * 2. Click on Selectable button
 * 3. Click on Serialize button
 * 4. Click on Item 5
 * 5. Verify that Item 5 is selected
 * 6. Verify that "You've selected: #5" is displayed
 * 7. Click on Item 6
 * 8. Verify that Item 6 is selected
 * 9. Verify that "You've selected: #6" is displayed
 * 10. Click on Item 1, Item 3 by holding down the Ctrl key
 * 11. Verify that Item 1, Item 3 are selected
 * 12. Verify that "You've selected: #1 #3 #6" is displayed(6 selected because Item 6 is still selected)
 * 13. Click on Item 1, Item2, Item 3 by holding mouse down and dragging
 * 14. Verify that Item 1, Item 2, Item 3 are selected
 * 15. Verify that "You've selected: #1 #2 #3" is displayed
 */
public class Selectable_Seriliaze_Test extends Hooks {

	Pages pages = new Pages();

	@Test
	void testSelectableSeriliaze() {
		// 1. Open the browser and navigate to the URL
		pages.getHomePage().clickOnWebAutomationLink();

		// 2. Click on Selectable button
		pages.getWebAutomationPage().clickOnSelectableLink();

		// 3. Click on Serialize button
		pages.getWebAutomationPage().clickOnSerializeLink();

		// 4. Click on Item 5
		pages.getSelectableSeriliazePage().clickOnElementByIndex(5);

		// 5. Verify that Item 5 is selected
		Assertions.assertTrue(pages.getSelectableSeriliazePage().isTheItemSelectedByIndex(5),
				"The item is not selected!");

		// 6. Verify that "You've selected: #5" is displayed
		Assertions.assertTrue(pages.getSelectableSeriliazePage().isTheFeedBackAreaDisplayed(),
				"The feedback is not displayed!");

		JSUtils.executeJavaScript("window.scrollBy(0,300)");
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		// 7. Click on Item 6
		pages.getSelectableSeriliazePage().clickOnElementByIndex(6);

		// 8. Verify that Item 6 is selected
		Assertions.assertTrue(pages.getSelectableSeriliazePage().isTheItemSelectedByIndex(6),
				"The item is not selected!");

		// 9. Verify that "You've selected: #6" is displayed
		Assertions.assertTrue(
				pages.getSelectableSeriliazePage().isTheFeedBackAreaDisplayed()
						&& pages.getSelectableSeriliazePage().getSelectResult().getText().contains("#6"),
				"The feedback is not displayed!");

		// 10. Click on Item 1, Item 3 by holding down the Ctrl key
		pages.getSelectableSeriliazePage().clickOnElementsWithCtrl(1, 3);

		// 11. Verify that Item 1, Item 3 are selected
		Assertions.assertTrue(
				pages.getSelectableSeriliazePage().isTheItemSelectedByIndex(1)
						&& pages.getSelectableSeriliazePage().isTheItemSelectedByIndex(3),
				"The items are not selected");

		// 12. Verify that "You've selected: #1 #3 #6" is displayed(6 selected because
		// Item 6 is still selected)
		Assertions.assertTrue(
				pages.getSelectableSeriliazePage().isTheFeedBackAreaDisplayed()
						&& pages.getSelectableSeriliazePage().getSelectResult().getText().contains("#1 #3 #6"),
				"The feedback is not displayed!");

		// 13. Click on Item 1, Item2, Item 3 by holding mouse down and dragging
		pages.getSelectableSeriliazePage().clickOnElementsWithDraggingMouse(1, 2, 3);

		// 14. Verify that Item 1, Item 2, Item 3 are selected
		Assertions.assertTrue(
				pages.getSelectableSeriliazePage().isTheItemSelectedByIndex(1)
						&& pages.getSelectableSeriliazePage().isTheItemSelectedByIndex(2)
						&& pages.getSelectableSeriliazePage().isTheItemSelectedByIndex(3),
				"The items are not selected");

		// 15. Verify that "You've selected: #1 #2 #3" is displayed
		Assertions.assertTrue(
				pages.getSelectableSeriliazePage().isTheFeedBackAreaDisplayed()
						&& pages.getSelectableSeriliazePage().getSelectResult().getText().contains("#1 #2 #3"),
				"The feedback is not displayed!");

	}

}
