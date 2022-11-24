package AlltennaWebPages;

import core.BaseAlltennaWeb;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePageLoggedIn extends BaseAlltennaWeb {

    //*Donate*//

    @FindBy(xpath = "//a[@class='Button_container__2PKtW Button_primary__O3Hst DonateBar_button__zY6F9']")
    public WebElement donateButtonHeader;

    @FindBy(xpath = "//a[@class='Button_container__2PKtW Button_primary__O3Hst']")
    public WebElement donateButtonBody;

    @FindBy(xpath = "//ul[@class='HeaderProfileMenu_dropdownMenu__8Aa93'] //a[text()='Donate']")
    public WebElement donateButtonDropbox;

    //*Header elements*//

    @FindBy(xpath = "//span[@class='Branding_title__XxYwJ']")
    public WebElement alltennaHomeButton;

    @FindBy(xpath = "//a[@title='Home']")
    public WebElement homeButton;

    @FindBy(xpath = "//a[@title='About Us']")
    public WebElement aboutUsButton;

    @FindBy(xpath = "//a[@title='FAQ']")
    public WebElement faqButton;

    @FindBy(xpath = "//a[@title='Posts']")
    public WebElement posts;

    //*Socials*//

    @FindBy (xpath = "//a[@title='Join us on Facebook']")
    public WebElement facebookButton;

    @FindBy(xpath = "//a[@title='Read us on Twitter']")
    public WebElement twitterButton;

    @FindBy(xpath = "//a[@title='Follow us on Instagram']")
    public WebElement instagramButton;

    //*User profile dropdown box*Use after click on avatar//

    @FindBy(xpath = "//div[@class='HeaderProfileMenu_dropdown__mfMB_']")
    public WebElement dropdownBox;

    @FindBy(xpath = "//img[@class='HeaderProfileMenu_avatarImg__NB2hq']")
    public WebElement avatar;

    @FindBy(xpath = "//h3[@class='HeaderProfileMenu_name__oz0Cr']")
    public WebElement profileName;

    @FindBy(xpath = "//div[@class='HeaderProfileMenu_profileId__pc8gm']")
    public WebElement profileID;

    @FindBy(xpath = "//a[text()='My Devices']")
    public WebElement myDevices;

    @FindBy(xpath = "//a[text()='Profile']")
    public WebElement profile;

    @FindBy(xpath = "//a[@class='HeaderProfileMenu_logout__X92TU']")
    public WebElement signOutButton;





    public BasePageLoggedIn(){
        PageFactory.initElements(driver,this);
    }

    public void avatarDropdownBox(){
        avatar.click();
    }
    public void signOut() {
        signOutButton.click();
    }

    public DonationsPage goToDonatePage() {
        donateButtonDropbox.click();
        return new DonationsPage();
    }

}

