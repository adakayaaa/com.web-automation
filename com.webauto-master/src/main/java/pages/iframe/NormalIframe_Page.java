package pages.iframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class NormalIframe_Page extends BasePage {

	@FindBy(id = "nestedIframe")
	private WebElement iFrameElement;

	@FindBy(css = "h1")
	private WebElement headerInIframeElement;

	public void switchToIframe() {
		DRIVER.switchTo().frame(iFrameElement);
	}

	public String getHeaderInIframe() {
		switchToIframe();
		return headerInIframeElement.getText();
	}

	public void printTitle() {
		System.out.println(DRIVER.switchTo().frame(iFrameElement).getTitle());
	}

}
