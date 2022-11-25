package Tests;

import AlltennaWebPages.BasePage;
import AlltennaWebPages.BasePageLoggedIn;
import AlltennaWebPages.DonationsPage;
import AlltennaWebPages.LoginAWSPage;
import core.BaseAlltennaWebTest;
import org.junit.Assert;
import org.junit.Test;

public class Donations extends BaseAlltennaWebTest {
    @Test
    public void onetimeDonatePayPal(){
        System.out.println("Test #2: Onetime donation by PayPal");
        BasePage basePage = new BasePage();
        LoginAWSPage loginAWSPage = new LoginAWSPage();
        BasePageLoggedIn basePageLoggedIn = new BasePageLoggedIn();
        DonationsPage donationsPage = new DonationsPage();


        Assert.assertTrue(basePage.loginButton.isDisplayed());
        basePage.openLoginPage();
        System.out.println("Step 1: Open the Base page and click Login button");

        Assert.assertTrue(loginAWSPage.loginField.isDisplayed());
        Assert.assertTrue(loginAWSPage.passwordField.isDisplayed());
        Assert.assertTrue(loginAWSPage.signInButton.isDisplayed());
        Assert.assertTrue(loginAWSPage.signInButton.isEnabled());
        loginAWSPage.auth();
        System.out.println("Step 2: fulfill login and password fields, click Sign in button");

        Assert.assertTrue(basePageLoggedIn.avatar.isDisplayed());
        basePageLoggedIn.avatarDropdownBox();
        System.out.println("Step 3: dropdown box is opened");

        Assert.assertTrue(basePageLoggedIn.donateButtonDropbox.isDisplayed());
        basePageLoggedIn.goToDonatePage();
        System.out.println("Step 4: donate page is opened");

        Assert.assertTrue(donationsPage.ourFansButton.isDisplayed());
        donationsPage.oneTimeButtonClick();
        System.out.println("Step 5: Click Donate at Our Fans");

        Assert.assertTrue(donationsPage.payPalButton.isDisplayed());
        Assert.assertTrue(donationsPage.stripeButton.isDisplayed());
        Assert.assertTrue(donationsPage.cancelOnetimeDonateButton.isDisplayed());
        donationsPage.onetimeDonatePayPal();
        System.out.println("Step 6: Choose type of donation by PayPal");


    }

    @Test
    public void onetimeDonateStripe(){
        System.out.println("Test #3: Onetime donation by Stripe");
        BasePage basePage = new BasePage();
        LoginAWSPage loginAWSPage = new LoginAWSPage();
        BasePageLoggedIn basePageLoggedIn = new BasePageLoggedIn();
        DonationsPage donationsPage = new DonationsPage();

        Assert.assertTrue(basePage.loginButton.isDisplayed());
        basePage.openLoginPage();
        System.out.println("Step 1: Open the Base page and click Login button");

        Assert.assertTrue(loginAWSPage.loginField.isDisplayed());
        Assert.assertTrue(loginAWSPage.passwordField.isDisplayed());
        Assert.assertTrue(loginAWSPage.signInButton.isDisplayed());
        Assert.assertTrue(loginAWSPage.signInButton.isEnabled());
        loginAWSPage.auth();
        System.out.println("Step 2: fulfill login and password fields, click Sign in button");

        Assert.assertTrue(basePageLoggedIn.avatar.isDisplayed());
        basePageLoggedIn.avatarDropdownBox();
        System.out.println("Step 3: dropdown box is opened");

        Assert.assertTrue(basePageLoggedIn.donateButtonDropbox.isDisplayed());
        basePageLoggedIn.goToDonatePage();
        System.out.println("Step 4: donate page is opened");

        Assert.assertTrue(donationsPage.ourFansButton.isDisplayed());
        donationsPage.oneTimeButtonClick();
        System.out.println("Step 5: Click Donate at Our Fans");

        Assert.assertTrue(donationsPage.payPalButton.isDisplayed());
        Assert.assertTrue(donationsPage.stripeButton.isDisplayed());
        Assert.assertTrue(donationsPage.cancelOnetimeDonateButton.isDisplayed());
        donationsPage.onetimeDonateStripe();
        System.out.println("Step 6: Choose type of donation by Stripe");


    }

