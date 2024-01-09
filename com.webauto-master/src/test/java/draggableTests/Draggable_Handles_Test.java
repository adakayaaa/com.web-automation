package draggableTests;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.JSUtils;
import utils.Pages;

/**
 * 1. Open the browser and navigate to the page
 * 2. Click on the draggable button
 * 3. Click on the handles button
 * 4. Drag the big box for first element by 100 pixels to the right and by 100 pixels to the down when the click firstElement
 * 5. Verify that the element has been dragged
 * 6. Drag the big box for first element by 100 pixels to the right and by 100 pixels to the down when the click without firstElement
 * 7. Verify that the element has not been dragged
 * 8. Drag the big box for second element by 100 pixels to the right and by 100 pixels to the down when the click secondElement
 * 9. Verify that the element has not been dragged
 * 10.Drag the without the second element ın second big box  by 100 pixels to the right and by 100 pixels to the down when the click big box for the secondElement
 * 11.Verify that the element has been dragged
 */

public class Draggable_Handles_Test extends Hooks {
    Pages pages = new Pages();

    @Test
    void testHandles() throws InterruptedException {
        // 1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        // 2.Click on the draggable button
        pages.getWebAutomationPage().clickOnDraggableLink();

        // 3.Click on the handles button
        pages.getWebAutomationPage().clickOnDraggableHandlesLink();

        // get the initial location of the big box for the first element
        int initialXBigBoxForFirstElement = pages.getHandlesPage().getLocationOfDraggableX(pages.getHandlesPage().getBigBoxForFirstElement());
        int initialYBigBoxForFirstElement = pages.getHandlesPage().getLocationOfDraggableY(pages.getHandlesPage().getBigBoxForFirstElement());

        //4. Drag the first element by 100 pixels to the right and by 100 pixels to the down when the click firstElement
        pages.getHandlesPage().dragAndDropByOffSets(100, 100, pages.getHandlesPage().getFirstElement());

        // get the final location of the big box for the first element
        int finalXBigBoxForTheFirstElement = pages.getHandlesPage().getLocationOfDraggableX(pages.getHandlesPage().getBigBoxForFirstElement());
        int finalYBigBoxForTheFirstElement = pages.getHandlesPage().getLocationOfDraggableY(pages.getHandlesPage().getBigBoxForFirstElement());

        // 5. Verify that the element has been dragged
        Assertions.assertThat(finalXBigBoxForTheFirstElement - initialXBigBoxForFirstElement).isNotEqualTo(0);
        Assertions.assertThat(finalYBigBoxForTheFirstElement - initialYBigBoxForFirstElement).isNotEqualTo(0);

        Thread.sleep(1000);
        JSUtils.executeJavaScript("window.scrollBy(0,100)");
        Thread.sleep(1000);

        // get the initial location of the big box for the first element
        int initialXBigBoxForFirstElementTwo = pages.getHandlesPage().getLocationOfDraggableX(pages.getHandlesPage().getBigBoxForFirstElement());
        int initialYBigBoxForFirstElementTwo= pages.getHandlesPage().getLocationOfDraggableY(pages.getHandlesPage().getBigBoxForFirstElement());

        // 6. Drag the big box for first element by 100 pixels to the right and by 100 pixels to the down when the click without firstElement
        pages.getHandlesPage().dragAndDropByOffSets(100,100,pages.getHandlesPage().getBigBoxForFirstElement());

        // 7. Verify that the element has not been dragged
        Assertions.assertThat(finalXBigBoxForTheFirstElement - initialXBigBoxForFirstElementTwo).isEqualTo(0);
        Assertions.assertThat(finalYBigBoxForTheFirstElement - initialYBigBoxForFirstElementTwo).isEqualTo(0);

        Thread.sleep(1000);

        // get the initial location of the big box for the second element
        int initialXBigBoxForTheSecondElement = pages.getHandlesPage().getLocationOfDraggableX(pages.getHandlesPage().getBigBoxForSecondElement());
        int initialYBigBoxForTheSecondElement = pages.getHandlesPage().getLocationOfDraggableY(pages.getHandlesPage().getBigBoxForSecondElement());

        // 8. Drag the big box for second element by 100 pixels to the right and by 100 pixels to the down when the click secondElement
        pages.getHandlesPage().dragAndDropByOffSets(100, 100, pages.getHandlesPage().getSecondElement());

        // get the final location of the big box for the second element
        int finalXBigBoxForTheSecondElement = pages.getHandlesPage().getLocationOfDraggableX(pages.getHandlesPage().getBigBoxForSecondElement());
        int finalYBigBoxForTheSecondElement = pages.getHandlesPage().getLocationOfDraggableY(pages.getHandlesPage().getBigBoxForSecondElement());

        // 9. Verify that the element has not been dragged
        Assertions.assertThat(finalXBigBoxForTheSecondElement - initialXBigBoxForTheSecondElement).isEqualTo(0);
        Assertions.assertThat(finalYBigBoxForTheSecondElement - initialYBigBoxForTheSecondElement).isEqualTo(0);

        //10.Drag the without the second element ın second big box  by 100 pixels to the right and by 100 pixels to the down when the click big box for the secondElement
        pages.getHandlesPage().dragAndDropByOffSets(100, 100, pages.getHandlesPage().getWithoutTheSecondElementInSecondBigBox());

        // get the final location of the big box for the second element
        int finalXBigBoxForTheSecondElementTwo = pages.getHandlesPage().getLocationOfDraggableX(pages.getHandlesPage().getBigBoxForSecondElement());
        int finalYBigBoxForTheSecondElementTwo = pages.getHandlesPage().getLocationOfDraggableY(pages.getHandlesPage().getBigBoxForSecondElement());

        // 11.Verify that the element has been dragged
        Assertions.assertThat(finalXBigBoxForTheSecondElementTwo - initialXBigBoxForTheSecondElement).isNotEqualTo(0);
        Assertions.assertThat(finalYBigBoxForTheSecondElementTwo - initialYBigBoxForTheSecondElement).isNotEqualTo(0);


    }

}
