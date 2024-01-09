package resizableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.JSUtils;
import utils.Pages;

/**
 * 1.Open the browser and navigate to the page
 * 2.Click on the resizable button
 * 3.Click on the text area button
 * 4. Send to text at the text area
 * 5.Verify that the text message is visible.
 */

public class Resizable_TextArea_Test extends Hooks {
    Pages pages = new Pages();

    @Test
    void testTextArea() throws InterruptedException {
        //1.Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2.Click on the resizable button
        pages.getWebAutomationPage().clickOnResizableLink();

        //3.Click on the text area button
        pages.getWebAutomationPage().clickOnResizableTextAreaLink();

        //4.Send to a text at the text area

        pages.getResizableTextAreaPage().sendToTextAtTheTextArea("Inar Academy-test of the text area");

        Thread.sleep(1000);

        String text = pages.getResizableTextAreaPage().getFirstElement().getAttribute("value");

        //5.Verify that the text message is visible.

        Assertions.assertEquals(text, "text area Inar Academy-test of the text area", "The textarea has not  bigger to type longer prose!");

        //Also can i use this?
        // JSUtils.getJs().executeScript("arguments[0].scrollIntoView(true);", pages.getResizableTextAreaPage().getFirstElement());


    }
}
