package alertsTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

/**
 * 1. Open the browser and navigate to the page
 * 2. Click on the Alerts button
 * 3. Click on the Alert Types button
 * 4. Click on the Show Confirm button
 * 5. Verify that alert text is "Are you sure?"
 * 6. Confirm the alert
 * 7. Verify that alert text "Confirmed!"
 * 8. Confirm the alert
 * 9. Click on the Show Confirm button
 * 10. Dismiss the alert
 */

public class AlertTypes_ShowConfirm_Test extends Hooks {

    Pages pages=new Pages();

    @Test
    void testShowConfirm(){
        // 1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();

        // 2. Click on the Alerts button
        pages.getWebAutomationPage().clickOnAlertsLink();

        BrowserUtils.scrollUpWithPageUp();

        // 3. Click on the Alert Types button
        // 4. Click on the Show Confirm button
        pages.getAlertTypesPage().clickOnShowConfirmButton();

        BrowserUtils.wait(2);

        // 5. Verify that alert text is "Are you sure?"
        String expectedText = "Are you sure?";
        String actualText = pages.getAlertTypesPage().getTextOfTheAlert();
        Assertions.assertEquals(expectedText, actualText, "Wrong Text Prompted !");

        BrowserUtils.wait(2);

        // 6. Confirm the alert
        pages.getAlertTypesPage().confirmTheAlert();

        // 7. Verify that alert text "Confirmed!"
        String expectedTextSecond = "Confirmed!";
        String actualTextSecond = pages.getAlertTypesPage().getTextOfTheAlert();
        Assertions.assertEquals(expectedTextSecond, actualTextSecond, "Wrong Text Prompted !");

        BrowserUtils.wait(2);

        //8. Confirm the alert
        pages.getAlertTypesPage().confirmTheAlert();

        // 9. Click on the Show Confirm button
        pages.getAlertTypesPage().clickOnShowConfirmButton();

        BrowserUtils.wait(2);

        // 10. Dismiss the alert
        pages.getAlertTypesPage().cancelTheAlert();











    }

}
