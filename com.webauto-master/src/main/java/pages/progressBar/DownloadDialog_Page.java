package pages.progressBar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

//TODO

public class DownloadDialog_Page extends BasePage {

	@FindBy(id = "downloadButton-download-dialog")
	private WebElement downloadButton;

	@FindBy(xpath = "//button[text()='Cancel Download']")
	private WebElement cancelDownloadButton;

	@FindBy(id = "ui-id-82")
	private WebElement fileDownloadTitleBar;

	@FindBy(xpath = "//*[@id=\"dialog-container-download-dialog\"]/div/div[1]/button/span[1]")
	private WebElement closeButton;



	public String getDownloadButtonText() {
		return downloadButton.getText();
	}

	public boolean isFileDownloadBarTitleDisplayed() {
		return fileDownloadTitleBar.isDisplayed();
	}

	public void clickOnDownloadButton() {
		 downloadButton.click();
	}

	public void clickOnCancelDownloadButton() {
		cancelDownloadButton.click();
	}

	public void clickOnCloseButton() {
		closeButton.click();
	}

}
