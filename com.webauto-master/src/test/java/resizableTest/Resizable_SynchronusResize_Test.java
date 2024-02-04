package resizableTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.JSUtils;
import utils.Pages;

/*
 * 1.Open the browser and navigate to the page
 * 2.Click on the resizable button
 * 3.Click on the synchronus resize button
 * 4.Drag the resize handle to resize the first resizable element
 * 5.Verify that the first resizable element and the second resizable element has been resized
 * 6.Drag the resize handle to resize the second resizable element
 * 7.Verify that the first resizable element has not been resized but the second resizable element has been resized
 */
public class Resizable_SynchronusResize_Test extends Hooks {

	Pages pages = new Pages();

	@Test
	void testSynchronusResize() {
		// 1.Open the browser and navigate to the page
		pages.getHomePage().clickOnWebAutomationLink();

		// 2.Click on the resizable button
		pages.getWebAutomationPage().clickOnResizableLink();

		// 3.Click on the synchronus resize button
		pages.getWebAutomationPage().clickOnResizableSynchronusResizeLink();

		// initial size of the first element
		int initialWidthOfFirstElement = pages.getResizableSynchronusResizePage()
			.getWidthOfResizableElement(pages.getResizableSynchronusResizePage().getFirstElement());
		int initialHeightOfFirstElement = pages.getResizableSynchronusResizePage()
			.getHeightOfResizableElement(pages.getResizableSynchronusResizePage().getFirstElement());

		// initial size of the second element
		int initialWidthOfSecondElement = pages.getResizableSynchronusResizePage()
			.getWidthOfResizableElement(pages.getResizableSynchronusResizePage().getSecondElement());
		int initialHeightOfSecondElement = pages.getResizableSynchronusResizePage()
			.getHeightOfResizableElement(pages.getResizableSynchronusResizePage().getSecondElement());

		// 4.Drag the resize handle to resize the first resizable element
		pages.getResizableSynchronusResizePage()
			.resizeTheWebElement(30, 30, pages.getResizableSynchronusResizePage().getResizeHandleForFirstElement());

		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}

		// final size of the first element
		int finalWidthOfFirstElement = pages.getResizableSynchronusResizePage()
			.getWidthOfResizableElement(pages.getResizableSynchronusResizePage().getFirstElement());
		int finalHeightOfFirstElement = pages.getResizableSynchronusResizePage()
			.getHeightOfResizableElement(pages.getResizableSynchronusResizePage().getFirstElement());

		// final size of the second element
		int finalWidthOfSecondElement = pages.getResizableSynchronusResizePage()
			.getWidthOfResizableElement(pages.getResizableSynchronusResizePage().getSecondElement());
		int finalHeightOfSecondElement = pages.getResizableSynchronusResizePage()
			.getHeightOfResizableElement(pages.getResizableSynchronusResizePage().getSecondElement());

		// 5.Verify that the first resizable element and the second resizable element has
		// been resized
		Assertions.assertThat(finalWidthOfFirstElement).isGreaterThan(initialWidthOfFirstElement);
		Assertions.assertThat(finalHeightOfFirstElement).isGreaterThan(initialHeightOfFirstElement);

		Assertions.assertThat(finalWidthOfSecondElement).isGreaterThan(initialWidthOfSecondElement);
		Assertions.assertThat(finalHeightOfSecondElement).isGreaterThan(initialHeightOfSecondElement);

		Assertions.assertThat(finalWidthOfFirstElement - (finalWidthOfSecondElement)).isEqualTo(0);
		Assertions.assertThat(finalHeightOfFirstElement - (finalHeightOfSecondElement)).isEqualTo(0);

		JSUtils.executeJavaScript("window.scrollBy(0,300)");
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 6.Drag the resize handle to resize the second resizable element
		pages.getResizableSynchronusResizePage()
			.resizeTheWebElement(30, 30, pages.getResizableSynchronusResizePage().getResizeHandleForSecondElement());

		// final size of the first element
		int finalWidthOfFirstElementTwo = pages.getResizableSynchronusResizePage()
			.getWidthOfResizableElement(pages.getResizableSynchronusResizePage().getFirstElement());
		int finalHeightOfFirstElementTwo = pages.getResizableSynchronusResizePage()
			.getHeightOfResizableElement(pages.getResizableSynchronusResizePage().getFirstElement());

		// final size of the second element
		int finalWidthOfSecondElementTwo = pages.getResizableSynchronusResizePage()
			.getWidthOfResizableElement(pages.getResizableSynchronusResizePage().getSecondElement());
		int finalHeightOfSecondElementTwo = pages.getResizableSynchronusResizePage()
			.getHeightOfResizableElement(pages.getResizableSynchronusResizePage().getSecondElement());

		// 7.Verify that the first resizable element has not been resized but the second
		// resizable element has been resized
		Assertions.assertThat(finalWidthOfFirstElementTwo).isEqualTo(finalWidthOfFirstElement);
		Assertions.assertThat(finalHeightOfFirstElementTwo).isEqualTo(finalHeightOfFirstElement);

		Assertions.assertThat(finalWidthOfSecondElementTwo).isGreaterThan(finalWidthOfSecondElement);
		Assertions.assertThat(finalHeightOfSecondElementTwo).isGreaterThan(finalHeightOfSecondElement);

		Assertions.assertThat(finalWidthOfSecondElementTwo).isGreaterThan(finalWidthOfFirstElementTwo);
		Assertions.assertThat(finalHeightOfSecondElementTwo).isGreaterThan(finalHeightOfFirstElementTwo);

	}

}
