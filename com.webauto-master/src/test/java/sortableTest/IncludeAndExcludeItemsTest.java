package sortableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.JSUtils;
import utils.Pages;

/*
 * 1. Open the browser and navigate to the page
 * 2. Click on the sortable button
 * 3. Click on the include/exclude items button
        *On Upper Box:
 * 4. Drop the Item 1 instead of Item 4 that on the upper box.
 * 5. Verify that items can be sorted and drop.
 * 6. Drop the Item 1 instead of first "(I'm not sortable or a drop target)" that on the upper box.
 * 7. Verify that "(I'm not sortable or a drop target)" element cannot be sorted.
 * 8. Drop the (I'm not sortable or a drop target) instead of Item 1 that on the upper box.
 * 9. Verify that "(I'm not sortable or a drop target)" element cannot be dropped.
        *On Below Box:
 * 10. Drop the Item 1 instead of "(I'm not sortable)" that on the below box.
 * 11. Verify that items can be dropped.
 */

public class IncludeAndExcludeItemsTest extends Hooks {
    Pages pages=new Pages();

    @Test
    void testIncludeAndExcludeItems() throws InterruptedException {

        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. Click on the sortable button
        pages.getWebAutomationPage().clickOnSortableLink();

        //3. Click on the include/exclude items button
        pages.getWebAutomationPage().clickOnIncludeAndExcludeItemsLink();

            //On Upper Box:
        //4. Drop the Item 1 instead of Item 4 that on the upper box.
        pages.getIncludeAndExcludeItemsPage().moveUpperBoxElementByOffSets("Item 1","Item 4");


        // 5. Verify that items can be sorted and drop.
        String expected="Item 1";
        String actual=pages.getIncludeAndExcludeItemsPage().getElementsOrderOnTheUpperBox(4);
        Assertions.assertEquals(expected,actual,"The elements cannot be sorted!");

        //6. Drop the Item 1 instead of the first "(I'm not sortable or a drop target)" that on the upper box.
        pages.getIncludeAndExcludeItemsPage().moveUpperBoxElementByOffSets("Item 1",pages.getIncludeAndExcludeItemsPage().getElementsOrderOnTheUpperBox(1));

        //7. Verify that "(I'm not sortable or a drop target)" element cannot be sorted.

        Assertions.assertEquals(expected,actual,"The elements can be sorted!");

        //8. Drop the (I'm not sortable or a drop target) instead of Item 1 that on the upper box.
        pages.getIncludeAndExcludeItemsPage().moveUpperBoxElementByOffSets(pages.getIncludeAndExcludeItemsPage().getElementsOrderOnTheUpperBox(1),"Item 1");

        //9. Verify that "(I'm not sortable or a drop target)" element cannot be dropped.
        expected="(I'm not sortable or a drop target)";
        actual=pages.getIncludeAndExcludeItemsPage().getElementsOrderOnTheUpperBox(1);
        Assertions.assertEquals(expected,actual,"The element can be dropped!");

        JSUtils.executeJavaScript("window.scrollBy(0,300)");
        Thread.sleep(1000);

               //On Below Box:
        //10. Drop the Item 1 instead of "(I'm not sortable)" that on the below box.
        pages.getIncludeAndExcludeItemsPage().moveBelowBoxElementByOffSets("Item 1",pages.getIncludeAndExcludeItemsPage().getElementsOrderOnTheBelowBox(2));

        //11. Verify that items can be dropped.
        expected="(I'm not sortable)";
        actual=pages.getIncludeAndExcludeItemsPage().getElementsOrderOnTheBelowBox(1);
        Assertions.assertEquals(expected,actual,"The element cannot be sorted!");

    }
}
