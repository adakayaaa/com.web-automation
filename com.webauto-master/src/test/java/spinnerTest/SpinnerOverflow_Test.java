package spinnerTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

/*
 * 1. Open the browser and navigate to the page
 * 2. Click on the Spinner button
 * 3. Click on the Spinner to Overflow button
 * 4. Click on the up button 6 times.
 * 5. Verify that displayed is "-1"
 * 6. Click on the down button 12 times.
 * 7. Verify that displayed is "-10"
 */

public class SpinnerOverflow_Test extends Hooks {
    Pages pages=new Pages();

    @Test
    void testSpinnerOverflow(){

        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();

        //2. Click on the Spinner button
        pages.getWebAutomationPage().clickOnSpinnerLink();

        BrowserUtils.scrollUpWithPageUp();

        //3. Click on the Spinner to Overflow button
        pages.getWebAutomationPage().clickOnSpinnerOverflowLink();

        //4. Click on the up button 6 times.
        pages.getSpinnerOverflowPage().clickOnDownButton(6);

        //5. Verify that displayed is "-1"
        String  valueOfSpinner=pages.getSpinnerOverflowPage().getValueOnSpinnerField();
        boolean isCorrect=true;

        if(!valueOfSpinner.equals("-1")){
            isCorrect=false;
        }
        Assertions.assertTrue(isCorrect,"That values are not between -10 to 10");

        //6. Click on the down button 12 times.
        pages.getSpinnerOverflowPage().clickOnUpButton(12);

        //7. Verify that displayed is "-10"
        String  valueOfSpinner2=pages.getSpinnerOverflowPage().getValueOnSpinnerField();
        if(!valueOfSpinner2.equals("-10")){
            isCorrect=false;
        }
        Assertions.assertTrue(isCorrect,"That values are not between -10 to 10");
    }


}
