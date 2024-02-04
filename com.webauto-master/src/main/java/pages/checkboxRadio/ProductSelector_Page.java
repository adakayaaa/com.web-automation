package pages.checkboxRadio;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;


public class ProductSelector_Page extends BasePage {
    @FindBy(xpath = "//div[@class=\"brand-options\"]/label")
    private List<WebElement> listOfBrands;

    @FindBy(xpath = "//div[@class=\"shape-options\"]/label")
    private List<WebElement> listOfShapes;

    @FindBy(xpath = "//div[@class=\"toggle-options\"]/label")
    private List<WebElement> listOfStyles;

    @FindBy(xpath = "//div[@class=\"preview\"]/div")
    private WebElement previewOfShape;

    @FindBy(xpath = "//div[@class=\"preview\"]/div/p")
    private WebElement titleOfShape;

    public void selectABrand(int index) {
        listOfBrands.get(index - 1).click();
    }

    public void selectAShape(String shapeOfName) {
        for (int i = 0; i < listOfShapes.size(); i++) {
            if (listOfShapes.get(i).getText().equalsIgnoreCase(shapeOfName)) {
                listOfShapes.get(i).click();
            }
        }
    }

    public void selectAStyle(String style) {
        for (int i = 0; i < listOfStyles.size(); i++) {
            if (listOfStyles.get(i).getText().equalsIgnoreCase(style)) {
                listOfStyles.get(i).click();
            }
        }
    }

    public String getTexTitleOfShape(){
        return titleOfShape.getText();
    }

    public String getPreviewOfShape(){
        return previewOfShape.getAttribute("class");
    }

}
