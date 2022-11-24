package AlltennaWebPages;

import core.BaseAlltennaWeb;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.TestValues.LOGIN;
import static helpers.TestValues.PASSWORD;

public class LoginAWSPage extends BaseAlltennaWeb {

    @FindBy(css = ".modal-content-desktop #signInFormUsername")
    public WebElement loginField;
    @FindBy(css = ".modal-content-desktop #signInFormPassword")
    public WebElement passwordField;
    @FindBy(xpath = "//div[@class='modal-content background-customizable modal-content-desktop visible-md visible-lg']" +
            "//input[@name='signInSubmitButton'] ")
    public WebElement signInButton;

    public LoginAWSPage() {
        PageFactory.initElements(driver, this);

    }
    public BasePageLoggedIn auth()  {

        //comment
        loginField.click();
        loginField.sendKeys(LOGIN);
        passwordField.click();
        passwordField.sendKeys(PASSWORD);
        signInButton.click();

        return new BasePageLoggedIn();

    }


}
