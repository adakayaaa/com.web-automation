package CheckboxRadioTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.JSUtils;
import utils.Pages;
/*
 * 1. Open the browser and navigate to the page
 * 2. Click on the Checkbox Radio button
 * 3. Click on the Product Selector button
 * 4. Select Brand 2.
 * 5. Verify that displayed on the preview of shape.
 * 6. Select Square for shape firstly.And then select Rectangle.
 * 7. Verify that Rectangle is selected.
 * 8. Select Background Color for style.
 * 9. Select Border for style.
 * 10.Verify that styles displayed on the preview of shape.
 */

public class ProductSelector_Test extends Hooks {

    Pages pages = new Pages();

    @Test
    void testProductSelector() throws InterruptedException {

        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. Click on the Checkbox Radio button
        pages.getWebAutomationPage().clickOnCheckboxRadioLink();

        //3. Click on the Product Selector button
        pages.getWebAutomationPage().clickOnProductSelector();

        //4. Select Brand 2.
        pages.getProductSelectorPage().selectABrand(2);

        //5. Verify that displayed on the preview of shape.
        String titleOfPreview = pages.getProductSelectorPage().getTexTitleOfShape();
        Assertions.assertEquals("Brand 2", titleOfPreview, "The radio button is not working!");

        //6. Select Square for shape firstly.And then select Rectangle.
        pages.getProductSelectorPage().selectAShape("Square");
        pages.getProductSelectorPage().selectAShape("Rectangle");

        // 7. Verify that Rectangle is selected.
        boolean isSelectedTheShape = pages.getProductSelectorPage().getPreviewOfShape().contains("rectangle");
        Assertions.assertTrue(isSelectedTheShape, "The radio group is not working!");

        JSUtils.executeJavaScript("window.scrollBy(0,300)");
        Thread.sleep(1000);

        //8. Select Background Color for style.
        pages.getProductSelectorPage().selectAStyle("Background Color");

        //9. Select Border for style.
        pages.getProductSelectorPage().selectAStyle("Border");

        //10.Verify that styles displayed on the preview of shape.
        boolean isSelectedTheStyle = pages.getProductSelectorPage().getPreviewOfShape().contains("background-color") &&
                pages.getProductSelectorPage().getPreviewOfShape().contains("border");
        Assertions.assertTrue(isSelectedTheStyle, "The selectors are not working at the same time!");

    }
}
