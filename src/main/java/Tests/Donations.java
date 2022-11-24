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


        Assert.assertEquals(true,basePage.loginButton.isDisplayed());
        basePage.openLoginPage();
        System.out.println("Step 1: Open the Base page and click Login button");

        Assert.assertEquals(true,loginAWSPage.loginField.isDisplayed());
        Assert.assertEquals(true,loginAWSPage.passwordField.isDisplayed());
        Assert.assertEquals(true,loginAWSPage.signInButton.isDisplayed());
        Assert.assertEquals(true,loginAWSPage.signInButton.isEnabled());
        loginAWSPage.auth();
        System.out.println("Step 2: fulfill login and password fields, click Sign in button");

        Assert.assertEquals(true,basePageLoggedIn.avatar.isDisplayed());
        basePageLoggedIn.avatarDropdownBox();
        System.out.println("Step 3: dropdown box is opened");

        Assert.assertEquals(true,basePageLoggedIn.donateButtonDropbox.isDisplayed());
        basePageLoggedIn.goToDonatePage();
        System.out.println("Step 4: donate page is opened");

        Assert.assertEquals(true,donationsPage.ourFansButton.isDisplayed());
        donationsPage.oneTimeButtonClick();
        System.out.println("Step 5: Click Donate at Our Fans");

        Assert.assertEquals(true,donationsPage.payPalButton.isDisplayed());
        Assert.assertEquals(true,donationsPage.stripeButton.isDisplayed());
        Assert.assertEquals(true,donationsPage.cancelOnetimeDonateButton.isDisplayed());
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

        Assert.assertEquals(true,basePage.loginButton.isDisplayed());
        basePage.openLoginPage();
        System.out.println("Step 1: Open the Base page and click Login button");

        Assert.assertEquals(true,loginAWSPage.loginField.isDisplayed());
        Assert.assertEquals(true,loginAWSPage.passwordField.isDisplayed());
        Assert.assertEquals(true,loginAWSPage.signInButton.isDisplayed());
        Assert.assertEquals(true,loginAWSPage.signInButton.isEnabled());
        loginAWSPage.auth();
        System.out.println("Step 2: fulfill login and password fields, click Sign in button");

        Assert.assertEquals(true,basePageLoggedIn.avatar.isDisplayed());
        //Assert.assertEquals(true,basePageLoggedIn.donateButtonDropbox.isDisplayed());
        basePageLoggedIn.goToDonatePage();
        System.out.println("Step 3: donate page is opened");

        Assert.assertEquals(true,donationsPage.ourFansButton.isDisplayed());
        donationsPage.onetimeDonateStripe();
        //Assert.assertEquals(true,donationsPage.payPalButton.isDisplayed());
        //Assert.assertEquals(true,donationsPage.stripeButton.isDisplayed());
        //Assert.assertEquals(true,donationsPage.cancelOnetimeDonateButton.isDisplayed());
        System.out.println("Step 4: Click Donate at Our Fans and choose type of donation by Stripe");


    }

    @Test
    public void onetimeDonateCancel(){
        System.out.println("Test #4: Work of the Cancel button in Onetime donation");
        BasePage basePage = new BasePage();
        LoginAWSPage loginAWSPage = new LoginAWSPage();
        BasePageLoggedIn basePageLoggedIn = new BasePageLoggedIn();
        DonationsPage donationsPage = new DonationsPage();

        Assert.assertEquals(true,basePage.loginButton.isDisplayed());
        basePage.openLoginPage();
        System.out.println("Step 1: Open the Base page and click Login button");

        Assert.assertEquals(true,loginAWSPage.loginField.isDisplayed());
        Assert.assertEquals(true,loginAWSPage.passwordField.isDisplayed());
        Assert.assertEquals(true,loginAWSPage.signInButton.isDisplayed());
        Assert.assertEquals(true,loginAWSPage.signInButton.isEnabled());
        loginAWSPage.auth();
        System.out.println("Step 2: fulfill login and password fields, click Sign in button");

        Assert.assertEquals(true,basePageLoggedIn.avatar.isDisplayed());
        //Assert.assertEquals(true,basePageLoggedIn.donateButtonDropbox.isDisplayed());
        basePageLoggedIn.goToDonatePage();
        System.out.println("Step 3: donate page is opened");

        Assert.assertEquals(true,donationsPage.ourFansButton.isDisplayed());
        donationsPage.onetimeDonateCancel();
        //Assert.assertEquals(true,donationsPage.payPalButton.isDisplayed());
        //Assert.assertEquals(true,donationsPage.stripeButton.isDisplayed());
        //Assert.assertEquals(true,donationsPage.cancelOnetimeDonateButton.isDisplayed());
        System.out.println("Step 4: Click Donate at Our Fans and click Cancel button");


    }
}
