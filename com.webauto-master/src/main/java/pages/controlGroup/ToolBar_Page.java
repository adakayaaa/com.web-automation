package pages.controlGroup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class ToolBar_Page extends BasePage {

	@FindBy(xpath = "(//select[@class=\"form-select me-2 bg-primary text-fifth fs-4\"])[1]")
	private WebElement zoom;

	@FindBy(xpath = "(//select[@class=\"form-select me-2 bg-primary text-fifth fs-4\"])[2]")
	private WebElement highlight;

	@FindBy(xpath = "(//select[@class=\"form-select me-2 bg-primary text-fifth fs-4\"])[3]")
	private WebElement color;

	@FindBy(xpath = "//button[text()='B']")
	private WebElement bold;

	@FindBy(xpath = "//button[text()='I']")
	private WebElement italic;

	@FindBy(xpath = "//button[text()='U']")
	private WebElement underline;

	@FindBy(id = "page")
	private WebElement textArea;


	public void selectTheDropDownElement(String[] text) {
		List<WebElement> listOfDropDowns = new ArrayList<>();
		listOfDropDowns.add(zoom);
		listOfDropDowns.add(highlight);
		listOfDropDowns.add(color);
		for (int i = 0; i < listOfDropDowns.size(); i++) {
			Select dropDownElement = new Select(listOfDropDowns.get(i));
			dropDownElement.selectByVisibleText(text[i]);
		}
	}


	public String getTextOfTextArea() {
		return textArea.getAttribute("style");
	}

	public WebElement getBold() {
		return bold;
	}

	public WebElement getItalic() {
		return italic;
	}

	public WebElement getUnderline() {
		return underline;
	}



}
