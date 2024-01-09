package droppableTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Pages;

/**
 * 1. Open the browser and navigate to the page
 * 2. click on the droppable button
 * 3. click on the accept button
 * 4. Drag the first draggable element and drop it to the target-droppable element
 * 5. Verify that the first draggable element has not been dropped to the target-droppable element
 * 6. Drag the second draggable element and drop it to the target-droppable element
 * 7. Verify that the second draggable element has been dropped to the target-droppable element
 * 8. Verify that the text of the target-droppable element has changed to Dropped!
 */

public class Droppable_Accept_Test extends Hooks {
    Pages pages=new Pages();

    @Test
    void testAccept(){
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. click on the droppable button
        pages.getWebAutomationPage().clickOnDroppableLink();

        //3. click on the accept button
        pages.getWebAutomationPage().clickOnDroppableAcceptLink();

        //4. Drag the first draggable element and drop it to the target-droppable element
        pages.getDroppableAcceptPage().dragAndDrop(pages.getDroppableAcceptPage().getDraggableFirstElement());

        //5. Verify that the first draggable element has not been dropped to the target-droppable element
        Assertions.assertThat(pages.getDroppableAcceptPage().getDroppableElementText()).isEqualTo("accept: '#draggable'");

        // 6. Drag the second draggable element and drop it to the target-droppable element
        pages.getDroppableAcceptPage().dragAndDrop(pages.getDroppableAcceptPage().getDraggableSecondElement());

        //7. Verify that the second draggable element has been dropped to the target-droppable element

            //find the second draggable element edges
        int secondDraggableElementTopEdge = pages.getDroppableAcceptPage().getDraggableElementTopEdge(pages.getDroppableAcceptPage().getDraggableSecondElement());
        int secondDraggableElementBottomEdge = pages.getDroppableAcceptPage().getDraggableElementBottomEdge(pages.getDroppableAcceptPage().getDraggableSecondElement());
        int secondDraggableElementRightEdge = pages.getDroppableAcceptPage().getDraggableElementRightEdge(pages.getDroppableAcceptPage().getDraggableSecondElement());
        int secondDraggableElementLeftEdge = pages.getDroppableAcceptPage().getDraggableElementLeftEdge(pages.getDroppableAcceptPage().getDraggableSecondElement());

            //find the droppable element edges
        int droppableElementTopEdge =pages.getDroppableAcceptPage().getDroppableElementTopEdge();
        int droppableElementBottomEdge =pages.getDroppableAcceptPage().getDroppableElementBottomEdge();
        int droppableElementRightEdge =pages.getDroppableAcceptPage().getDroppableElementRightEdge();
        int droppableElementLeftEdge =pages.getDroppableAcceptPage().getDroppableElementLeftEdge();

        Assertions.assertThat(secondDraggableElementBottomEdge).isBetween(droppableElementTopEdge, droppableElementBottomEdge);
        Assertions.assertThat(secondDraggableElementTopEdge).isBetween(droppableElementTopEdge, droppableElementBottomEdge);
        Assertions.assertThat(secondDraggableElementLeftEdge).isBetween(droppableElementLeftEdge, droppableElementRightEdge);
        Assertions.assertThat(secondDraggableElementRightEdge).isBetween(droppableElementLeftEdge, droppableElementRightEdge);

        // 8. Verify that the text of the target-droppable element has changed to Dropped!
        Assertions.assertThat(pages.getDroppableAcceptPage().getDroppableElementText()).isEqualTo("Dropped!");






    }
}
