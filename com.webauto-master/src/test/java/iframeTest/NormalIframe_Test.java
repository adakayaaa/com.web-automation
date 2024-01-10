package iframeTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

/**
 * 1.Open the browser and navigate to the page
 * 2.Click on Iframe link
 * 3.Click on Normal Iframe link
 * 4.Verify that the header text "Inar academy" In iframe
 */

public class NormalIframe_Test extends Hooks {
    Pages pages =new Pages();

    @Test
    void testNormalIframe(){
        // 1.Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();

        // 2.Click on Iframe link
        pages.getWebAutomationPage().clickOnIframeLink();

        BrowserUtils.scrollUpWithPageUp();

        //3.Click on Normal Iframe link
        pages.getWebAutomationPage().clickOnNormalIframeLink();

        //4.Verify that the header text "Inar academy" In iframe
        String expectedHeader = "Inar academy";
        String actualHeader= pages.getNormalIframePage().getHeaderInIframe();

        Assertions.assertEquals(expectedHeader,actualHeader,"The header is wrong!");
    }
}
