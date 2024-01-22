package droppableTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import utils.Pages;

/*
 * 1. Open the browser and navigate to the page
 * 2. click on the droppable button
 * 3. click
 * on the revert draggable position button
 * 4. Drag the first draggable element and drop it to the target-droppable element
 * 5. Verify that the text of the target-droppable element has changed to Dropped!
 * 6. Verify that the first draggable element has not been dropped to the target-droppable element
 * 7. Drag the second draggable element and drop it to the target-droppable element
 * 8. Verify that the second draggable element has been dropped to the target-droppable element
 * 9. Verify that the text of the target-droppable element has changed to Dropped!
 */

public class Droppable_RevertDraggablePosition_Test extends Hooks {

	Pages pages = new Pages();

	@Test
	void testRevertDraggablePosition() throws InterruptedException {
		SoftAssertions softAssertions = new SoftAssertions();
		// 1. Open the browser and navigate to the page
		pages.getHomePage().clickOnWebAutomationLink();

		// 2. click on the droppable button
		pages.getWebAutomationPage().clickOnDroppableLink();

		// 3. click on the revert draggable position button
		pages.getWebAutomationPage().clickOnDroppableRevertDraggablePositionLink();

		// get the initial location of the first element
		int initialXForFirstElement = pages.getDroppableRevertDraggablePositionPage()
			.getLocationOfDraggableX(pages.getDroppableRevertDraggablePositionPage().getFirstElement());
		int initialYForFirstElement = pages.getDroppableRevertDraggablePositionPage()
			.getLocationOfDraggableY(pages.getDroppableRevertDraggablePositionPage().getFirstElement());

		// 4. Drag the first draggable element and drop it to the target-droppable element
		pages.getDroppableRevertDraggablePositionPage()
			.dragAndDrop(pages.getDroppableRevertDraggablePositionPage().getFirstElement());

		// 5. Verify that the first draggable element has been dropped to the
		// target-droppable element
		Assertions.assertThat(pages.getDroppableRevertDraggablePositionPage().getDroppableElementText())
			.isEqualTo("Dropped!");

		Thread.sleep(3000);
		// get the final location of the first element
		int finalXForFirstElement = pages.getDroppableRevertDraggablePositionPage()
			.getLocationOfDraggableX(pages.getDroppableRevertDraggablePositionPage().getFirstElement());
		int finalYForFirstElement = pages.getDroppableRevertDraggablePositionPage()
			.getLocationOfDraggableY(pages.getDroppableRevertDraggablePositionPage().getFirstElement());

		// 6. Verify that the first draggable element has not been dropped to the
		// target-droppable element
		softAssertions.assertThat(finalXForFirstElement - initialXForFirstElement).isEqualTo(0);
		softAssertions.assertThat(finalYForFirstElement - initialYForFirstElement).isEqualTo(0);

		// 7. Drag the second draggable element and drop it to the target-droppable
		// element
		pages.getDroppableRevertDraggablePositionPage()
			.dragAndDrop(pages.getDroppableRevertDraggablePositionPage().getSecondElement());

		// 8. Verify that the second draggable element has been dropped to the
		// target-droppable element
		// find the second element edges
		int secondDraggableElementTopEdge = pages.getDroppableRevertDraggablePositionPage()
			.getDraggableElementTopEdge(pages.getDroppableRevertDraggablePositionPage().getSecondElement());
		int secondDraggableElementBottomEdge = pages.getDroppableRevertDraggablePositionPage()
			.getDraggableElementBottomEdge(pages.getDroppableRevertDraggablePositionPage().getSecondElement());
		int secondDraggableElementRightEdge = pages.getDroppableRevertDraggablePositionPage()
			.getDraggableElementRightEdge(pages.getDroppableRevertDraggablePositionPage().getSecondElement());
		int secondDraggableElementLeftEdge = pages.getDroppableRevertDraggablePositionPage()
			.getDraggableElementLeftEdge(pages.getDroppableRevertDraggablePositionPage().getSecondElement());

		// find the droppable element edges
		int droppableElementTopEdge = pages.getDroppableRevertDraggablePositionPage().getDroppableElementTopEdge();
		int droppableElementBottomEdge = pages.getDroppableRevertDraggablePositionPage()
			.getDroppableElementBottomEdge();
		int droppableElementRightEdge = pages.getDroppableRevertDraggablePositionPage().getDroppableElementRightEdge();
		int droppableElementLeftEdge = pages.getDroppableRevertDraggablePositionPage().getDroppableElementLeftEdge();

		Assertions.assertThat(secondDraggableElementBottomEdge)
			.isBetween(droppableElementTopEdge, droppableElementBottomEdge);
		Assertions.assertThat(secondDraggableElementTopEdge)
			.isBetween(droppableElementTopEdge, droppableElementBottomEdge);
		Assertions.assertThat(secondDraggableElementLeftEdge)
			.isBetween(droppableElementLeftEdge, droppableElementRightEdge);
		Assertions.assertThat(secondDraggableElementRightEdge)
			.isBetween(droppableElementLeftEdge, droppableElementRightEdge);

		// 9. Verify that the text of the target-droppable element has changed to Dropped!
		Assertions.assertThat(pages.getDroppableRevertDraggablePositionPage().getDroppableElementText())
			.isEqualTo("Dropped!");

		softAssertions.assertAll();
	}

}