    @Test
    public void onetimeDonateCancel(){
        System.out.println("Test #4: Work of the Cancel button in Onetime donation");
        BasePage basePage = new BasePage();
        LoginAWSPage loginAWSPage = new LoginAWSPage();
        BasePageLoggedIn basePageLoggedIn = new BasePageLoggedIn();
        DonationsPage donationsPage = new DonationsPage();

        Assert.assertTrue(basePage.loginButton.isDisplayed());
        basePage.openLoginPage();
        System.out.println("Step 1: Open the Base page and click Login button");

        Assert.assertTrue(loginAWSPage.loginField.isDisplayed());
        Assert.assertTrue(loginAWSPage.passwordField.isDisplayed());
        Assert.assertTrue(loginAWSPage.signInButton.isDisplayed());
        Assert.assertTrue(loginAWSPage.signInButton.isEnabled());
        loginAWSPage.auth();
        System.out.println("Step 2: fulfill login and password fields, click Sign in button");

        Assert.assertTrue(basePageLoggedIn.avatar.isDisplayed());
        basePageLoggedIn.avatarDropdownBox();
        System.out.println("Step 3: dropdown box is opened");

        Assert.assertTrue(basePageLoggedIn.donateButtonDropbox.isDisplayed());
        basePageLoggedIn.goToDonatePage();
        System.out.println("Step 4: donate page is opened");

        Assert.assertTrue(donationsPage.ourFansButton.isDisplayed());
        donationsPage.oneTimeButtonClick();
        System.out.println("Step 5: Click Donate at Our Fans");

        Assert.assertTrue(donationsPage.payPalButton.isDisplayed());
        Assert.assertTrue(donationsPage.stripeButton.isDisplayed());
        Assert.assertTrue(donationsPage.cancelOnetimeDonateButton.isDisplayed());
        donationsPage.onetimeDonateCancel();
        Assert.assertTrue(donationsPage.ourFansButton.isDisplayed());
        System.out.println("Step 6: click Cancel button");
    }
    @Test
    public void donateCatcher(){
        System.out.println("Test #5: Donations: Catcher");
        BasePage basePage = new BasePage();
        LoginAWSPage loginAWSPage = new LoginAWSPage();
        BasePageLoggedIn basePageLoggedIn = new BasePageLoggedIn();
        DonationsPage donationsPage = new DonationsPage();

        Assert.assertTrue(basePage.loginButton.isDisplayed());
        basePage.openLoginPage();
        System.out.println("Step 1: Open the Base page and click Login button");

        Assert.assertTrue(loginAWSPage.loginField.isDisplayed());
        Assert.assertTrue(loginAWSPage.passwordField.isDisplayed());
        Assert.assertTrue(loginAWSPage.signInButton.isDisplayed());
        Assert.assertTrue(loginAWSPage.signInButton.isEnabled());
        loginAWSPage.auth();
        System.out.println("Step 2: fulfill login and password fields, click Sign in button");

        Assert.assertTrue(basePageLoggedIn.avatar.isDisplayed());
        basePageLoggedIn.avatarDropdownBox();
        System.out.println("Step 3: dropdown box is opened");

        Assert.assertTrue(basePageLoggedIn.donateButtonDropbox.isDisplayed());
        basePageLoggedIn.goToDonatePage();
        System.out.println("Step 4: donate page is opened");

        Assert.assertTrue(donationsPage.catcherButton.isDisplayed());
        donationsPage.catcherJoinButton();
        System.out.println("Step 5: Click Join button at Catcher");
    }
    @Test
    public void donateOutfielder(){
        System.out.println("Test #6: Donations: Outfielder");
        BasePage basePage = new BasePage();
        LoginAWSPage loginAWSPage = new LoginAWSPage();
        BasePageLoggedIn basePageLoggedIn = new BasePageLoggedIn();
        DonationsPage donationsPage = new DonationsPage();

        Assert.assertTrue(basePage.loginButton.isDisplayed());
        basePage.openLoginPage();
        System.out.println("Step 1: Open the Base page and click Login button");

        Assert.assertTrue(loginAWSPage.loginField.isDisplayed());
        Assert.assertTrue(loginAWSPage.passwordField.isDisplayed());
        Assert.assertTrue(loginAWSPage.signInButton.isDisplayed());
        Assert.assertTrue(loginAWSPage.signInButton.isEnabled());
        loginAWSPage.auth();
        System.out.println("Step 2: fulfill login and password fields, click Sign in button");

        Assert.assertTrue(basePageLoggedIn.avatar.isDisplayed());
        basePageLoggedIn.avatarDropdownBox();
        System.out.println("Step 3: dropdown box is opened");

        Assert.assertTrue(basePageLoggedIn.donateButtonDropbox.isDisplayed());
        basePageLoggedIn.goToDonatePage();
        System.out.println("Step 4: donate page is opened");

        Assert.assertTrue(donationsPage.outfielderButton.isDisplayed());
        donationsPage.outfielderJoinButton();
        System.out.println("Step 5: Click Join button at Outfielder");
    }

