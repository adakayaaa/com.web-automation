package draggableTests;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import utils.JSUtils;
import utils.Pages;

/*
 * 1. Open the browser and navigate to the page
 * 2. Click on the draggable button
 * 3. Click on the constrain movement button
 * 4. Drag the first element by 100 pixels to the right and by 100 pixels to the down
 * 5. Verify that the element has been dragged only vertically
 * 6. Drag the second element by 100 pixels to the right and by 100 pixels to the down
 * 7. Verify that the element has been dragged only horizontally
 * 8. Drag the third element by 100 pixels to the right and by 100 pixels to the down
 * 9. Verify that the element has been dragged within the box
 * 10.Drag the forth element by 100 pixels to the right and by 100 pixels to the down
 * 11.Verify that the element has been dragged within the small box
 */

public class Draggable_ConstrainMovement_Test extends Hooks {

	Pages pages = new Pages();

	@Test
	void testConstrainMovement() throws InterruptedException {
		SoftAssertions softAssertions = new SoftAssertions();
		// 1. Open the browser and navigate to the page
		pages.getHomePage().clickOnWebAutomationLink();

		// 2.Click on the draggable button
		pages.getWebAutomationPage().clickOnDraggableLink();

		// 3. Click on the constrain movement button
		pages.getWebAutomationPage().clickOnDraggableConstrainMovementLink();

		// get the initial location of the first element
		int initialXForFirstElement = pages.getConstrainMovementPage()
			.getLocationOfDraggableX(pages.getConstrainMovementPage().getFirstElement());
		int initialYForFirstElement = pages.getConstrainMovementPage()
			.getLocationOfDraggableY(pages.getConstrainMovementPage().getFirstElement());

		// 4. Drag the first element by 100 pixels to the right and by 100 pixels to the
		// down
		pages.getConstrainMovementPage()
			.dragAndDropByOffSets(100, 100, pages.getConstrainMovementPage().getFirstElement());

		// get the final location of the first element
		int finalXForFirstElement = pages.getConstrainMovementPage()
			.getLocationOfDraggableX(pages.getConstrainMovementPage().getFirstElement());
		int finalYForFirstElement = pages.getConstrainMovementPage()
			.getLocationOfDraggableY(pages.getConstrainMovementPage().getFirstElement());

		// 5. Verify that the element has been dragged only vertically
		Assertions.assertThat(finalYForFirstElement).isGreaterThan(initialYForFirstElement);
		Assertions.assertThat(finalXForFirstElement).isEqualTo(initialXForFirstElement);

		// get the initial location of the second element
		int initialXForSecondElement = pages.getConstrainMovementPage()
			.getLocationOfDraggableX(pages.getConstrainMovementPage().getSecondElement());
		int initialYForSecondElement = pages.getConstrainMovementPage()
			.getLocationOfDraggableY(pages.getConstrainMovementPage().getSecondElement());

		// 6. Drag the second element by 100 pixels to the right and by 100 pixels to the
		// down
		pages.getConstrainMovementPage()
			.dragAndDropByOffSets(100, 100, pages.getConstrainMovementPage().getSecondElement());

		// get the final location of the second element
		int finalXForSecondElement = pages.getConstrainMovementPage()
			.getLocationOfDraggableX(pages.getConstrainMovementPage().getSecondElement());
		int finalYForSecondElement = pages.getConstrainMovementPage()
			.getLocationOfDraggableY(pages.getConstrainMovementPage().getSecondElement());

		// 7.Verify that the element has been dragged only horizontally
		softAssertions.assertThat(finalXForSecondElement - initialXForSecondElement).isNotEqualTo(0);
		softAssertions.assertThat(finalYForSecondElement - initialYForSecondElement).isEqualTo(0);

		JSUtils.executeJavaScript("window.scrollBy(0,300)");
		Thread.sleep(1000);

		// get the initial location of the third element
		int initialXForThirdElement = pages.getConstrainMovementPage()
			.getLocationOfDraggableX(pages.getConstrainMovementPage().getThirdElement());
		int initialYForThirdElement = pages.getConstrainMovementPage()
			.getLocationOfDraggableY(pages.getConstrainMovementPage().getThirdElement());

		// 8. Drag the third element by 100 pixels to the right and by 100 pixels to the
		// down
		pages.getConstrainMovementPage()
			.dragAndDropByOffSets(-100, -100, pages.getConstrainMovementPage().getThirdElement());

		// get the final location of the third element
		int finalXForThirdElement = pages.getConstrainMovementPage()
			.getLocationOfDraggableX(pages.getConstrainMovementPage().getThirdElement());
		int finalYForThirdElement = pages.getConstrainMovementPage()
			.getLocationOfDraggableY(pages.getConstrainMovementPage().getThirdElement());

		int bigBoxXElement = pages.getConstrainMovementPage()
			.getLocationOfDraggableX(pages.getConstrainMovementPage().getBigBoxElement());
		int bigBoxYElement = pages.getConstrainMovementPage()
			.getLocationOfDraggableY(pages.getConstrainMovementPage().getBigBoxElement());

		// 9. Verify that the element has been dragged within the box
		Assertions.assertThat(bigBoxXElement).isLessThan(finalXForThirdElement);
		Assertions.assertThat(bigBoxYElement).isLessThan(finalYForThirdElement);

		// get the initial location of the forth element
		int initialXForForthElement = pages.getConstrainMovementPage()
			.getLocationOfDraggableX(pages.getConstrainMovementPage().getForthElement());
		int initialYForForthElement = pages.getConstrainMovementPage()
			.getLocationOfDraggableY(pages.getConstrainMovementPage().getForthElement());

		// 10.Drag the forth element by 100 pixels to the right and by 100 pixels to the
		// down
		pages.getConstrainMovementPage()
			.dragAndDropByOffSets(-100, -100, pages.getConstrainMovementPage().getForthElement());

		// get the final location of the forth element
		int finalXForForthElement = pages.getConstrainMovementPage()
			.getLocationOfDraggableX(pages.getConstrainMovementPage().getForthElement());
		int finalYForForthElement = pages.getConstrainMovementPage()
			.getLocationOfDraggableY(pages.getConstrainMovementPage().getForthElement());

		int smallBoxXElement = pages.getConstrainMovementPage()
			.getLocationOfDraggableX(pages.getConstrainMovementPage().getSmallBoxElement());
		int smallBoxYElement = pages.getConstrainMovementPage()
			.getLocationOfDraggableY(pages.getConstrainMovementPage().getSmallBoxElement());

		// 11.Verify that the element has been dragged within the small box
		Assertions.assertThat(smallBoxXElement).isLessThan(finalXForForthElement);
		Assertions.assertThat(smallBoxYElement).isLessThan(finalYForForthElement);

		softAssertions.assertAll();

	}

}
