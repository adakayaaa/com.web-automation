package resizableTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Pages;

/**
 * 1.Open the browser and navigate to the page
 * 2.Click on the resizable button
 * 3.Click on the text area button
 * 4.Send to text at the text area
 * 5.Drag the resize handle to resize the resizable element
 * 6.Verify that the resizable element has been resized
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

        // initial size of the resizable element
        int initialWidthOfElement = pages.getResizableTextAreaPage().getWidthOfResizableElement();
        int initialHeightOfElement = pages.getResizableTextAreaPage().getHeightOfResizableElement();

        //4.Send to a text at the text area

        pages.getResizableTextAreaPage().sendToTextAtTheTextArea("Inar Academy-test of the text area");

        Thread.sleep(1000);

        //5.Drag the resize handle to resize the resizable element
        pages.getResizableTextAreaPage().resizeTheWebElement(50, 50);

        // final size of the resizable element
        int finalWidthOfElement = pages.getResizableTextAreaPage().getWidthOfResizableElement();
        int finalHeightOfElement = pages.getResizableTextAreaPage().getHeightOfResizableElement();

        // 6.Verify that the resizable element has been resized
        Assertions.assertThat(finalWidthOfElement).isGreaterThan(initialWidthOfElement);
        Assertions.assertThat(finalHeightOfElement).isGreaterThan(initialHeightOfElement);


    }
}
