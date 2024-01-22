package menuTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import utils.BrowserUtils;
import utils.JSUtils;
import utils.Pages;
import java.util.ArrayList;
import java.util.List;

/*
 * 1. Open the browser and navigate to the page
 * 2. Click on the Menu button
 * 3. Click on the Icons button
 * 4. Move to Save item.
 * 5. Verify that the save is active
 * 6. Move to Zoom In item.
 * 7. Verify that the zoom in is active
 * 8. Move to Zoom Out item.
 * 9. Verify that the zoom out is active
 * 10. Move to on Playback item.
 * 11. Verify that selectable menu is displayed.
 * 12.Move to on every playback items(prev,stop,play,next)
 * 13.Verify that the items are active.
 * 14.Move to on learn more about this menu item.
 * 15.Verify that learn more about this menu is active
 */

public class Icons_Test extends Hooks {

	Pages pages = new Pages();

	@Test
	void testIcons() throws InterruptedException {
		// 1. Open the browser and navigate to the page
		pages.getHomePage().clickOnWebAutomationLink();

		BrowserUtils.scrollDownWithPageDown();

		// 2. Click on the Menu button
		pages.getWebAutomationPage().clickOnMenuLink();

		BrowserUtils.scrollUpWithPageUp();

		// 3. Click on the Icons button
		pages.getWebAutomationPage().clickOnIconLink();

		// 4. Move to Save item
		pages.getIconsPage().moveToItem(pages.getIconsPage().getSaveButton());

		Thread.sleep(1000);

		// 5. Verify that the save is active
		boolean isActive = pages.getIconsPage().isDisplayedActiveMessage(pages.getIconsPage().getSaveButton());
		Assertions.assertTrue(isActive, "The save icon is not active.");

		// 6. Move to Zoom In item.
		pages.getIconsPage().moveToItem(pages.getIconsPage().getZoomInButton());

		Thread.sleep(1000);
		// 7. Verify that the zoom in is active
		boolean isActive2 = pages.getIconsPage().isDisplayedActiveMessage(pages.getIconsPage().getZoomInButton());
		Assertions.assertTrue(isActive2, "The zoom in icon is not active.");

		// 8. Move to Zoom Out item.
		pages.getIconsPage().moveToItem(pages.getIconsPage().getZoomOutButton());

		Thread.sleep(1000);
		// 9. Verify that the zoom out is active
		boolean isActive3 = pages.getIconsPage().isDisplayedActiveMessage(pages.getIconsPage().getZoomOutButton());
		Assertions.assertTrue(isActive3, "The zoom out icon is not active.");

		// 10. Move to on Playback item.
		pages.getIconsPage().moveToItem(pages.getIconsPage().getPlaybackButton());

		Thread.sleep(1000);
		// 11. Verify that selectable menu is displayed.
		boolean isDisplayed = pages.getIconsPage().isDisplayedPlaybackItems();
		Assertions.assertTrue(isDisplayed, "The playback's menu is not displayed.");

		// 12. Move to on every playback items(prev,stop,play,next)
		// 13. Verify that the items are active.
		List<WebElement> listOfPlaybackItems = new ArrayList<>();
		listOfPlaybackItems.add(pages.getIconsPage().getPrevButton());
		listOfPlaybackItems.add(pages.getIconsPage().getStopButton());
		listOfPlaybackItems.add(pages.getIconsPage().getPlayButton());
		listOfPlaybackItems.add(pages.getIconsPage().getNextButton());

		for (int i = 0; i < listOfPlaybackItems.size(); i++) {
			pages.getIconsPage().moveToItem(listOfPlaybackItems.get(i));
			Thread.sleep(1000);
			boolean isActive4 = pages.getIconsPage().isDisplayedActiveMessage(listOfPlaybackItems.get(i));
			Assertions.assertTrue(isActive4, "The" + listOfPlaybackItems.get(i) + " is not displayed");
		}

		// 14. Move to on learn more about this menu item.
		pages.getIconsPage().moveToItem(pages.getIconsPage().getLearnMoreAboutThisMenuButton());

		Thread.sleep(1000);
		// 15. Verify that learn more about this menu is active
		boolean isActive5 = pages.getIconsPage()
			.isDisplayedActiveMessage(pages.getIconsPage().getLearnMoreAboutThisMenuButton());
		Assertions.assertTrue(isActive5, "learn more about this menu is not active  ");

	}

}
