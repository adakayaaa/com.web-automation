package draggableTests;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Pages;

import javax.swing.*;

/**
 * 1. Open the browser and navigate to the page
 * 2. Click on the draggable button
 * 3. Click on the constrain movement button
 * 4. Drag the first element by 100 pixels to the right and by 100 pixels to the down
 * 5. Verify that the element has been dragged only vertically
 * 6. Drag the second element by 100 pixels to the right and by 100 pixels to the down
 * 7. Verify that the element has been dragged only horizontally
 */

public class Draggable_ConstrainMovement_Test extends Hooks {
    Pages pages = new Pages();

    @Test
    void testConstrainMovement() throws InterruptedException {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2.Click on the draggable button
        pages.getWebAutomationPage().clickOnDraggableLink();

        //3. Click on the constrain movement button
        pages.getWebAutomationPage().clickOnDraggableConstrainMovementLink();

        // get the initial location of the first element
        int initialXForFirstElement = pages.getConstrainMovementPage().getLocationOfDraggableX(pages.getConstrainMovementPage().getFirstElement());
        int initialYForFirstElement = pages.getConstrainMovementPage().getLocationOfDraggableY(pages.getConstrainMovementPage().getFirstElement());

        //4. Drag the first element by 100 pixels to the right and by 100 pixels to the down
        pages.getConstrainMovementPage().dragAndDropByOffSets(100, 100, pages.getConstrainMovementPage().getFirstElement());


        // get the final location of the first element
        int finalXForFirstElement = pages.getConstrainMovementPage().getLocationOfDraggableX(pages.getConstrainMovementPage().getFirstElement());
        int finalYForFirstElement = pages.getConstrainMovementPage().getLocationOfDraggableY(pages.getConstrainMovementPage().getFirstElement());

        //5. Verify that the element has been dragged only vertically
        Assertions.assertThat(finalYForFirstElement).isGreaterThan(initialYForFirstElement);
        Assertions.assertThat(finalXForFirstElement).isEqualTo(initialXForFirstElement);

        Thread.sleep(2000);

        // get the initial location of the second element
        int initialXForSecondElement = pages.getConstrainMovementPage().getLocationOfDraggableX(pages.getConstrainMovementPage().getSecondElement());
        int initialYForSecondElement = pages.getConstrainMovementPage().getLocationOfDraggableY(pages.getConstrainMovementPage().getSecondElement());

        //6. Drag the second element by 100 pixels to the right and by 100 pixels to the down
        pages.getConstrainMovementPage().dragAndDropByOffSets(100,100,pages.getConstrainMovementPage().getSecondElement());

        // get the final location of the second element
        int finalXForSecondElement =pages.getConstrainMovementPage().getLocationOfDraggableX(pages.getConstrainMovementPage().getSecondElement());
        int finalYForSecondElement =pages.getConstrainMovementPage().getLocationOfDraggableY(pages.getConstrainMovementPage().getSecondElement());

        //7.Verify that the element has been dragged only horizontally
        Assertions.assertThat(finalXForSecondElement-initialXForSecondElement).isNotEqualTo(0);
        Assertions.assertThat(finalYForSecondElement-initialYForSecondElement).isEqualTo(0);








    }

}
