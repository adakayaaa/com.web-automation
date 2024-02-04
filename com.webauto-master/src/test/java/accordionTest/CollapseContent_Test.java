package accordionTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Pages;

/*
 * 1. Open the browser and navigate to the page
 * 2. Click on the Accordion button
 * 3. Click on the collapse content button
 * 4. Verify that the first section is open because the section is open by default.
 * 5. Click on the first section.
 * 6. Verify that the first section is close.
 * 7. Click on the second section.
 * 8. Verify that the first section is close.
 * 9.Verify that the second section is open.
 */

public class CollapseContent_Test extends Hooks {
    Pages pages = new Pages();

    @Test
    void testCollapseContent() {

        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. Click on the Accordion button
        pages.getWebAutomationPage().clickOnAccordionLink();

        //3. Click on the collapse content button
        pages.getWebAutomationPage().clickOnCollapseContentLink();

        //4. Verify that the first section is open because the section is open by default.
        Assertions.assertThat(pages.getCollapseContentPage().isOpenTheFirstSection()).withFailMessage("The section should be open!").isTrue();

        //5. Click on the first section.
        pages.getCollapseContentPage().clickOnFirstSection();

        //6. Verify that the first section is close.
        Assertions.assertThat(pages.getCollapseContentPage().isCloseTheFirstSection()).withFailMessage("The section should be close!").isTrue();

        //7. Click on the second section.
        pages.getCollapseContentPage().clickOnSecondSection();

        //8. Verify that the first section is close.
        Assertions.assertThat(pages.getCollapseContentPage().isCloseTheFirstSection()).withFailMessage("The section should be close!").isTrue();

        //9.Verify that the second section is open.
        Assertions.assertThat(pages.getCollapseContentPage().isOpenTheSecondSection()).withFailMessage("The section should be open!").isTrue();

    }
}
