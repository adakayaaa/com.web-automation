package pages.dialog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.JSUtils;

import java.util.ArrayList;
import java.util.List;

public class Modal_Form_Page extends BasePage {
    @FindBy(xpath = "//button[text()=\"Create Account\"]")
    private WebElement createAccountButton;

    @FindBy(id="name")
    private WebElement nameInputField;

    @FindBy(id = "surname")
    private WebElement surnameInputField;

    @FindBy(id = "email")
    private WebElement emailInputField;

    @FindBy(xpath = "//button[text()=\"Submit\"]")
    private WebElement submitButton;

    @FindBy(xpath = "(//button[@title=\"Close\"])[3]")
    private WebElement closeButton;

    @FindBy(xpath = "//tbody/tr[2]/td")
    private List<WebElement> usersDataBody;

    @FindBy(xpath = "//h3[text()='Users Data:']")
    private WebElement usersDataTitle;

    public List<String> getUsersDataBody() {
        List<String> list=new ArrayList<>();
        list.add(usersDataBody.get(0).getText());
        list.add(usersDataBody.get(1).getText());
        list.add(usersDataBody.get(2).getText());
        return list;
    }

    public void clickOnCreateAccount(){
        createAccountButton.click();
    }
    public void clickOnCloseButton(){
        closeButton.click();
    }

    public void clickOnSubmitButton(){
        submitButton.click();
    }

    public void sendKeysOnInputFields(String name,String surname,String email) throws InterruptedException {
        nameInputField.click();
        nameInputField.sendKeys(name);

        surnameInputField.click();
        surnameInputField.sendKeys(surname);

        JSUtils.executeJavaScript("window.scrollBy(0,300)");
        Thread.sleep(1000);

        emailInputField.click();
        emailInputField.sendKeys(email);
    }

    public void sendKeysOnNameInputField(String name){
        nameInputField.click();
        nameInputField.sendKeys(name);
    }

    public void sendKeysOnSurnameInputField(String surname){
        surnameInputField.click();
        surnameInputField.sendKeys(surname);
    }
    public void sendKeysOnEmailInputField(String email){
        emailInputField.click();
        emailInputField.sendKeys(email);
    }

    public boolean isDisplayedUsersDataTitle(){
        if(!usersDataTitle.isDisplayed()){
            return false;
        }
        return true;
    }



}
