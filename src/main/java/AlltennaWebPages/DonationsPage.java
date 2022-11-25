package AlltennaWebPages;

import core.BaseAlltennaWeb;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DonationsPage extends BaseAlltennaWeb {

    @FindBy(xpath = "//button[text()='Donate']")
    public WebElement ourFansButton;

    @FindBy(xpath = "(//button[text()='Join'])[1]")
    public WebElement catcherButton;

    @FindBy(xpath = "(//button[text()='Join'])[2]")
    public WebElement outfielderButton;

    @FindBy(xpath = "(//button[text()='Join'])[3]")
    public WebElement pitcherButton;

    @FindBy(xpath = "(//button[text()='Join'])[4]")
    public WebElement batterButton;

    @FindBy(xpath = "(//button[text()='Join'])[5]")
    public WebElement teamManagerButton;

    @FindBy(css = "button.DonateTier_gatewayPayPal__CrA2_")
    public WebElement payPalButton;

    @FindBy(css = "button.DonateTier_gateway__BuaYh")
    public WebElement stripeButton;

    @FindBy(css = "button.DonateTier_gatewayCancel__fmGOu")
    public WebElement cancelOnetimeDonateButton;

    public DonationsPage(){
        PageFactory.initElements(driver,this);
    }
    public void oneTimeButtonClick(){
        ourFansButton.click();
    }
    public void onetimeDonatePayPal(){
        payPalButton.click();
    }
    public void onetimeDonateStripe(){
        stripeButton.click();
    }
    public void onetimeDonateCancel(){
        cancelOnetimeDonateButton.click();
    }

    public void catcherJoinButton(){
        catcherButton.click();
    }

    public void outfielderJoinButton(){
        outfielderButton.click();
    }

    public void pitcherJoinButton(){
        pitcherButton.click();
    }

    public void batterJoinButton(){
        batterButton.click();
    }

    public void teamManagerJoinButton(){
        teamManagerButton.click();
    }




}
