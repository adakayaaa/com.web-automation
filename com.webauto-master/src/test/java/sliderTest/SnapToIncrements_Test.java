package sliderTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;
/*
 * 1. Open the browser and navigate to the page
 * 2. Click on the Slider button
 * 3. Click on the Snap To Increments button
 * 4. Slider the slider tab by 50 pixels to the right
 * 5. Verify that the donation amount differs by 50 units.
 * 6. Slider the slider tab by 10 pixels to the left
 * 7. Verify that the donation amount differs by 0 units.
 */

public class SnapToIncrements_Test extends Hooks {
    Pages pages=new Pages();
     @Test
    void testSnapToIncrements(){

         //1. Open the browser and navigate to the page
         pages.getHomePage().clickOnWebAutomationLink();

         BrowserUtils.scrollDownWithPageDown();

         // 2. Click on the Slider button
         pages.getWebAutomationPage().clickOnSliderLink();
         BrowserUtils.scrollUpWithPageUp();

         //3. Click on the Snap To Increments button
         pages.getWebAutomationPage().clickOnSnapToIncrementsLink();

             // Get first donation amount
         int donationAmount=pages.getSnapToIncrementsPage().getDonationAmount();

         //4. Slider the slider tab by 50 pixels to the right
         pages.getSnapToIncrementsPage().moveToSliderTab(50);

            // Get second donation amount
         int donationAmount2=pages.getSnapToIncrementsPage().getDonationAmount();

         //5. Verify that the donation amount differs by 50 units.

         Assertions.assertEquals((donationAmount2-donationAmount),50,"The increment slider values are not with step 50 to 50 ");


         //6. Slider the slider tab by 10 pixels to the left
         pages.getSnapToIncrementsPage().moveToSliderTab(-10);

            // Get third donation amount
         int donationAmount3=pages.getSnapToIncrementsPage().getDonationAmount();

         //7. Verify that the donation amount differs by 0 units.

         Assertions.assertEquals((donationAmount3-donationAmount2),0,"The increment slider values are not with step 50 to 50 ");
     }
}
