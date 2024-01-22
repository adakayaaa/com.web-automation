package dialogTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. Open the browser and navigate to the page
 * 2. Click on the Dialog button
 * 3. Click on the Modal Form button
 * 4. Click on the Create Account button
 * 5. Send input for name,surname,email
 * 6. Click on the Submit button
 * 7. Verify that correct inputs displayed
 * 8. Click on the Create Account button
 * 9. Click on the close button
 * 10. Verify that close button worked
 */

public class ModalForm_Test extends Hooks {

    @Test
    void testModalForm() throws InterruptedException {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();
        BrowserUtils.scrollDownWithPageDown();

        //2. Click on the Dialog button
        pages.getWebAutomationPage().clickOnDialogLink();
        BrowserUtils.scrollUpWithPageUp();

        //3. Click on the Modal Form button
        pages.getWebAutomationPage().clickOnModalFormLink();

        //4. Click on the Create Account button
        pages.getModalFormPage().clickOnCreateAccount();

        // 5. Send input for name,surname,email.
        pages.getModalFormPage().sendKeysOnInputFields("Ada", "Kaya", "adakaya@gmail.com");

        //6. Click on the Submit button
        pages.getModalFormPage().clickOnSubmitButton();

        //7.Verify displayed correct inputs
        List<String> listActual = new ArrayList<>();
        listActual.add("Ada");
        listActual.add("Kaya");
        listActual.add("adakaya@gmail.com");

        List<String> list = pages.getModalFormPage().getUsersDataBody();
        for (int i = 0; i < list.size(); i++) {
            Assertions.assertEquals(listActual.get(i), list.get(i), (i + 1) + " input of area is wrong!");
        }

        //8. Click on the Create Account button
        pages.getModalFormPage().clickOnCreateAccount();

        //9. Click on the close button
        pages.getModalFormPage().clickOnCloseButton();

        //10. Verify that close button worked
        boolean isDisplayedUsersDataField = pages.getModalFormPage().isDisplayedUsersDataTitle();
        Assertions.assertTrue(isDisplayedUsersDataField, "The close button is not working!");
    }
}
