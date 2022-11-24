package AlltennaWebPages;

import core.BaseAlltennaWeb;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readProperties.ConfigProvider;

public class BasePage extends BaseAlltennaWeb {

    @FindBy(xpath = "//button[@class='Button_raw__nvxtI']")
    public WebElement loginButton;

    @FindBy (xpath = "//title")
    public WebElement title;

    public BasePage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public LoginAWSPage openLoginPage()  {
        loginButton.click();
        return new LoginAWSPage();

    }

    public boolean check_login_button_is_displayed() {
        try {
            loginButton.isDisplayed();
            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }
}