    @Test
    public void donatePitcher(){
        System.out.println("Test #7: Donations: Pitcher");
        BasePage basePage = new BasePage();
        LoginAWSPage loginAWSPage = new LoginAWSPage();
        BasePageLoggedIn basePageLoggedIn = new BasePageLoggedIn();
        DonationsPage donationsPage = new DonationsPage();

        Assert.assertTrue(basePage.loginButton.isDisplayed());
        basePage.openLoginPage();
        System.out.println("Step 1: Open the Base page and click Login button");

        Assert.assertTrue(loginAWSPage.loginField.isDisplayed());
        Assert.assertTrue(loginAWSPage.passwordField.isDisplayed());
        Assert.assertTrue(loginAWSPage.signInButton.isDisplayed());
        Assert.assertTrue(loginAWSPage.signInButton.isEnabled());
        loginAWSPage.auth();
        System.out.println("Step 2: fulfill login and password fields, click Sign in button");

        Assert.assertTrue(basePageLoggedIn.avatar.isDisplayed());
        basePageLoggedIn.avatarDropdownBox();
        System.out.println("Step 3: dropdown box is opened");

        Assert.assertTrue(basePageLoggedIn.donateButtonDropbox.isDisplayed());
        basePageLoggedIn.goToDonatePage();
        System.out.println("Step 4: donate page is opened");

        Assert.assertTrue(donationsPage.pitcherButton.isDisplayed());
        donationsPage.pitcherJoinButton();
        System.out.println("Step 5: Click Join button at Pitcher");
    }
    @Test
    public void donateBatter(){
        System.out.println("Test #8: Donations: Batter");
        BasePage basePage = new BasePage();
        LoginAWSPage loginAWSPage = new LoginAWSPage();
        BasePageLoggedIn basePageLoggedIn = new BasePageLoggedIn();
        DonationsPage donationsPage = new DonationsPage();

        Assert.assertTrue(basePage.loginButton.isDisplayed());
        basePage.openLoginPage();
        System.out.println("Step 1: Open the Base page and click Login button");

        Assert.assertTrue(loginAWSPage.loginField.isDisplayed());
        Assert.assertTrue(loginAWSPage.passwordField.isDisplayed());
        Assert.assertTrue(loginAWSPage.signInButton.isDisplayed());
        Assert.assertTrue(loginAWSPage.signInButton.isEnabled());
        loginAWSPage.auth();
        System.out.println("Step 2: fulfill login and password fields, click Sign in button");

        Assert.assertTrue(basePageLoggedIn.avatar.isDisplayed());
        basePageLoggedIn.avatarDropdownBox();
        System.out.println("Step 3: dropdown box is opened");

        Assert.assertTrue(basePageLoggedIn.donateButtonDropbox.isDisplayed());
        basePageLoggedIn.goToDonatePage();
        System.out.println("Step 4: donate page is opened");

        Assert.assertTrue(donationsPage.batterButton.isDisplayed());
        donationsPage.batterJoinButton();
        System.out.println("Step 5: Click Join button at Batter");
    }
    @Test
    public void donateTeamManager(){
        System.out.println("Test #9: Donations: TeamManager");
        BasePage basePage = new BasePage();
        LoginAWSPage loginAWSPage = new LoginAWSPage();
        BasePageLoggedIn basePageLoggedIn = new BasePageLoggedIn();
        DonationsPage donationsPage = new DonationsPage();

        Assert.assertTrue(basePage.loginButton.isDisplayed());
        basePage.openLoginPage();
        System.out.println("Step 1: Open the Base page and click Login button");

        Assert.assertTrue(loginAWSPage.loginField.isDisplayed());
        Assert.assertTrue(loginAWSPage.passwordField.isDisplayed());
        Assert.assertTrue(loginAWSPage.signInButton.isDisplayed());
        Assert.assertTrue(loginAWSPage.signInButton.isEnabled());
        loginAWSPage.auth();
        System.out.println("Step 2: fulfill login and password fields, click Sign in button");

        Assert.assertTrue(basePageLoggedIn.avatar.isDisplayed());
        basePageLoggedIn.avatarDropdownBox();
        System.out.println("Step 3: dropdown box is opened");

        Assert.assertTrue(basePageLoggedIn.donateButtonDropbox.isDisplayed());
        basePageLoggedIn.goToDonatePage();
        System.out.println("Step 4: donate page is opened");

        Assert.assertTrue(donationsPage.teamManagerButton.isDisplayed());
        donationsPage.teamManagerJoinButton();
        System.out.println("Step 5: Click Join button at TeamManager");
    }
}
