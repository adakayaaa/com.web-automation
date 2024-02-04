package sortableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Pages;

import java.util.List;

/*
 * 1. Open the browser and navigate to the page
 * 2. Click on the sortable button
 * 3. Click on the displayed as grid button
 * 4. Drag the "1" and drop on "6"'s place
 * 5. Verify that items can be sorted from smallest to largest until the moved element.

 */

public class DisplayAsGrid_Test extends Hooks {

    Pages pages = new Pages();

    @Test
    void testDisplayAsGrid() {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. Click on the sortable button
        pages.getWebAutomationPage().clickOnSortableLink();

        //3. Click on the displayed as grid button
        pages.getWebAutomationPage().clickOnDisplayAsGridLink();

        //get sortable number
        List<Integer> firstList = pages.getDisplayAsGridPage().getTextNumbers();

        //4. Drag the "1" and drop on "6"'s place
        pages.getDisplayAsGridPage().clickAndDragItem(1, 150, 120);

        //Get sortable number of final list
        List<Integer> finalList = pages.getDisplayAsGridPage().getTextNumbers();

        //5. Verify that items can be sorted from smallest to largest until the moved element.
        boolean isSortable = true;
        for (int i = 0; i < 5; i++) {
            if (finalList.get(i) - firstList.get(i) != 1) {
               isSortable=false;
               break;
            }
        }
        Assertions.assertTrue(isSortable,"That elements are not sorted!");

    }
}
